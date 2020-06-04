/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hema-PC
 */
public class Myfun {
    
    public static int countData(String tableName) throws SQLException
    {
        int total=0;
        Connection con = Myconnection.getConnection();
        Statement st ;
        
        try {
            st = con.createStatement();
            ResultSet rs=st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+tableName);
            while(rs.next())
            {
                total=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Myfun.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
        
    }
  
}
