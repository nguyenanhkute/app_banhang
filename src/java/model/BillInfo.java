/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nguyen
 */
public class BillInfo {
    
   
    private String productID;
   
    private int quantity;
    
    

    public BillInfo() {
    }

    public BillInfo( String productID,  int quantity) {
        
        this.productID = productID;
      
        this.quantity = quantity;
    }
   
    

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

   

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
