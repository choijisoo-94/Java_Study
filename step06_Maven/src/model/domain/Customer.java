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

@Setter
@Getter   
@Builder
public class Customer {
	
	private String name; 
	private int age;
	private String grade; 
	
	//Car �� ����� ���� �� Ȱ��

	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
}
