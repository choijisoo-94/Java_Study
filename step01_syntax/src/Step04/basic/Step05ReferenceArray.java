package Step04.basic;

import model.domain.Customer;

public class Step05ReferenceArray {
	//Customer �迭 �����ؼ� ������ ���� �� ��ȯ
	static Customer [] getCs(){
		Customer [] all = {new Customer("������", 30, "vvip"), 
						new Customer("�����", 27, "vvip")};
		return all;
	}
	//Customer �迭�� �����͸� �ݺ��� Ȱ���ؼ� ���
	/*all[i].getName()
	 * all - Customer[]
	 * all[0] or all[1] - Customer
	 * all[0]
	 * 
	 */
	static void printAll(Customer [] all) {
		for(int i = 0 ; i < all.length; i++ ) {
			System.out.println(all[i].getName());
		}
	}
	
	public static void main(String[] args) {
		Customer [] c = getCs();
		printAll(c);
	}

}
