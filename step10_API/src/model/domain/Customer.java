/* �н� ����
 * 1. ���뼺�� ����� ����
 * 2. ��ü ���� ����
 * 	1. ��� ��� ������ �ʱ�ȭ �� ���� ����
 * 	2. name�� �ʱ�ȭ �� ���� ����
 * 	3. age���� �ʱ�ȭ �� ���� ����
 * 		..�߻��Ǵ� ����
 * 		�������� ������ �����ϰ� �������� ����
 * 3. �ذ�å
 * 	- �ʿ��� ����(ȣ�� ����)�� �����ڸ� �������� �����ϴ� �������� �ؼ�
 * 4. ���� ���
 * 	- Builder pattern	
 */
package model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Customer {
	//��� ����
	private String name; 
	private int age;
	private String grade; // vvip, vip, silver
	private Car car;

	
}
