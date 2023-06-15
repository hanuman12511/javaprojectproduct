package AdminFolder;

import java.util.Scanner;

import AdminDAO.Product_Cate;
import ProductControl.ProductControl;

public class ProductCate {
	public ProductCate(){
		Scanner sc=new Scanner(System.in);
		
		ProductControl pc =new ProductControl();
		while(true) {
			System.out.print("1 enter for add 'p_cate' and \n2 for show 'p cate' \n3 for break\n4 pro_cate delete\n5 update");
			int ch = sc.nextInt();
		if(ch==1) {
				
					System.out.print("Enter product_cate_name , product_cate_desc, create_date");
					String p = sc.next();
					String d=sc.next();
					Product_Cate pcate = new Product_Cate(0,p,d,"","");
				
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
		
		
		else if(ch ==4) {
			
			System.out.println("Product_cate_Delete  enter id");
			System.out.println("********************** ");
			int id = sc.nextInt();
			if(pc.ProductCateDelete(id)) {
				System.out.println("********* delete *************");
			}
		}
		
		else if(ch ==5) {
			String p="";
			String d="";
			System.out.print("Enter update product id");
			int id = sc.nextInt();
			System.out.print("update product_cate_name  'yes' or  'no'");
			if(sc.next().equalsIgnoreCase("yes")) {
				System.out.print("enter product cate name");

				p = sc.next();		
			}

			System.out.print("update product_desc  'yes' or  'no'");
			if(sc.next().equalsIgnoreCase("yes")) {
				System.out.print("enter product cate desc");
					d=sc.next();
				}
			Product_Cate pcate = new Product_Cate(id,p,d,"","");
		
			if(pc.ProductCateUpdate(pcate))
			{
				System.out.println("pro_cate Updated ");
	
			}
		}
	}
	}

}
