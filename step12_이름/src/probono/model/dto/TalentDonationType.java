/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationType.java
 * DESC  :  재능기부 종류(Data)
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

public class TalentDonationType {
	/** 재능 기부 타입(종류) */
	private String donationType; 
	
	/** 재능 기부 활동 영역 */
	private String activityArea;
	
	/** 재능 기부 활동 예시 */
	private String activityDetails;

	public TalentDonationType() {}
	public TalentDonationType(String probonoId, String probonoName, String probonoPurpose) {
		super();
		this.donationType = probonoId;
		this.activityArea = probonoName;
		this.activityDetails = probonoPurpose;
	}
}
