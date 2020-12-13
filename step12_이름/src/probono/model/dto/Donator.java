/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  Donator.java
 * DESC  :  사원중 기부를 희망하는 기부자 정보(Data)
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
	/** 기부자 사번 */
	private int empno;
	
	/** 기부자 이름 */
	private String ename;
	
	/** 기부자 이메일 */
	private String email;
	
	/** 기부자 재능 */
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