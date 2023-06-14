package AdminFolder;

import java.util.Scanner;

import AdminDAO.Product_Cate;
import ProductControl.ProductControl;

public class ProductCate {
	public ProductCate(){
		Scanner sc=new Scanner(System.in);
		
		ProductControl pc =new ProductControl();
		while(true) {
			System.out.print("1 enter for add 'p_cate' and \n2 for show 'p cate' \n3 for break");
			int ch = sc.nextInt();
			if(ch==1) {
				
				System.out.print("Enter product_cate_name , product_cate_desc, create_date");
			String p = sc.next();
			String d=sc.next();
			Product_Cate pcate = new Product_Cate(p,d,"","");
		
		if(pc.ProductCate(pcate))
		{
			System.out.println("pro_cate inserted ");
			
			}
		}
		else if(ch == 2) {
			System.out.print("Product_cate_show ");
			System.out.println("********************** ");
			pc.ProductCateShow();
			System.out.println("********************** ");
			
		}
		else if(ch==3) {
				break;
		}
	}
	}

}
