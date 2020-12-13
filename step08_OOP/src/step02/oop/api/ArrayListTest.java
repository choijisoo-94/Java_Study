/*�н�����
 * 1. �ڵ�� ������ �ʿ伺 ü���ϱ�
 * 	- Ȯ���� ��.��.��
 * 	- ��Ӱ����� �ڼ� Ÿ�Ե��� �� ���� Ÿ���� ����
 * 	- ����
 * 		����Ÿ�� ���� = �ڼհ�ü;
 * 2. ����
 * 	- ��� ������ Ÿ�Ե��� �迭 �Ǵ� API���� �����ϴ� ������ Ȱ�� Ŭ������� ���� ���
 * 
 * 3. �迭�� Ư¡
 * 	- �ټ��� �����͸� �ϰ� ���� �� Ȱ���� �ִ�ȭ �ϱ� ���� �ʼ� Ÿ��
 * 	- length �޸� ũ�Ⱚ ������ �ڵ� ����
 * 	- Ÿ�Կ� ���� ������ ����
 * 		int[] - int ���� ���� �����͸�, String[] - String �����͸� ����
 * 		Customer [] - Customer�� ����
 */
package step02.oop.api;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//String(�̸�) / ����(Integer) / ������(String) / �ڵ��� ��ȣ..������ Ÿ�԰� �����ϰ� �迭 ���Ŀ� ���� �� ����
		//�� ���� �� ��ü Ÿ���̾�� �� ������ �ִ� API�� �ټ� ����
		//�迭�� ��� / ��üŸ�Ը� ���� / ���� ������ API Ȱ��
		ArrayList al = new ArrayList(); //10���� size�� �迭 �������� ����
		System.out.println(al.size()); //����� ������ ����
		//������ ����
		al.add("����");
		al.add(new Integer(20));
		System.out.println(al.size());
	}

}
