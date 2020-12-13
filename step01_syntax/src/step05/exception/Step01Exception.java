/*�н� ����
 * 1. static{}
 * 	- byte code�� �ε��ÿ� �ڵ� ����Ǵ� ���
 * 	- ��� user���� �����ϴ� �ڿ�
 * 	- �� 1ȸ�� ���� ����
 * 
 * 2. 	����� �ش� ������ main�޼ҵ尡 ������ �Ǳ� ���ؼ��� byte code�� 
 * 		�޸𸮿� �ε��� �Ǿ� �־�߸� ����
 * 		�ٸ� ���ϸ� ������ �޸𸮿� �ε��� �õ��� �� ����
 * 		java�� db�� ����(����) db ���� �� Ȱ���� ���� driver�� �޸𸮿� �ε�
 * 
 * 		driver ����� ������ Ŭ������ �˰��ִٸ� ��� �޸𸮿� �ε�(����)?
 * 		�ذ�å
 * 			�̸��� �ƴ� Ŭ���������� �ش� byte code�� �޸𸮿� �����ϴ� �����
 * 			�޼ҵ带 ȣ��(��������)
 * 
 * 			class�� �޸𸮿� ���� �õ��� �߻� ������ ����� ��
 * 			1. �����ϴ��� - ���� ����
 * 			2. �������ϴ��� - ���� �Ұ�
 * 				�ý��� ����?
 * 				�ƹ� �� ���� ��ó�� �ش� ���� ������ �Ұ��̳� �� �̻��� ��������
 * 				���� ����Ǵ� ��ó��?
 * 
 * 3. IT �⺻ �Ҿ�
 * 	- ��Ȳ�� ���� �߻� ������ ����� �� ���� �ɷ�
 */

package step05.exception;

class A{
	static {
		//db �� driver�� �ε�
		System.out.println("A byte code �ε�");
	}
}
public class Step01Exception {
	public static void main(String[] args) {
			System.out.println(1);
			try {
				Class.forName("step05.exception.A---");
			// ���� �߻��� ���õǴ� ����	
				System.out.println(2);	
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println(5);
		}
		
	}
/*
 * ���α׷� ����� �߻� ������ ����� �� ó���ϴ� ���
 * [1] �߻��Ǵ� ����
 * 1. ���� ����
 * 	���� �������� ���� �ؾ߸� ������ ���� ����
 * 	Class.forName("step05.exception.A")�� ���
 * 	try~catch ��� ��Ư�� ���� ���̴� ���� ������ �Ұ�
 * 	�ʼ��� ó�� ������ ������
 * 
 * 2. ���� ����
 * 	NullPointerException..
 * 	���� �߻��� ��� �����Ͱ��� �����ؼ� ���� ����
 */


