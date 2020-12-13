package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString //모든 멤버 변수들값을 하나의 문자열로 결합해서 반환
public class Customer {
	
	private String id; 
	private int age;
	private String grade; 
	
}
