/* FriendInfo라는 interface 를 구현하는 자식 클래스
 * 
 */
package spec;

public class FriendInfoImpl implements Friendinfo {
	
	//재정의 rule - 상위에서 제공한 메소드 선언구를 동일하게 해서 내용만 수정
	public String getInfo() {
		return "최지수 : " + COMPANY_NAME;
	}
	
	public String heart() {
		return "화이팅";
	}

	//객체 생성 방법 - > 상속 & 다형성으로 객체 생성하는 방법
	public static void main(String[] args) {
		//interface
		Friendinfo i = new FriendInfoImpl();
		System.out.println(i.getInfo());
		System.out.println(i.heart());
	}

}
