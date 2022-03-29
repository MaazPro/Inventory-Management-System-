/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

public class Item {
    
   private int id, quantity ;
   private String name , date;
   private float price;
   private byte[] image;
   
   public Item (int ID, String NAME ,float PRICE ,String DATE, int QUANTITY, byte [] IMAGE ){
   
       this.id = ID;
       this.name = NAME;
       this.price = PRICE;
       this.date = DATE;
       this.quantity = QUANTITY;
       this.image = IMAGE;
   }
public Item(){
}
    
   
   public int getId(){
   
       return(id);
   }
   
   public String getName(){
   
       return (name);
   }
   
   public Float getPrice(){
       
       return (price);
   }
   
   public String getDate(){
       
       return (date);
   }
   
   public int getQuantity(){
   
       return(quantity);
   }
   
   public byte[] getImage(){
   
       return (image);
   }
 
    
}
