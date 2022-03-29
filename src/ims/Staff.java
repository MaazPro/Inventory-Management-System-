/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

public class Staff {
    
    private String user_name,first_name,last_name,gender,address,password;
    private int age,phone_number;
    Staff(String USER_NAME, String FIRST_NAME, String LAST_NAME,int AGE ,String GENDER, String ADDRESS, int PHONE_NUMBER, String PASSWORD ){
    
    this.user_name = USER_NAME;
    this.first_name = FIRST_NAME;
    this.last_name = LAST_NAME;
    this.age = AGE; // int
    this.gender = GENDER;
    this.address = ADDRESS;
    this.phone_number = PHONE_NUMBER; // int
    this.password = PASSWORD;
    
    }
    
    public String getUserName(){
    
    return (user_name);
    }
    
    public String getFirstName(){
    
    return (first_name);
    }
    
    public String getLastName(){
    
    return (last_name);
    }
    
    public int getAge(){
    
    return (age);
    }
    
    public String getGender(){
    
    return (gender);
    }
    
    public String getAddress(){
    
    return (address);
    }
    
    public int getPhoneNumber(){
    
    return (phone_number);
    }
    
    public String getPassword(){
    
    return (password);
    }
    
}
