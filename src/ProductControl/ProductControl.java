package ProductControl;

import java.sql.PreparedStatement;

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
