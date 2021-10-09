package com.example;

public class App_cliente
{
    public static void main( String[] args )
    {
        Client_socket cliente = new Client_socket();
        cliente.connetti();
        cliente.comunica();
    }
}

