package com.grpc.client;

import com.grpc.stub.Airsell;
import com.grpc.stub.SellGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication(scanBasePackages = {"com.grpc.*"})
public class AirSellClientMain {

    public static void main(String[] args) {
        SpringApplication.run(AirSellClientMain.class, args);
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9000).
                usePlaintext().build();
        SellGrpc.SellBlockingStub sell = SellGrpc.newBlockingStub(channel);
        Airsell.SellRequest request = Airsell.SellRequest.newBuilder().setId(1).setSellType("DCS")
                .setIsDcs(true).setIsHosted(false).build();
        Long timeout = Constant.timeout;
        try {
            Airsell.SellResponse response1 =
                    sell.withDeadlineAfter(timeout, TimeUnit.MILLISECONDS)
                            .createSell(request);
            System.out.println("Create sell response" + response1.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Create sell>>>Error occurred due to " + e.getMessage());
        }
        try {
            Airsell.SellResponse response2 =
                    sell.withDeadlineAfter(timeout, TimeUnit.MILLISECONDS)
                            .updateSell(request);
            System.out.println("Update Sell response" + response2.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Update Sell>>>Error occurred due to " + e.getMessage());
        }
        try {
            Airsell.SellResponse response3 =
                    sell.withDeadlineAfter(timeout, TimeUnit.MILLISECONDS).
                            getSells(Airsell.Empty.newBuilder().build());
            System.out.println("Get sells response" + response3.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Get sells>>>Error occurred due to " + e.getMessage());
        }


    }

}
