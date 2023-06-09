/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author Admin
 */
public class User {
    public  User(String name ){
        System.out.println("user data "+name);
        if(name.equals("register")){
            Register r =new Register();
            
        }
        else if(name.equals("login")){
            
            Login l =new Login();
        }
        else{
            System.out.println("not"+name);
        }
    }
}
