/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionDb;
import DAO.SelectDAO;
import user.Login;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
/**
 *
 * @author Admin
 */
public class SelectUserData {
    ConnectionDb con = new ConnectionDb();
    String db = "java5";
    //String userinfo = "userinfo";
    //String admin = "admin";
    String email;
    String password;
    
    public boolean SelectLogin(SelectDAO sdao){
        try{
            System.out.println(sdao.getEmail());
            Statement st = con.ConnectionData(db).createStatement();
            ResultSet rs = st.executeQuery("select *from userinfo where email='"+sdao.getEmail()+"' && pass='"+sdao.getPassword()+"'");
            System.out.println(rs);
          
             while(rs.next()) {
                 return true;
             }
        }
        catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
}
