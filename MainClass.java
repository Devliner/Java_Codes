
public class MainClass {
	public static void main(String[] args) {
		//1、原有方式
		Current current = new Current();
		//current.use220();
		
		//2、使用继承方式实现适配器模式
/*		Adapter adapter = new Adapter();
		adapter.use18();*/
		
		//3、使用委让（组合）方式实现适配器模式
		Adapter2 adapter = new Adapter2(current);
		adapter.use18V();
		
		
	}
}
