package annotation.test;

//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
//AllArgsConstructor(){};

//@AllArgsConstructor
//AllArgsConstructor(){
//	this.name=name;
//}
//@Getter
//@Setter
@Data //�⺻������ + get/setXxx �ڵ� ����
public class PeopleDTO {
	private String id;
	private int pw;
	
	//public PeopleDTO() {}
}
