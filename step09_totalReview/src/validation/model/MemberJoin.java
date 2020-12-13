//회원가입
//비번 입력해서 저장

package validation.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberJoin {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Playdata\\Desktop\\MemberDB.txt"); //바탕화면에 MemberDB.txt 만들고 속성에서 경로를 복사
		try {
			FileWriter filewriter = new FileWriter(file, true); //file에 이어쓰기
			if(file.isFile() && file.canWrite()) { //파일이 있고 파일을 쓸 수 있다면
				System.out.println("회원가입을 위해 ID와 비밀번호를 입력하세요.");
				System.out.print("ID 입력 : ");
				filewriter.append(scan.nextLine()); //엔터를 칠때까지 텍스트를 입력할 수 있게, 사용자가 입력한 내용을 파일에 추가해준다
				filewriter.append("\t");
				System.out.print("비밀번호 입력 : ");
				filewriter.append(scan.nextLine());
				filewriter.append("\r"); //다음 사람이 추가될 수 있도록 개행문자 
				System.out.println("회원가입이 완료되었습니다.");
			}
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

