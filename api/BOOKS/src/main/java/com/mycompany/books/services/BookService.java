/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.books.services;

import com.mycompany.books.model.BookModel;
import java.util.*;

/**
 *
 * @author esu
 */
public class BookService {
    //array list 
    public static List<BookModel> list = new ArrayList<>();
    
    
        
        
    //method that returns all books
    public List<BookModel> getAllBooks(){
        
        BookModel b1 = new BookModel(1,"Mopy Dik", "Michael Jackson", "Oasis");
        BookModel b2 = new BookModel(2, "The one that got away", "Nancy Whatshername", "Penguin");
        BookModel b3 = new BookModel(3, "Crime and Punishment", "Dostoyevsky", "BestBooksEver");
        
        //add books if list is empty
        if(list.size() == 0){
            
            list.add(b1);
            list.add(b2);
            list.add(b3);
        
        }
        return list;
        
    }
    
    //method for returning individual book records
    public BookModel getBook(int id){
        return list.get(id-1);
    }

    public int size() {
        return list.size();
    }
    
    public void createBook(int s, String t, String a, String p){
        BookModel b = new BookModel(s,t,a,p);
        list.add(b);
    }
    
    public boolean removeBook(int id){
        
        for(BookModel b : list){
            if(b.getId() == id){
                list.remove(b);
                return true;
            }
        }
        return false;
    }
    
}