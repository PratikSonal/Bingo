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
public class Client {
    public static void main(String...args) throws Exception{
        Socket c=new Socket(InetAddress.getLocalHost(),12345);
        System.out.println("Connected to Server");
        Game g1=new Game();
    }
}
