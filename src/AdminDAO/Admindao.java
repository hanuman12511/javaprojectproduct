package AdminDAO;

public class Admindao {
	private String pname;
	private int prate;
	private int pqty;
	
	public  Admindao(String pname,int prate,int pqty) {
		this.pname=pname;
		this.prate=prate;
		this.pqty=pqty;
		
	}
	
	
	public String getPName() {
		return pname;
	}
	public int getPRate() {
		return prate;
	}
	public int getPQty() {
		return pqty;
	}

}
