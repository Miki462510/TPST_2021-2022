package com.example;
import java.io.*;
import java.net.*;
import java.util.zip.DataFormatException;

public class Client_socket {
    String nomeServer = "nomeserver"; //il nome
    int portaServer= 6789; //la porta
    Socket mioSocket;
    BufferedReader tastiera;
    String stringaUtente;
    String stringaRicevutadalserver;
    BufferedReader in; //stream input
    DataOutputStream out; //stream output

    
    public void comunica(){
        try
        {
            System.out.println("4 ... inserisci la stringa da trasmettere al server"+'\n');
            stringaUtente = tastiera.redLine();
            //spedisco al server
            System.out.println("5 ... invio la stringa al server e attendo ... );
            outVersoServer.writeBytes ( stringaUtente+'\n');
            //leggo la risposta del server 
            stringaRicevutaDalServer=inDalServer.redLine();
            System.out.println("8 ... risposta del server"+ '\n' +stringaRicevutaDalServer);
            //chiudo connessione
            System.out.println("9 CLIENT: termina elaborazione e chiude connesione");
            mioSocket.close();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Errore durante la comunicazione col server!");
            System.exit(l);
        }
    }
    
    
    
    
    
    
    public Socket connetti (){
        
        
        
        
        
        
        
        
        
        
        
        
        
        return mioSocket;        
    }
}
