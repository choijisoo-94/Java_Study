package step01.util;

import java.util.ArrayList;

import model.domain.Car;
import model.domain.Customer;

/* ��ü �����̶�  
 * 
 */
public class ListTest3 {
	// Customer���� ArrayList�� �����ؼ� ��ȯ : db�κ��� select�ؼ� ��ȯ
	public static ArrayList<Customer> getDatas() {
		ArrayList<Customer> all = new ArrayList<>();

		all.add(Customer.builder().name("������").build());
		all.add(Customer.builder().name("����").build());
		all.add(Customer.builder().name("��â��").build());

		all.add(Customer.builder().car(new Car("�׷���", 77)).name("����").build());

		return all;
	}

	// ArrayList�� ����� Customer ��ü���� �޾Ƽ� ��� : �������� ��� ���
	// html/css/java script...���� ���ߵǴ� ȭ��

	public static void print(ArrayList<Customer> all) {

		for (Customer v : all) {
			System.out.println(v.getName());
		}

	}

	public static void main(String[] args) {
		print(getDatas());

	}
}
//�鿩���� ���߱� ctrl + shift + f