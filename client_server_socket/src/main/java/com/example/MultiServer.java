package com.example;

import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
    public void start(){
try{
    ServerSocket serverSocket = new ServerSocket(6789);
    for(;;){
        System.out.println("1 Server in attesa ...");
        Socket socket = serverSocket.accept();
        System.out.println("3 Server socket " + socket);
        Server_thread server_thread = new Server_thread(socket);
        server_thread.start();
    }
}
catch (Exception e){
    System.out.println(e.getMessage());
    System.out.println("Errore durante l'istanza del server !");
    System.exit(1);
}
}
}
