/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connect.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.chart_value_sale;

/**
 *
 * @author N
 */
public class ChartDAO {
    public ArrayList<chart_value_sale> getListChart()
    {
        Connection connection = SQLConnection.getConnection();
        ArrayList<chart_value_sale> list= new ArrayList<>();
        String sql="EXEC THONGKE_BANHANG";
        try {
            String maLSP="";
            int tongSL;
            PreparedStatement ps= connection.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next())
            {
                maLSP=rs.getString("MaLoaiSP") ;
                tongSL= rs.getInt("tongSL");
                chart_value_sale chart= new chart_value_sale(maLSP,tongSL);
                list.add(chart);
            }
            connection.close();
            return list;
        } catch (SQLException e) {
            Logger.getLogger(ChartDAO.class.getName()).log(Level.SEVERE,null,e);
            return null;
        }
        
    }
    public static void main(String[] args) {
        for(chart_value_sale c : new ChartDAO().getListChart())
            System.out.println(c.getCategoryID()+" - "+c.getSumcount());
    }
}
