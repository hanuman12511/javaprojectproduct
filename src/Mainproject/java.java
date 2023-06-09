/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainproject;

import user.User;
import java.util.*;
        
public class java {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Enter 'register' for register\n2. enter 'login' for login\n3 enter 'yes' for logout  ");
        String name = sc.next();
        if(!name.equals("yes")){
            User u=new User(name);
        }
        else{
            break;
        }
        }
       
    }
}
