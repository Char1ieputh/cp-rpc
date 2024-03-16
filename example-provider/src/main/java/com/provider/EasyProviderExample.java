package com.provider;

import com.service.UserService;
import longrpc.server.HttpServer;
import longrpc.server.VertxHttpServer;


public class EasyProviderExample {
    public static void main(String[] args){
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);

//                //启动web服务
//                com.sun.net.httpserver.HttpServer httpServer =  new VertxHttpServer();
//        ((VertxHttpServer) httpServer).doStart(8080);



    }
}
