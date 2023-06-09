package AdminFolder;

import java.util.Scanner;

import AdminDAO.Product_Cate;
import ProductControl.ProductControl;

public class ProductCate {
	public ProductCate(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter product_cate_name , product_cate_desc, create_date");
		String p = sc.next();
		String d=sc.next();
		Product_Cate pcate = new Product_Cate(p,d,"","");
		ProductControl pc =new ProductControl();
		if(pc.ProductCate(pcate)) {
			System.out.print("pro_cate inserted ");
		}
	}

}
