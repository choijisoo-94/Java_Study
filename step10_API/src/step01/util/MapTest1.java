/* �н�����
 * 1. �����͸� ��� ���� �� Ȱ���� ���ΰ��� ���� �ذ� �� ���å���� ��� �� �����ϴ� ������ ���� ����
 * 2. ������� �������(���, ��, �̸�, ����, ����ó..), 
 * 	�й�(�й�, ��, �г�, �̸�, ����, ����ó)���� �л����� �����ϴ� ������ ����� ���� �н�
 * 3. key�� value ����
 * 		key : ��� �Ǵ� �й�
 * 		value : �ߺ��� ������ ������ ���� ����ϰ��� �ϴ� ������
 * 4. ����
 * 	- jdk1.5 ������ API �󿡼� E(Element), K(Key), V(Value)...Object�� ����
 * 5. �ֿ� API
 * 	- key�� value ����
 * 	- �� Ŭ������ �ٸ����� ����� �⺻ ���� ���� : ������ ����(interface�� �ϳ�)
 * 	- java.util.Map �̶�� interface�� ��ӹ޾� �����ϴ� ���� Ŭ������
 * 	1. HashMap
 * 	2. Properties 
 * 		- properties ��� Ȯ���� ������ ������ read�ؼ� Ȱ���ϴ� ���
 * 		- ����
 * 		- 	DB ���� ������ ������ properties ���Ϸ� �����ؼ� �ڵ�󿡼� ������
 * 			framework�� ���� ���� ������ �⺻ ���� ����
 * 	3. JSON ���� �н�
 * 		- JSON ������ Ȱ���ϴ� API�� ���
 */
package step01.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest1 {

		public static void main(String[] args) {
			HashMap<String, String> map = new HashMap<>();
			map.put("��", "playdata");
			map.put("��", "encore");
			map.put("��", "������2");
			/* data�� HashMap�� �����ؼ� ���� �� key�� �� �׷��ٸ� key�� value�� Ȱ���ؾ� �ϴ� map Ȱ�� �Ұ�?
			 * �ذ�å(�ǻ��ڵ�)
			 * 	1�ܰ� : HashMap ��ü�� ������ key�鸸 �����ϴ� �޼ҵ� ȣ���ؼ� key �� ��ȯ ����
			 * 	2�ܰ� : �ش� key���� ���� ������ ������ �� (Iterator ��ü�� ��ȯ)
			 * 	3�ܰ� : ���� ���� Ȯ��
			 * 	4�ܰ� : ����  - key ȹ���ؼ� value�� ȹ��
			 * 		������
			 * 
			 * 
			 */
			Set<String> keys = map.keySet(); //key�鸸 ��ȯ, key �ߺ� �Ұ��� Ÿ��
			Iterator<String> allKeys = keys.iterator();	
			while(allKeys.hasNext()) {
				String key = allKeys.next();
				System.out.println(key + " : " + map.get(key));
			}
			
			
			
			System.out.println("--- step01 ----");
			System.out.println(map); // {��=encore, ��=playdata, ��=������2}
			
			String v = map.get("��");
			System.out.println(v);
			
			map.put("��", "����");
			v = map.get("��");
			System.out.println(v);
			
			
		}
}

//ArrayList
//add(Object v)
//ctrl alt �Ʒ� ����Ű - ����