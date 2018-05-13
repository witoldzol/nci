/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author eldrad
 */
public class SaveToFile {
    
    
    
    public static void main(String[] args) throws Exception {
        
        Book b = new Book();
        
        FileOutputStream fileOut = new FileOutputStream("test.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        
        out.writeObject(b);
        
        System.out.println("serialization complete");
        
        FileInputStream fileIn = new FileInputStream("test.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        Book c;
        
        c = (Book) in.readObject();
        
        System.out.println("name is : " + c.getName() + " and pages are : " + c.getPages());
        
        
        
    }
    
}
