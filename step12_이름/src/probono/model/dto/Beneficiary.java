/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  Beneficiary.java
 * DESC  :  ������ ����(Data)
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

public class Beneficiary {
	/** ������ ��ȣ */
	private int no;

	/** ������ �̸� */
	private String name;

	/** ������ ����ó */
	private String contactInformation;

	/** ���ùޱ� ����ϴ� ��� Ÿ�� */
	private String requestType;

	public Beneficiary() {}
	public Beneficiary(int no, String name, String contactInformation, String requestType) {
		super();
		this.no = no;
		this.name = name;
		this.contactInformation = contactInformation;
		this.requestType = requestType;
	}
}