/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  RunningEndView.java
 * DESC  : ��� ��� ���� ��� Ŭ����
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import java.util.ArrayList;

import probono.model.dto.TalentDonationProject;

public class EndView {

	// �������� Ư�� ������Ʈ ���
	public static void projectView(TalentDonationProject project) {
		if (project != null) {
			System.out.println(project);
		} else {
			System.out.println("�˻��ϴ� ������Ʈ�� �������� �ʽ��ϴ�.");
		}
	}

	// �������� ��� ������Ʈ ���
	public static void projectListView(ArrayList<TalentDonationProject> allProbonoProject) {
		for (TalentDonationProject project : allProbonoProject) {
			System.out.println(project);
		}
	}
	// ���ܰ� �ƴ� �ܼ� �޼��� ���
	public static void messageView(String message) {
		System.out.println(message);
	}

	


	

	

}
