package com.grpc.server;

import com.grpc.stub.Airsell;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import com.grpc.stub.SellGrpc;

@GRpcService
public class SellServer extends SellGrpc.SellImplBase {

    @Override
    public void createSell(Airsell.SellRequest request, StreamObserver<Airsell.SellResponse> responseObserver) {
        System.out.println("Inside create sell");
        String sellType = request.getSellType();
        Airsell.SellResponse.Builder response = Airsell.SellResponse.newBuilder();
        response.setIsDcs(request.getIsDcs() == true ? "YES" : "NO");
        response.setIsHostedCarrier(request.getIsHosted() == true ? "YES" : "NO");
        if (sellType.equalsIgnoreCase("DCS")) {
            System.out.println("DCS Sell CREATED Successfully");
            response.setResponseStatus("Success_Dcs");
            response.setSellStatus(200);
        } else if (sellType.equalsIgnoreCase("NON_DCS")) {
            System.out.println("NON DCS Sell CREATED Successfully");
            response.setResponseStatus("Success_Non_dcs");
            response.setSellStatus(200);
        } else {
            System.out.println("NON DCS Sell CREATION Failed");
            response.setResponseStatus("Failed_Non_dcs");
            response.setSellStatus(500);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateSell(Airsell.SellRequest request, StreamObserver<Airsell.SellResponse> responseObserver) {
        System.out.println("Inside update sell");
        String sellType = request.getSellType();
        Airsell.SellResponse.Builder response = Airsell.SellResponse.newBuilder();
        response.setIsDcs(request.getIsDcs() == true ? "YES" : "NO");
        response.setIsHostedCarrier(request.getIsHosted() == true ? "YES" : "NO");
        if (sellType.equalsIgnoreCase("DCS")) {
            System.out.println("DCS Sell UPDATED Successfully");
            response.setResponseStatus("Success_Dcs");
            response.setSellStatus(200);
        } else if (sellType.equalsIgnoreCase("NON_DCS")) {
            System.out.println("NON DCS Sell UPDATED Successfully");
            response.setResponseStatus("Success_Non_dcs");
            response.setSellStatus(200);
        } else {
            System.out.println("NON DCS Sell UPDATION Failed");
            response.setResponseStatus("Failed_Non_dcs");
            response.setSellStatus(500);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getSells(Airsell.Empty request, StreamObserver<Airsell.SellResponse> responseObserver) {
        System.out.println("Inside det All sells");
        Airsell.SellResponse.Builder response = Airsell.SellResponse.newBuilder();
        Airsell.SellRequest.Builder sellRequest = Airsell.SellRequest.newBuilder();
        for (int i = 0; i <= 5; i++) {
            response.addStreamData(Airsell.SellRequest.newBuilder()
                    .setId(i).setSellType("DCS").setIsHosted(true).setIsDcs(true).build());
        }

        response.setSellStatus(200);
        response.setResponseStatus("Success");
        response.setIsDcs("YES");
        response.setIsHostedCarrier("NO");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
