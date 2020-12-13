/* �н����뤷
 * 1. �ݺ���
 * 2. �ʿ��� ����
 * 		������, ���ǽ�, ������
 * 		���������� �ݺ��� ���� �ϳ�, �������� ���ļ� �����͸� ��ȯ�� ���鼭 ������ true�� ��쿡�� ����
 * 3. �������
 * 	1. for - �ݺ� Ƚ���� �뷫 ������ ���� �� ����
 * 	2. while - ���� �ݺ� or �ݺ� Ƚ���� �Ҹ�Ȯ�� �� ����
 * 	3. do~while - ������ 1ȸ ���� �Ŀ� ���� �񱳴� �ι�° ������ ����
 */
package step01.basic;

public class Step04Loop {
	//for
	static void forTest() {
		for(int i = 1; i  <= 5 ; i++) {
			//true�� ��� ����Ǵ� ����
			System.out.print(i	+ "\t");
		}
	}
	//while
	static void whileTest() {
		int i = 1; //�ʱ�ġ
		while(i < 6) { //���ǽ�
			System.out.print(i + "\t");
			i++; //������
		}
	}
	//do-while
	static void dowhileTest() {
		int i = 1;
		do {
			System.out.print(i + "\t");
			i++;
		}while(i < 6);
	}
	public static void main(String[] args) {
		forTest();
		System.out.println();
		whileTest();
		System.out.println();
		dowhileTest();
	}

}
