package Test;

public class Test {

	public static void main(String[] args) {
		char c = 'A';
		int i = c; //16bit char --> 32 bit int�� ��ȯ, A�� �����ڵ� ��ȣ
		System.out.println(c + " " + i); //A 65
		c = 'a';
		i = c;
		System.out.println(i); //97
		System.out.println("=========");
		
		/*�����ӿ��� ��Һ񱳰� �����ϴٴ� ��
		 * Ÿ���� ��ġȭ �ؼ� �񱳸� ����
		 * >ũ�� �۴ٿ� ���� �����̱� ������ ��ġ ��ġ����
		 * char�� ���� �񱳽� char�� ������ ��ȯ���� �Ͻ�
		 * char ������ �񱳽� �����ڵ�� ��ȯ�Ǿ� ��
		 * a = 97, A = 65��..
		 * 
		 */
		
		String v = "abc";
		char c2 = v.charAt(0);
		System.out.println(c2 >= 97); //c2 > 96 : true  | c2 > 97 : false
		
		System.out.println("====! : ���� ������ =====");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(c2 >= 97); //true
		System.out.println( !(c2 >= 97) ); //false
		
	}

}
