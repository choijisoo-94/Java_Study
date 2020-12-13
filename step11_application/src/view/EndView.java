package view;

import java.util.ArrayList;

import model.domain.Customer;

public class EndView {

	public static void invalidateReq(String message) {
		System.out.println("�߻��� ���� : " + message);
	}
	public static void validateReq(String message) {
		System.out.println("���� ���� : " + message);
	}
	public static void viewCust(Customer cust) {
		System.out.println("�˻��� �� ���� : " + cust); //cust.toString()
	}
	
	public static void viewCustAll(ArrayList<Customer> all) {
		System.out.println("��� �� ����");
		for(Customer v : all) {
			System.out.println(v);
		}
	}
}