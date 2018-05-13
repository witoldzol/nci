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
import java.net.Socket;

/**
 *
 * @author eldrad
 */
public class Client {
    
    public static void main(String[] args) throws IOException {
        //create socket
        Socket client = new Socket("localhost", 8080);
        
        //out
        DataOutputStream out = new DataOutputStream(client.getOutputStream());
        
        //in
        DataInputStream in = new DataInputStream(client.getInputStream());
        
        String str = "first string";
        String s2 = "second string";
        String s3 = "last string";
        
        String[] arr = {str,s2,s3};
        try{
            for (String string : arr) {
                out.writeUTF(string);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
            
        
    }
    
    
}
