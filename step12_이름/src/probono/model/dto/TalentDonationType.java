/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  TalentDonationType.java
 * DESC  :  ��ɱ�� ����(Data)
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
	/** ��� ��� Ÿ��(����) */
	private String donationType; 
	
	/** ��� ��� Ȱ�� ���� */
	private String activityArea;
	
	/** ��� ��� Ȱ�� ���� */
	private String activityDetails;

	public TalentDonationType() {}
	public TalentDonationType(String probonoId, String probonoName, String probonoPurpose) {
		super();
		this.donationType = probonoId;
		this.activityArea = probonoName;
		this.activityDetails = probonoPurpose;
	}
}
