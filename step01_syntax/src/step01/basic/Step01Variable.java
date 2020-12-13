/* �н� ����
 * 1. ������ ǥ�� ���
 * 	-����
 * 	-Ÿ�� ������ [= ��];
 * 
 * 2. ���� �����/Ȱ���ϱ�
 * 
 */

package step01.basic;

public class Step01Variable {
	
	public static void main(String[] args) {
		//����(byte, short, int, long) �����ϴ� ���� ����
		int age;  //32bit �޸� ���� ����, age��� �̸����� ����
		//false �����ϴ� ������ ���� ����(=�ʱ�ȭ)
		//true or false�� ���� ������ �޸� ���� �� false �� ����
		boolean result = false;
		System.out.println(result);
		//64bit ����
		long l = 100;
		age = (int)l; //����ȯ(type casting/downcasting)
		System.out.println(age);
		
		/* (byte)(b1 + b2)
		 * 1�ܰ� : b1+b2
		 * 2�ܰ� : (byte)
		 * ��� : ����� int�� ��ȯ�� Ÿ���� byte �� ����ȯ
		 * 
		 * (byte)b1+b2
		 * 1�ܰ� : (byte)b1
		 * 2�ܰ� : (byte)b1 + b2
		 * ��� : intŸ���� �ڵ� ��ȯ
		 */
		 
		byte b1 = 3;
		byte b2 = 4;
		byte b3 = (byte)(b1 + b2); //����� �� ū ������� ��ȯ�� Ȯ���� ����.
		System.out.println(b3/2); //3
		float f3 = b3/2.0f;			//3.5 , b3/2 �� ��� 3, (float)(b3/2.0); b3/2.0f; b3/2.0F; b3/(float)2.0; = 3.5
		System.out.println(f3);
		//ū �ɷ� ������ ū �ɷ� �� ū Ÿ���� ����.
		
		
		//32bit
		float f1 = (float)3.7;  // or 3.7F, 3.7f
		//64bit ������ 32bit �Ǽ��� ����
		//���������� ��� �Ǽ��� ��� �������� �� ū �������� �޸𸮸� ���
		//��� �Ǽ��� ��� ���� ������ ���Խ� ����ȯ �ʼ�
		long l2 = (long) f1;
	}

}
