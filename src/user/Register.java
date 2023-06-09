/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import ConnectionDb.InsertUserData;
import DAO.UserDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Register {
    InsertUserData iud =new InsertUserData();
    UserDAO dao = new UserDAO();
    Register(){

        System.out.println("register");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter id ");
        int id = sc.nextInt();
        System.out.println("Enter name ");
        String name = sc.next();
        System.out.println("Enter email ");
        String email = sc.next();
        System.out.println("Enter password ");
        String password = sc.next();
        dao.setName(name);
        dao.setEmail(email);
        dao.setPassword(password);
        try {
            if(iud.InsertRegister(dao)){
                System.out.println("login user");
            }
            else{
                System.out.println("not login");
            }
                    
           
        } catch (Exception e) {
        }
    }
}
