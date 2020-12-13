//사용자가 아이디와 입력을 하기

package validation.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int pass = 0;
		System.out.println("Login을 위해 ID와 비밀번호를 입력하세요.");
		System.out.print("ID 입력 : ");
		String id = scan.nextLine(); //id에 nextLine을 통해 들어오는 키보드 입력을 저장
		System.out.print("비밀번호 입력 : ");
		String pw = scan.nextLine(); //pw에 nextLine을 통해 들어오는 키보드 입력을 저장
		File file = new File("C:\\Users\\Playdata\\Desktop\\MemberDB.txt");//바탕화면에 MemberDB.txt 만들고 속성에서 경로를 복사
		try {
			FileReader filereader = new FileReader(file); //파일 읽어들이는데 예외 처리
			BufferedReader bufReader = new BufferedReader(filereader); //FileReader를 통해 읽어온 내용을 가지고 있음
			String line = "";
			try {
				while((line = bufReader.readLine())!= null) { //버퍼리더가 한줄씩 읽어서 라인에 넣고 데이터 중 아이디와 비번의 인덱스를 뽑아옴
					System.out.println(line.indexOf(id) + "\t" + line.indexOf(pw)); //라인에 id가 있으면 첫번째 문자의 위치를 알려주고 없으면 -1 출력
					int passId = line.indexOf(id);
					int passPw = line.indexOf(pw);
					if(passId != -1 && passPw != -1) { //id와 pw를 모두 찾았다면 로그인
						System.out.println("로그인 성공");
						pass = 1; 	}	}
			  if(pass ==0) {System.out.println("로그인 실패");} //이외의 모든 경우는 로그인 실패
			  bufReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
