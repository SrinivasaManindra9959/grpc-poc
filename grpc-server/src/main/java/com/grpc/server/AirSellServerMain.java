package com.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;

@SpringBootApplication(scanBasePackages = {"com.grpc.*"})
@Slf4j
public class AirSellServerMain {

    public static void main(String[] args) throws InterruptedException, IOException {
        SpringApplication.run(AirSellServerMain.class, args);
        log.debug("Main method starts");
        Server server = ServerBuilder.forPort(9000).addService(new SellServer()).build();
        server.start();
        System.out.println("Server port" + server.getPort());
        server.awaitTermination();
    }
}
