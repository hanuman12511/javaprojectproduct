package ProductControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import AdminDAO.Admindao;
import AdminDAO.Product_Cate;
import ConnectionDb.ConnectionDb;
import DAO.UserDAO;

public class ProductControl {


    ConnectionDb con =new ConnectionDb();
    String db ="productdb";
    private String productcate="product_category";
 
    public boolean ProductCate(Product_Cate pcate) {
        // UserDAO dao = new UserDAO();
    
        try {
               PreparedStatement ps =con.ConnectionData(db).prepareStatement("insert into "+ productcate+"(pro_cate_name, pro_cate_desc) values(?,?)");
               ps.setString(1, pcate.getProCateName());
               ps.setString(2, pcate.getProCateDesc());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    
    
    public boolean ProductCateUpdate(Product_Cate pcate) {
        // UserDAO dao = new UserDAO();
    
        try {
        	Connection com = con.ConnectionData(db);
        	
        	Statement stmt =com.createStatement();
        	ResultSet rs = stmt.executeQuery("select *from "+productcate +" where  category_id = "+pcate.getProCateId());
             while(rs.next()) {
             
            	 if(pcate.getProCateName().equals("")) {
            		 pcate.setName(rs.getString(1));
            		 
            	 }
            	 if(pcate.getProCateDesc().equals("")) {
            		 pcate.setDesc(rs.getString(2));
            	 }
            	 System.out.print(rs.getString(1));
             System.out.print(rs.getString(2));
             System.out.println();
             }
             
             
               PreparedStatement ps =com.prepareStatement("update "+ productcate+" set pro_cate_name =?, pro_cate_desc=? where category_id=? ");
               ps.setString(1, pcate.getProCateName());
               ps.setString(2, pcate.getProCateDesc());
               ps.setInt(3, pcate.getProCateId());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    
    public  void ProductCateShow() {
    	try {
    		Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 ResultSet rs = stmt.executeQuery("select *from "+productcate);
             while(rs.next()) {
             System.out.print(rs.getString(1));
             System.out.print(rs.getString(2));

             System.out.print(rs.getString(3));
             System.out.println();
       }
             
    	
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
    	  
    	
    	
    }
        
    
    public boolean  ProductCateDelete(int id) {
    	try {

        	Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 int i = stmt.executeUpdate("delete from "+ productcate +" where category_id= "+id);
        	
        	 if(i==1) {
        		 return true;
        	 }
        		
		} catch (Exception e) {
			
			 System.out.print("=="+e);
		       	// TODO: handle exception
		}
    	return false;
    }
    
    public boolean ProductName(Admindao admindao) {
        // UserDAO dao = new UserDAO();
        try {
               PreparedStatement ps =con.ConnectionData(db).prepareStatement("insert into "+productcate+"(name,email,pass) values(?,?,?)");
               ps.setString(1, admindao.getPName());
               ps.setInt(2, admindao.getPRate());
               ps.setInt(3, admindao.getPQty());
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
