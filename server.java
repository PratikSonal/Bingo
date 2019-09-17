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
public class server {
    public static void main(String...args)throws Exception{
        ServerSocket ss=new ServerSocket(12000);
        Socket s=ss.accept();
        System.out.println("Connected to client");
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String z=br.readLine();
        System.out.println("From client:"+z);
        br.close();
    }
}
 