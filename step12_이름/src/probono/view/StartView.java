/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  StartView.java
 * DESC  : ���� Ŭ����
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import probono.controller.TalentDonationController;
import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
import probono.model.dto.TalentDonationType;

public class StartView {
	
	public static void main(String[] args) {
		
		TalentDonationController controller = TalentDonationController.getInstance();
		
		System.out.println("\n*** 01. ��� Project �˻� ***");
		controller.getProjectList();	
		
		
		System.out.println("\n*** 02. '01������ó'��� �̸��� Project �˻� ***");
		controller.getProject("01������ó");

		System.out.println("\n*** 03. �������ϴ� Project �˻� ***");
		controller.getProject("Ű�ٸ�������---");
		
		
		//'04Ű�ٸ�������' ��� ������Ʈ ���� �����ؼ� ���� �� �˻�		
		System.out.println("\n*** 04. '04Ű�ٸ�������'��� ���ο� Project���� ��  ��� Project �˻� ***");
		TalentDonationProject newProject = new TalentDonationProject("04Ű�ٸ�������", 
				new Donator(5980, "�մٸ�", "shon@company.com", "Ű�ٸ������� ������Ʈ"),
				new Beneficiary(106, "�����", "010-666-6666", "Ű�ٸ������� ������Ʈ"), 
				new TalentDonationType("Ű�ٸ������� ������Ʈ",  "���丵, ���, ����, �Ῥ �о�", "�Ῥ, ���, ����, �������н����� �� ������ȸ ����, ��������, �ɸ���� �� ���丵, ���, ����, �Ῥ�о�"),
				"2020-03-31", "2020-04-03", "�к� ���� �� ���丵");
		System.out.println("\n04-1. ���� �� ������Ʈ �˻�");
		controller.getProjectList();
		
		controller.insertProjectList(newProject);
		
		System.out.println("\n04-2. ���� �� �˻�");
		controller.getProjectList();
		
		System.out.println("\n04-3. �̹� ����� ������Ʈ ������ �õ��� ��ȿ�� ������ ���ռ� ����");
		controller.insertProjectList(newProject);
		
		//���� ������ ��ȿ�� ó�� ���� ����
		System.out.println("\n*** 05. �ǹ̾��� �������� null�� Project ���� �õ� �� ��ȿ�� ������ ���ռ� ���� ***");
		controller.insertProjectList(null);
		
		
		//�����ϴ� '04Ű�ٸ�������' ������Ʈ�� ������ ������Ʈ �� ���� ���� �˻�
		System.out.println("\n*** 06. �����ϴ� '04Ű�ٸ�������' Project ������ ���� �� ������ ���� �˻� ***");
		System.out.println("06-1. ���� �� ������Ʈ �˻�");
		controller.getProject("04Ű�ٸ�������");
		controller.updateProjectBeneficiary("04Ű�ٸ�������", new Beneficiary(110, "������", "010-333-3333", "Ű�ٸ������� ������Ʈ"));
		
		
		System.out.println("\n06-2. ���� �� ������Ʈ �˻�");
		controller.getProject("04Ű�ٸ�������");
		
		
		System.out.println("\n*** 07. �ǹ̾��� �������� null�� Project�� ������ ���� ���� �õ� �� ��ȿ�� ������ ���ռ� ���� ***");
		controller.updateProjectBeneficiary("04Ű�ٸ�������", null);
		

		//'01������ó' Project ���� �� �˻�
		System.out.println("\n*** 08. '01������ó' Project ���� �� ������ Project �˻� ***");
		System.out.println("08-1. ������ ������Ʈ �˻�");
		controller.getProject("01������ó");
		controller.deleteProject("01������ó");
		
		System.out.println("\n08-2. ���� �� ������Ʈ �˻� ");
		controller.getProject("01������ó");
		
		
		System.out.println("\n08-3. ������ ������Ʈ ���� ��õ� �� ��ȿ�� ������ ���ռ� ����");
		controller.deleteProject("01������ó");
		
	}
}






