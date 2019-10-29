/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.net.*;
import java.io.*;
import java.util.Date;
class GameServer {
    static int loop=0;
    static int counter=0;
    static int[] arr=new int[75];
    static int max=75;
    static int min=1;
    static int countmenu=0; 
    public static  void main(String args[]){
         GameServer frame=new GameServer();
     }
    public static int Call(DataOutputStream outputToClient) throws IOException{
     while (true){
                  int z;
                z=min+(int)(Math.random()*(max-min+1));
                if (check(z)){
                    return z;
                }   
     }
    }  
    static boolean check(int z){
        loop++;
        if(loop==1){
            arr[0]=z;
        }
        else{
            for(int i=0;i<25;i++){
                if(z==arr[i]){
                    return false;
                }
            }
            counter++;
            arr[counter]=z;
        }
        return true;
    }
     public GameServer(){
         try{
             ServerSocket serverSocket=new ServerSocket(8000);
             System.out.println(new Date()+":ServerStarted at 8000");
             int clientNo=1;
             while(true){
                 System.out.println(new Date()+":WAit for players");
                 Socket socket=serverSocket.accept();
                 System.out.println("Starting Thread for client no"+clientNo+"at"+new Date()+'\n');
                 InetAddress inetAddress=socket.getInetAddress();
                 System.out.println("CLient"+clientNo+"'s host name is"+inetAddress.getHostName()+"\n");
                 HandleAClient task=new HandleAClient(socket);
                 new Thread(task).start();
                 clientNo++;
             }
         }
         catch(IOException ex){
             System.err.println(ex);
         }
     }
     class HandleAClient implements Runnable{
        private Socket socket;
        public HandleAClient(Socket socket){
            this.socket=socket;
        }
        public void run(){
            try{
                DataOutputStream outputToClient=new DataOutputStream(socket.getOutputStream());
                
            }
            catch(IOException ex){System.err.println(ex);}
        }
    }
}
