/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;


public class Receipt {
    
    private int invoice_id, quantity ;
    private float price, net_amount, discount, cash_paid, cash_back;
    private String invoice_date, client_name, counter, payment_detail, operator;
    
    Receipt (int INVOICE_ID,float PRICE,int QUANTITY,String INVOICE_DATE,String CLIENT_NAME,String COUNTER,String PAYMENT_DETAIL,float NET_AMOUNT,float DISCOUNT,float CASH_PAID,float CASH_BACK,String OPERATOR){
    
    this.invoice_id = INVOICE_ID;
    this.price = PRICE;
    this.quantity = QUANTITY;
    this.invoice_date = INVOICE_DATE;
    this.client_name = CLIENT_NAME;
    this.counter = COUNTER;
    this.payment_detail =  PAYMENT_DETAIL;
    this.net_amount = NET_AMOUNT;
    this.discount = DISCOUNT;
    this.cash_paid = CASH_PAID;
    this.cash_back = CASH_BACK;
    this.operator = OPERATOR;
    }
    
    public int getInvoice_id(){
    
        return (invoice_id);
    }
    public float getPrice(){
    
        return(price);
    }
    public int getQuantity(){
    
       return (quantity);
    }
    public String getInvoice_date(){
        
        return (invoice_date);
    }
    public String getClient_name(){
    
        return (client_name);
    }
    public String getCounter(){
    
        return (counter);
    }
    public String getPayment_detail(){
    
        return (payment_detail);
    }
    public float getNet_amount(){
    
        return (net_amount);
    }
    public float getDiscount(){
    
        return (discount);
    }
    public float getCash_paid(){
    
        return (cash_paid);
    }
    public float getCash_back(){
    
        return (cash_back);
    }
    public String getOperator(){
    
        return (operator);
    }
    
}
