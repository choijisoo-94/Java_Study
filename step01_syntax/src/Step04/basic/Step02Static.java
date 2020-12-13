/* �н� ����
 * 1. static Ű����
 * 2. Ư¡
 * 	- ��ü �������̵� ����� ������ �޼ҵ�� ȣ���ؼ� ����� ����
 * 3. �ʿ伺
 * 	- ��ü ��ü�� �ʿ����� �ʰ� �޼ҵ�� ����� �ʿ��� ��쿡 ��ü �������� �޼ҵ� ���ุ �����ϰ� �ϰ��� �� �� 
 * 	- ��� ����ڵ��� �����ϴ� ������ �ڿ��� ������ Ȱ���ϰ��� �� �� ������ ����
 * 		: ��ü ���� �����ϰ� ��� ��ü�� �����ϴ� ������ ������ ����ÿ� ���
 * 		�� Ŭ���� ���߽� ��� ������ static ���� ���� ����
 * 4. ����
 * 	1. ���� : static Ÿ�� ������;
 *  2. �޼ҵ� : static ����Ÿ�� �޼ҵ��(){}
 *  3. static{} :
 *  	byte code�� �޸𸮿� �ε� �� �� �ѹ��� ����	
 *  	��� user���� �����ϴ� �ڿ��� �� �ѹ� �ʱ�ȭ �ؾ��� ���
 *  
 */

package Step04.basic;

public class Step02Static {
	//��� �������� �޸𸮿� ���� ������ ������ �ڵ� �ʱ�ȭ(default �ʱ�ȭ)
	int a; 			//��ü ���� �Ŀ��� ��� ����
	static int b; 	//��ü �������� �ʰ� ��� ���� - mathod area�� ����(static)
	
	Step02Static(){
		a++; // a�� 1 �����ϴ� ���� ������ a = a + 1 �� ����
		b++;
	}
	
	public static void main(String[] args) {
		System.out.println(b); //ok
//		System.out.println(a); //error
		Step02Static s = new Step02Static();
		System.out.println(s.a + " " + b); //1 1
		
		Step02Static s2 = new Step02Static();
		System.out.println(s2.a + " " + b); //1 2
		
		Step02Static s3 = new Step02Static();
		System.out.println(s3.a + " " + b); //1 3
		/*java.lang.System
		 * out : System Ŭ������ static ���� ���� ���� Ŭ���� �̸����� ȣ��
		 * 		System.out
		 * println() : ���� ��� ���
		 * PrintStream ���� ����
		 */ 
		System.out.println(Step02Static.b);
		
	}

}
