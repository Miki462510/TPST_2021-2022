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
            for(;;){
                System.out.println("4 ...  utente, inserisci la stringa da trasmettere al server:");
                stringaUtente = tastiera.readLine();
                //la spedisco al server
                System.out.println("5 ... invio la stringa al server e attendo ...");
                out.writeBytes(stringaUtente+'\n');
                //leggo la risposta del server
                stringaRicevutadalserver=in.readLine();
                System.out.println("7 ... risposta dal server "+ '\n'+stringaRicevutadalserver);
                if (stringaUtente.equals("FINE")){
                    System.out.println("8 CLIENT: termina elaborazione e chiude connesione");
                    mioSocket.close();
                    break;
                }
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Errore durante la comunicazione col server!");
            System.exit(1);
        }
    }
 
    public Socket connetti (){
        System.out.println("2 CLIENT partito in esecuzione ...");
        try{
            //per l'imput da tastiera 
            tastiera = new BufferedReader(new InputStreamReader(System.in));
            //creo un socket
            //miosocket = new Socket(InetAddress.getLocalHost(), 6789);
            mioSocket = new Socket(nomeServer,portaServer);
            //associo due oggetti al mio socket per effettuare la scittura e la lettura
            out = new DataOutputStream(mioSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()));
        } catch (UnknownHostException e){
            System.err.println("Host sconosciuto");
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Errore durante la connessione!");
            System.exit(1);
        }
     
        return mioSocket;        
    }
}
