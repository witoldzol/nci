/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.books.resources;

import com.mycompany.books.model.BookModel;
import com.mycompany.books.services.BookService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jackson.map.ObjectMapper;

@Path("/books")
public class BookResource {
    
    BookService bs = new BookService();
    
    
    //json
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BookModel> getMessagesJSON(){
        return bs.getAllBooks();
    }
    
    //xml
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<BookModel> getMessagesXML(){
        return bs.getAllBooks();
    }
    //json 
    
    @GET
    @Path("/{bookId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMessageJSON(@PathParam("bookId") int id){
        if(id > bs.size()  ){
            
            return Response.status(Response.Status.NOT_FOUND).entity("Book not found").build();
            
        } else {
               
               return Response.ok(bs.getBook(id), MediaType.APPLICATION_JSON).build();
        }
    }
    
    //xml
    @GET
    @Path("/{bookId}")
    @Produces(MediaType.APPLICATION_XML)
    public Response getMessageXML(@PathParam("bookId") int id){
        if(id > bs.size()){
            
            return Response.status(Response.Status.NOT_FOUND).entity("Book not found").build();
            
        } else {
        
             return Response.ok(bs.getBook(id), MediaType.APPLICATION_XML).build();
        }    
    }
    
    // create book
    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBook( BookModel book ){
        
        String a = book.getAuthor();
        String t = book.getTitle();
        String p = book.getPublisher();
        
        bs.createBook(bs.size(), t, a, p);
        
        String out = " -------- Book has been added. Thank you! \n Author: " + book.getAuthor() + " , Title: " + book.getTitle() + " , Publisher: " + book.getPublisher() + " , URI: /api/books/" + (bs.size()-1);
        
        return Response.status(200).entity(out).build();
    }
    
    //delete book
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remove/{id}")
    public Response removeBook(@PathParam("id") int id){
        
        boolean result = bs.removeBook(id);
        
        if(result){
            String out = " -------- Book, with id of : " + id + " has been removed. Thank you! ";
            return Response.status(200).entity(out).build();
        } else {
            String out = " -------- Something went wrong" + id + " has NOT been removed. Thank you! ";
            return Response.status(200).entity(out).build();
   
        }
    }
}

