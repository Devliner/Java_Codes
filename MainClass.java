
public class MainClass {
	public static void main(String[] args) {
		//1��ԭ�з�ʽ
		Current current = new Current();
		//current.use220();
		
		//2��ʹ�ü̳з�ʽʵ��������ģʽ
/*		Adapter adapter = new Adapter();
		adapter.use18();*/
		
		//3��ʹ��ί�ã���ϣ���ʽʵ��������ģʽ
		Adapter2 adapter = new Adapter2(current);
		adapter.use18V();
		
		
	}
}
