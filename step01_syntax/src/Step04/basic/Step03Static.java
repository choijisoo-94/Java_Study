/*static Ű����
 * 
 */
package Step04.basic;
	
public class Step03Static {
	void m1() {
		System.out.println("non-static �޼ҵ�");
	}
	
	static void m2() {
			System.out.println("static �޼ҵ�");
	}
	public static void main(String[] args) {
		Step03Static.m2();
//		Step03Static.m1(); ����
		/* �⺻ Ÿ���� Ŭ���� ������, ���� ��ü Ÿ�Ե�θ� ���� �� Ȱ���ؾ� �ϴ� ��Ȳ�� ��������..
		 * API ���� 8���� �⺻ Ÿ���� support ���ִ� ���� Ŭ������
		 * �⺻��(�⺻Ÿ��)�� ���� ���� - wrapper class ��
		 * int - Integer
		 * byte - Byte
		 * float -Float
		 * ...
		 * 
		 * 
		 */
		/*
		 * java.lang.Integer�� �޼ҵ��� ���ڿ�(String) -> int�� ��ȯ���ִ� �޼ҵ�
		 * �ʿ䵥���� - String, ��ȯ - int
		 * int ?(�ʿ䵥����String s)
		 */
		
		String s = "3";
		int i = Integer.parseInt(s); //String -> int
		System.out.println(i); //3�̶�� int�� ����� ����
		
		String a = "9";
		int j = Integer.parseInt(a);
		System.out.println(j);
		
	}

}
