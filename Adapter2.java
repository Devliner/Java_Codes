/**
 * 
 * @���ߣ� ���ף�http://blog.csdn.net/wanglei_person
 * @���ڣ� 2017��11��27��  ����9:31:15
 *
 * @������ͨ��ί�÷�ʽ��ʵ������������
 */
public class Adapter2 {
	private Current current;
	
	public  Adapter2(Current current){
		this.current = current;
	}
	
	public void use18V(){
		System.out.println("ʹ��������");
		current.use220();
	}
}
