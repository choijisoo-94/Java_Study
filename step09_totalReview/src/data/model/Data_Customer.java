package data.model;

import object.domain.CustomerDTO;


public class Data_Customer {
	
	public static CustomerDTO[] getCustomer() {
		CustomerDTO [] all = {new CustomerDTO("yaj", "0011", "silver","oily skin"), 
					new CustomerDTO("jjw", "0022", "member","combination skin"),
					new CustomerDTO("ljm", "0033","vip","dry skin"), 
					new CustomerDTO("cjs", "0044","nonmember","sensitive skin")}; 
		
		return all;
	}
}



