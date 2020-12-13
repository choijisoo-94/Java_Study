//SQL�� ���� ����ؼ� DB�� ���� �����ϴ� Ŭ������ ��ȯ
package model;

import java.util.ArrayList;
import java.util.List;

import model.db.VirtualDataBase;
import model.domain.Customer;

public class CustomerModel {
	private ArrayList<Customer> datas = VirtualDataBase.getCustomers();
	
	// ��� �� �˻� - �� ���� ��ȯ
	public ArrayList<Customer> getCustomers() {
		return datas;
	}

	// �� �˻� - id�� �ش� �� �˻�
	public Customer getCustomer(String id) {
			for(Customer c : datas) {
				if(c.getId().equals(id)) {
					return c;
				}
			}
			return null;
		}
	
	// �� ���� - 3���� �����Ͱ� �Ѹ��� �� ����
	/* parameter�� Customer Ÿ��? 
	 * String id, int age, String grade ������
	 * ������ ��� - ���ܹ߻�(�ߺ��� id��� �޼����� ����)
	 * �������� ��� - ����
	 */
	
//���� �����غ� ����(Ʋ�� ������ �� Ʋ�ȴ��� �����ϱ�)
//	public boolean void insert (Customer c) {
//		//id �ߺ� ���� ���� �� �������� ��쿡�� add
//		for(int i = 0; i < c.getId().length(); i++){
//		if(c.getId().equals("id")) {
//			}else {
//				return datas.add(c);
//			}
//		}
//	}
	
	public void insert(Customer c) throws Exception {

	Customer v = getCustomer(c.getId());
	if(v == null) {
		datas.add(c);
	}else {
		throw new Exception("id�� �ߺ� ���� �Ұ�");
		}
	}
	
	// �� ���� ����
	/* ���� ���� : true / ������ ���� : false
	 * id������ ��� ���� ����
	 * �߻� ������ ����� ��
	 * 	1. id�� �����Ѵ� - ���� true ��ȯ
	 * 	2. id�� �������Ѵ� - ���� �Ұ� false ��ȯ
	 * 
	 */
	public boolean update(String id, String newGrade) {
		boolean result = false;
		Customer v = getCustomer(id);
		
		if(v != null) { //null�� �ƴ� �� ���� ����
			v.setGrade(newGrade);
			result = true;
		}
		return result;
	}
	
	// �� ���� - ���� ���� �� 1 ��ȯ, ���� ���н� 0 ��ȯ
	/* ArrayList�� ����� Customer �� ArrayList�� ������ ���� - remove(int index), remove(Object o)
	 * 
	 */
	public int delete (String id) {
		int result = 0;
		Customer v = getCustomer(id);
		if( v != null) { //null�� �ƴϴ� = customer ����
			if(datas.remove(v) == true) {
				result = 1;
			}
			
		}
		return result;
		
	
	
	
//	public static void main(String[] args) {
//		CustomerModel c = new CustomerModel();
//		System.out.println(c.datas);
//		c.delete("�߱�");
//		System.out.println(c.datas);
//		c.update("�߱�", "vip");
//		c.getCustomers().get(3).setGrade("Gold");
//		c.getCustomers().get(3).getGrade().charAt(3);
		

		//? gold �������� d ö�ڸ� ���
		//ArrayList -> Customer -> grade -> d
		/* ArrayList : c.getCustomers() or c.datas
		 * Customer c : c.getCustomers().get(3) or c.datas.get(3)
		 * Grade : c.getCustomers().get(3).getGrade() or c.datas.get(3).getGrade()
		 * d : c.getCustomers().get(3).getGrade().charAt(0);
		 * 		c.datas.get(3).getGrade().charAt(0);
		 * 
		 */
		
//		System.out.println(c.getCustomers().get(3).getGrade().charAt(3));
		
//		try {
//		c.insert(new Customer("����", 10, "vvip"));
//		System.out.println(c.datas);
//		System.out.println(c.getCustomers());
//		
//		System.out.println("�������");
//		}catch(Exception e){
//			e.printStackTrace();//�߻��� ��� ����..�����ڿ�
//			System.out.println(e.getMessage()); //���� ��ü�� ������ �޼���
		}
//		System.out.println(c.getCustomers());
//		System.out.println(VirtualDataBase.getCustomers());
//		
//		System.out.println(c.getCustomers());
//		System.out.println(c.getCustomer("�ٿ�"));
	
}

