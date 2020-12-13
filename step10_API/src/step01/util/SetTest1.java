/* �н�����
 * 1. �ߺ� ����, ���� ���� �̺��� ������ ���� ����
 * 2. ���� - �ֹ��� ����, �й��� ����..�� ���Ǵ� ����
 * 			Map�� key Ÿ������ ���
 * 3. ����
 * 		- index, key ������ �� ����
 * 4. ���� ������ ���� ��� �ϳ��� �ϳ��� �̾Ƽ� ���
 * 		- ���������� �����͸� ��밡���ϰ� ����(Iterator)
 * 5. Iterator
 * 		Object next() - �����Ѵٴ� �����Ͽ� ������ ��ȯ
 * 		boolean hasNext() - ������ ���� ���� Ȯ��
 */

package step01.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		System.out.println(set);//[a, b, c, d]
		Iterator<String> all = set.iterator();
		while(all.hasNext()) {
			String v = all.next();      
			System.out.println(v);			
		}

		Set set2 = new HashSet<>();
		set.add("a"); //String��ü ����� Object Ÿ������ ��ȯ�Ǿ� ����
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		System.out.println(set);//[a, b, c, d]
		Iterator all2 = set.iterator();
		while(all.hasNext()) {
			String v2 = (String)all2.next();   
			System.out.println(v2);			
		}
	}

}