/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  Donator.java
 * DESC  :  ����� ��θ� ����ϴ� ����� ����(Data)
 * 
 * @author  
 * @version 1.0
*/
package probono.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Donator {
	/** ����� ��� */
	private int empno;
	
	/** ����� �̸� */
	private String ename;
	
	/** ����� �̸��� */
	private String email;
	
	/** ����� ��� */
	private String talent;

	public Donator() {
		super();
	}
	public Donator(int empno, String ename, String email, String talent) {
		super();{
		this.empno = empno;
		this.ename = ename;
		this.email = email;
		this.talent = talent;
		}
	}
}