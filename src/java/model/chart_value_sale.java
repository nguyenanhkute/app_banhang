/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author N
 */
public class chart_value_sale {
    private String categoryID;
    private int sumcount;

    public chart_value_sale(String categoryID, int sumcount) {
        this.categoryID = categoryID;
        this.sumcount = sumcount;
    }

    public chart_value_sale() {
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public int getSumcount() {
        return sumcount;
    }

    public void setSumcount(int sumcount) {
        this.sumcount = sumcount;
    }

    @Override
    public String toString() {
        return categoryID ;
    }
    
}
