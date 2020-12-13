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
@ToString //��� ��� �����鰪�� �ϳ��� ���ڿ��� �����ؼ� ��ȯ
public class Customer {
	
	private String id; 
	private int age;
	private String grade; 
	
}
