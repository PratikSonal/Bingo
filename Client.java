/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.io.*;
import java.net.*;
class Client {
    public static int rand;
    private DataInputStream fromServer;
    public Client(){
        try{
            System.out.println("Hello");
            Socket socket=new Socket("localhost",8000);
            System.out.println("Hello");
            
            FinalGame f1=new FinalGame();
            f1.setVisible(true);
        }
        catch(IOException ex){System.err.println(ex);}
    }
}


