/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  Beneficiary.java
 * DESC  :  수혜자 정보(Data)
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
	/** 수혜자 번호 */
	private int no;

	/** 수혜자 이름 */
	private String name;

	/** 수혜자 연락처 */
	private String contactInformation;

	/** 혜택받길 희망하는 기부 타입 */
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