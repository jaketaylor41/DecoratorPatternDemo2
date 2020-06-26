package source;

public interface Product {
	
	
	public void setLabel(String label);
	public void setPrice(double price);
	public String getLabel();
	public double getPrice();
	
	//method which the decorator implements to add its discounting behavior
	public String generateLabel();
	
	

}
