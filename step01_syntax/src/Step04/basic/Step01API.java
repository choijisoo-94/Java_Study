package Step04.basic;

public class Step01API {

	public static void main(String[] args) {
		/*���ڿ� ��ü���� ù ������ ����
		 * ��� ���࿡ �ʿ��� ����
		 * ���ڿ� ��ü/���ڿ��� ù ö�� ��ġ��
		 * ���ڿ� ��ü(s)/���ڿ��� ù ö�� ��ġ��(0) //���ڿ��� 0���� ���� ~ string�� 6����!
		 * �� ���ڸ� �̰� ���� ���� char����ϱ�. length�� ���� ���� ����
		 */
	String s = "string";
	System.out.println(s.length());
	System.out.println(s.charAt(3));
	
		//S��� �ҹ��� ö�ڷ� �����ϴ°� �´ٸ� true ���/�ƴ϶�� false ����� �޼ҵ�
		/* true or false - ��ȯŸ���� boolean
		 * s�ҹ��ڷ� ����...�ʿ��� �� ������
		//ing�� �и��ؼ� ����ϼ���
		 * ���ڿ��� �Ϻθ� ����
		 * string -> ing
		 * ��ȯ���� ing ���� Strings
		 * String ?(int index){
		 * 		��ü ���ο��� �Ϻθ� ����...
		 */

	
	//	boolean ?(char c)
	//	boolean ?(String str)		

			
	System.out.println(s.startsWith("s"));
	
	System.out.println(s.substring(4));
	
	String s2 = "PlayData"; //"" String ��ü �ڵ� ����
	System.out.println(s2.toLowerCase());
	System.out.println(s2.toUpperCase());
	System.out.println(Math.random());
	System.out.println(Math.max(4, 7));
	}

}

		/* 1. API Ȱ�� ����
		 * 2. ���ǹ� & ������
		 * 3. �迭 & �ݺ���
		 * 
		 * 4. mini project(3�� 1�� or 2�� 1��)
		 * 	- ��ǥ
		 *
		 */
