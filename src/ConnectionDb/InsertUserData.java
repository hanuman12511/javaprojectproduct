/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionDb;

import DAO.UserDAO;
import java.sql.PreparedStatement;
import user.Login;

/**
 *
 * @author Admin
 */
public class InsertUserData {
    ConnectionDb con =new ConnectionDb();
    String db ="java5";
    String userInfo ="userInfo";
    String admin ="admin";
 
    public boolean InsertRegister( UserDAO dao){
        // UserDAO dao = new UserDAO();
        try {
               PreparedStatement ps =con.ConnectionData(db).prepareStatement("insert into "+userInfo+"(name,email,pass) values(?,?,?)");
               ps.setString(1, dao.getName());
               ps.setString(2, dao.getEmail());
               ps.setString(3, dao.getPassword());
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
}
