/* ��ü ������ ���� �����ڴ� �����ڰ� ���ڵ��� �ڵ����� �߰�(�⺻ ������)
 * ������{} ���ο��� ��� ������ ����...
 * 
 */
package Step04.basic;

class A{
	A(){
		//NO ���� ���� ���� 0������ �ڵ� �ʱ�ȭ -> 10������ �� �ʱ�ȭ
	System.out.println("A");	
	}
	int no = 10;
	int getNo() {
		return no; 
	}
}
class B{
	A a = new A(); 
	B(){
		//��� ������ ���� �Ϸ� - A a  �Ϻ��ϰ� ���� ����
		System.out.println("B");
	}
}
class C{
	B b = new B();
	C(){
		//��� ������ �ʱ�ȭ ���� ���� B b  = new B() ��ü ����
		System.out.println("C");
	}//������ ���� ����� �� Ŭ������ ������ ��� ��� ������ �Ϻ��ϰ� �޸𸮿� ��������
}	

public class Step04Review {

	public static void main(String[] args) {
		/*�̼�1 - AŬ������ no ������ ���
		 *�̼�2 - ��ü ���� ����? */
		 C c = new C(); 
		 
		 /* C c = new C()
		  * C c ���� ���� ����
		  * 
		  */
		 System.out.println(c.b.a.getNo());
	}
}

