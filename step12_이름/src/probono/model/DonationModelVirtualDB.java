/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  DonationModelVirtualDB.java
 * DESC  :  ��� ��� ������Ʈ�� ���� test data ���� Ŭ����
 * 
 * @author  
 * @version 1.0
*/
package probono.model;

import java.util.ArrayList;

import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
import probono.model.dto.TalentDonationType;

public class DonationModelVirtualDB {
	private static DonationModelVirtualDB instance = new DonationModelVirtualDB();
	private ArrayList<TalentDonationProject> projectList = new ArrayList<TalentDonationProject>();

	private DonationModelVirtualDB() {
		projectList.add(new TalentDonationProject("01������ó", new Donator(7369, "���ǻ�", "kimdoc@company.com", "������ó ������Ʈ"),
						new Beneficiary(100, "�迬��", "010-111-1111", "������ó ������Ʈ"),
						new TalentDonationType("������ó ������Ʈ", "�Ƿ�, ����, �ǰ��� ���õ� �о�", "�ǻ�, ���ǻ�, ���ǻ�, ������ ������, ����ħ, ����, �߸����� �� �Ƿ� Ȱ���̳� �Ƿ� Ȱ���� ���� �Ŀ�, ����, �Ƿ� Ȱ�� ����, ��ü���� ���, ��������, ���� óġ��"),
						"2020-03-31", "2020-04-03", "������ ���� ġ��"));

		projectList.add(new TalentDonationProject("02���帮�ݹ�", new Donator(7156, "�ſ���", "shin@company.com", "���帮�ݹ� ������Ʈ"),
						new Beneficiary(101, "�ھ�Ʈ", "010-222-2222", "���帮�ݹ� ������Ʈ"),
						new TalentDonationType("���帮�ݹ� ������Ʈ", "��ȭ, ���� ���� �о�", "������, ��ȭ���� ���α׷� ����, ���ä����� �� ��ȸ����, ����, ����, ������, ����ũ��, ����, ��, Ȱ�� ķ���� ��"),
						"2020-03-31", "2020-04-03", "���������� ����"));
		
		projectList.add(new TalentDonationProject("03�����׷���", new Donator(8012, "�̷���", "lee@company.com", "�����׷��� ������Ʈ"),
						new Beneficiary(105, "�̰ǰ�", "010-555-5555", "�����׷��� ������Ʈ"), 
						new TalentDonationType("�����׷��� ������Ʈ", "���ҵ��� �� ��ȸ���� �о�", "��ȸ���� ���� �ü���� ���� �� �Ŀ�, ���ų��� ����, �׷�Ȥ, ���� ������"),
						"2020-03-31", "2020-04-03", "���� ���� �Ļ� ����"));

	}

	public static DonationModelVirtualDB getInstance() {
		return instance;
	}

	public ArrayList<TalentDonationProject> getProjectList() {
		return projectList;
	}

	public void insertProject(TalentDonationProject newProject) {
		projectList.add(newProject);
	}
}
