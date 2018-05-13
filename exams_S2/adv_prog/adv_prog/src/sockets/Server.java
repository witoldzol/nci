/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author eldrad
 */
public class Server {
    
    public static void main(String[] args) throws IOException {
        
        //create server socket
        ServerSocket serverSocket = new ServerSocket(8080, 10);
        //wait for connection with client
        Socket clientSocket = serverSocket.accept();
        
        //out
        //PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
        //in
        DataInputStream in = new DataInputStream(clientSocket.getInputStream());
        
        //out.writeBytes("hello there strange ! I will be your guide");
        
        try{
            
        
            while(true){
                String data = in.readUTF();
                System.out.println(data);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }   
    
}
