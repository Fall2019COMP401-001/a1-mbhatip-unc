package a1;

public class Item {
	private String _name;
	private double _price;
	private int _quantity;
	
	public Item(String name, double price, int quantity) {
		_name = name;
		_price = price;
		_quantity = quantity;
	}
	
	public String getName() {
		 return _name;
	}
	public double getPrice() {
		return _price;
	}
	
	public int getQuantity() {
		return _quantity;
	}
	
	public void setQuantity(int quantity) {
		_quantity = quantity;
	}
	
	public double getTotal() {
		return _price * (double) _quantity;
	}
	 
}
