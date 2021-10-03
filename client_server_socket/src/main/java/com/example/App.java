package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Client_socket cliente = new Client_socket();
        cliente.connetti();
        cliente.comunica();
        Server_socket servente = new Server_socket();
        servente.attendi();
        servente.comunica();
    }
}
