/*학생 이름 : name

학번 : student_num

과제 성적 : grade

학생이 과제를 제출하고 교수님들로부터 과제 성적을 받았습니다.

과제 성적이 A+ 이면 "REPORT 통과", "A+가 아니면 "방과후 학습"을 출력
 */
package step02.happy;


import model.domain.Student;

public class ValidationCheck {
	
	public static String GradeCheck(String Grade) {
		Student user = new Student("장종욱", 10215, "A+");
		String grade = user.getGrade();
		if(grade.equals(Grade)) {
			return "REPORT 통과";
		}else{
			return "방과후 학습";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(GradeCheck("A+"));
		System.out.println(GradeCheck("B+"));
		System.out.println(GradeCheck("C"));
	}
	
}
	
