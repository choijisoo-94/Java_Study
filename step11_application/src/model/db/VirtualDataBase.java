//database로 간주

package model.db;

import java.util.ArrayList;

import model.domain.Customer;

public class VirtualDataBase {

		private static ArrayList<Customer> all = new ArrayList<>();
		
		//고객 정보 저장
		static {
			all.add(new Customer("다영", 10, "vvip"));
			all.add(new Customer("희성", 20, "vvip"));
			all.add(new Customer("성호", 16, "vvip"));
			all.add(new Customer("중기", 16, "vvip"));
		}
		//고객 제공
		public static ArrayList<Customer> getCustomers(){
			return all;
		}
	}


