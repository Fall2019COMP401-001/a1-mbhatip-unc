package a1;

import java.util.*;

public class Customer {
	private Item[] _Items;
	private String _fname;
	private String _lname;
	
	public Customer(String fname, String lname, Item[] Items) {
		_fname = fname;
		_lname = lname;
		_Items = Items;
	}

	public double getTotal() {
		double sum = 0;
		for (Item i : _Items) {
			sum += i.getTotal();
		}
		return sum;
	}
	
	public void addItem(Item newItem) {
		Item[] newItems = new Item[_Items.length + 1];
		for (int i = 0; i < _Items.length; i++) {
			newItems[i] = _Items[i];
		}
		newItems[newItems.length - 1] = newItem;
		_Items = newItems;
	}
	
	public Item[] getItems() {
		return _Items;
	}
	
	public String getFullname() {
		return _fname + " "+ _lname;
	}
	
	public String getFirstname() {
		return _fname;
	}
	
	public String getLastname() {
		return _lname;
	}
}
