package AdminDAO;

public class Product_Cate {
	  private int id;
	private String pro_cate_name; 
	private String pro_cate_desc ;
	 private String created_at;  
private String deleted_at;
public Product_Cate(int id,String pro_cate_name,String pro_cate_desc,String created_at,String deleted_at){
	this.pro_cate_name=pro_cate_name; 
	this.pro_cate_desc =pro_cate_desc;
	 this.created_at=created_at;  
 this.deleted_at=deleted_at;
 this.id=id;
}


public void setName(String pro_cate_name) {
	this.pro_cate_name=pro_cate_name;
}
public void setDesc(String pro_cate_desc) {
	this.pro_cate_desc=pro_cate_desc;
}
public int getProCateId() {
	return id;
}

public String getProCateName() {
	return pro_cate_name;
}
public String getProCateDesc() {
	return pro_cate_desc;
}
public String getCreatedAt() {
	return created_at;
}
public String getDeletedAt() {
	return deleted_at;
}

}
 