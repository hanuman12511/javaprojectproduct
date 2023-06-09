
package user;

import ConnectionDb.SelectUserData;
import DAO.SelectDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import AdminFolder.AdminClass;
import CustomerFolder.CustomerClass;

/**
 *
 * @author Admin
 */
public class Login {
    
    SelectUserData sud = new SelectUserData();
    SelectDAO sdao = new SelectDAO();

    public Login() {
        System.out.println("login");
          Scanner sc= new Scanner(System.in);
       
        System.out.println("Enter email ");
        String email = sc.next();
        System.out.println("Enter password ");
        String password = sc.next();
        
        sdao.setEmail(email);
        sdao.setPassword(password);
         try {
             
             if(sud.SelectLogin(sdao)){
                 System.out.println("Enter 1 for admin, 2 for customer, 3 for logout");
         int ss = sc.nextInt();
         if(ss == 1){
            AdminClass ac = new AdminClass();
            ac.a1();
         }
         else if(ss == 2){
             CustomerClass cc = new CustomerClass();
             cc.c1();
         }
         else{
             System.out.println("try again");
         }
             }
             else{
                 System.out.println("not verified");
             }
             
            
        } catch (Exception e) {
        }
        
         
    }
    
    
    
}
