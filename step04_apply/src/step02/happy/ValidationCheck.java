/*�л� �̸� : name

�й� : student_num

���� ���� : grade

�л��� ������ �����ϰ� �����Ե�κ��� ���� ������ �޾ҽ��ϴ�.

���� ������ A+ �̸� "REPORT ���", "A+�� �ƴϸ� "����� �н�"�� ���
 */
package step02.happy;


import model.domain.Student;

public class ValidationCheck {
	
	public static String GradeCheck(String Grade) {
		Student user = new Student("������", 10215, "A+");
		String grade = user.getGrade();
		if(grade.equals(Grade)) {
			return "REPORT ���";
		}else{
			return "����� �н�";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(GradeCheck("A+"));
		System.out.println(GradeCheck("B+"));
		System.out.println(GradeCheck("C"));
	}
	
}
	
