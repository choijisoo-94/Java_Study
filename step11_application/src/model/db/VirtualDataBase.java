//database�� ����

package model.db;

import java.util.ArrayList;

import model.domain.Customer;

public class VirtualDataBase {

		private static ArrayList<Customer> all = new ArrayList<>();
		
		//�� ���� ����
		static {
			all.add(new Customer("�ٿ�", 10, "vvip"));
			all.add(new Customer("��", 20, "vvip"));
			all.add(new Customer("��ȣ", 16, "vvip"));
			all.add(new Customer("�߱�", 16, "vvip"));
		}
		//�� ����
		public static ArrayList<Customer> getCustomers(){
			return all;
		}
	}


