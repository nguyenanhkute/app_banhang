/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.value;

/**
 *
 * @author N
 */
public class chart_DAO {
    public ArrayList<value> getAll() {
        try {
            CategoryDAO categoryDAO = new CategoryDAO();
            ProductDAO productDAO = new ProductDAO();
            ArrayList<value> list = new ArrayList<>();
            for (Category category : categoryDAO.getListTypeName()) {
                list.add(new value(category.getCategoryName(),
                        productDAO.getListProductByCategory(category.getCategoryID()).size()));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ChartDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
        for(value c : new chart_DAO().getAll())
            System.out.println(c.getName()+" - "+c.getValue());
    }
}
