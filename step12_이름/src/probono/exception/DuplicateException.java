/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  NotExistException.java
 * DESC  :  �ߺ����� ó���� ����� ���� ���� Ŭ����
 * 
 * @author  
 * @version 1.0
*/

package probono.exception;

public class DuplicateException extends Exception{

	public DuplicateException() {}
	public DuplicateException(String message) {
		super(message);
	}
}
