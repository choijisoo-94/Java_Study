/*�н� ����
 * 1. �α��� ���� ����
 * 2. �ʿ� ������
 * 		- client�� �Է��ϴ� id/pw
 * 3. ���
 * 		-id/pw������ ������ �ؼ� ��ȿ�� ���("��ȿ�� ID")  
 * 							��ȿ�� ���("��ȿ�� ID")
 * 		-id : playdata 
 * 4. �ʿ� �ڵ�
 * 	1. String �� ����
 * 		- �̹� ����(�����ͺ��̽� ����) �����Ѵ� ����
 * 		- java�� ���ڿ� �񱳽� �޼ҵ�
 * 			public class String{
 * 			public boolean equals(String v){
 * 				�� ���ڿ� ��ü�� �� �����͸� �޾Ƽ� ��
 * 				true or false ��ȯ
 * 			}
 * 		}
 * 		String id = "playdata";
 * 		boolean r = id.equals("cliant�� �Է��� ������");
 * 
 * 5. ����
 * 	1. �� �� == : ���� �� �������
 * 		�⺻ Ÿ��
 * 			���� �� ��
 * 			int i = 10; int i2 = 20;
 * 			i == i2 false
 * 
 * 		���� Ÿ��
 * 			��ü�� �ּҰ��� ��
 * 			��ü���� ���밪 �񱳽ÿ��� equals()�� ��
 * 
 */
package step01;

import model.domain.Customer;

public class ValidationCheck {
	
	//���� ����
//	public static String idCheck(String id) { 
//		String userid = "playdata";
//		if(userid.equals(id)) {
//			return "��ȿ�� ID";
//		}else{
//			return "��ȿ�� ID";
//		}
//	}
	
	/*? Customer �� ������ �ִ� ����
	 * �̸��� "���ھ�"
	 * �˻� �̸��� ���ھ� ��� age�� grade�� �����ؼ� ��ȯ
	 * 			���ھ� �ƴ϶��"�� �ڰ� ����" ��� ��ȯ
	 */
	
	public static String namecheck(String searchName) {
		Customer user = new Customer("���ھ�", 10, "vvip");
		
		
		String name = user.getName();
		if(name.equals(searchName)) {
			return user.getAge() + " " + user.getGrade();
		}else {
			return "�� �ڰ� ����";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(namecheck("���ھ�"));
		System.out.println(namecheck("��"));
	}
}
//
//public static String namecheck(String searchName) {
//	Customer user = new Customer("���ھ�", 10, "vvip");
//	
//	
//	
//	if(user.getName().equlas(searchName)) {
//		return user.getAge() + " " + user.getGrade();
//	}else {
//		return "�� �ڰ� ����";
//	}
//}
//
//public static void main(String[] args) {
//	System.out.println(namecheck("���ھ�"));
//	System.out.println(namecheck("��"));
//}
//}

