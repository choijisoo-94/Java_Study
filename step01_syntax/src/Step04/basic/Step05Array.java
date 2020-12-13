/*�н� ����
 * 1. �迭
 * 	- �ϳ��� ������ ������ Ÿ���� �ټ��� �����͸� Ȱ�� �����ϰ� �ϴ� Ÿ��
 * 	- �⺻ Ÿ���� �ƴ� ���� ����(reference, object, class) Ÿ��
 * 2. ����
 * 	- ���� 3���� �����ؼ� Ȱ���ϴ� ���α׷��̶� ������ 3���� �����͸� ���������� ����
 * 	- int Ÿ���� ���� 3�� �ʿ�
 * 	- ���� ���� : �������� ���� �Ұ�
 * 
 *3. �迭 ����
 *	[] - �迭�� ǥ����
 *		Ÿ�� [] ������;
 *		Ÿ�� ������ [];
 *
 *4. ����
 * 	() - �޼ҵ� ����, ������ �����ÿ� ���,
 * 		- �޼ҵ�, ������ ȣ�� �� ������ �ޱ� ���� ���� ����
 * 		- void a(int no){} / a(3) - ȣ��;
 * 		- ȣ��� ���� �����ϱ� ���� ǥ��
 * 
 *	{������ �����ϴ� ����} - �޼ҵ� ����, ������ �����ÿ� ���	
 *
 *	�����ɾ�>java Step05Array
 *	����ȯ���� ���� ���
 *		Step05Array.main([..]);
 *	
 */

package Step04.basic;

import model.domain.Customer;

public class Step05Array {

	public static void main(String[] args) {
		//int�� 3���� �ϳ��� �迭�� ���� �� Ȱ��
		//�����ÿ� length ��� ������ �ڵ� �߰��Ǽ� ����, �迭�� ũ�Ⱚ ����
		int [] i = new int[3]; //3���� int�� ���� ������ �޸� ����, ���� ����
		i[0] = 1; //�ʱ�ȭ
		i[1] = 2;
		i[2] = 3;
		System.out.println(i[1] + " " + i.length);
		
		//String �迭 ���� �� Ȱ��
		String [] s = {"A", "B", "C"};
		System.out.println(s[0]);
		
		//import step01.basic.Customer;
		//Customer c = new Customer("������", 30, "vvip");
		Customer [] c2 = {new Customer("������", 30, "vvip"),
						new Customer("������", 27, "vip"),
						new Customer("�����", 27, "vvip")};
		System.out.println(c2.length); // 2�迭�� ũ�Ⱚ
		//�迭���� index 0��°�� ����� Customer ��ü�� ã�Ƽ� �� ��ü�� ������ 3���� ������ �߿� �̸��� ��ȯ�ؼ� ���
		System.out.println(c2[1].getGrade()); //30
		
		/*Customer c1 = c2[0]; //new Customer("������", 30, "vvip")
		 *String name = c1.getName();
		 *System.out.println(name); //"������"
		 */

		}
		
		//���� ���� �ʱ�ȭ�� �ϳ��� �������� ���
		//��ü ���� ����
		// new ������([..]) & " " & �迭 {}������ �ڵ����� ��ü�� ��
		int [] i2 = {1,2,3};
//		System.out.println(i2[2]);
	
}

