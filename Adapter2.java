/**
 * 
 * @作者： 王雷：http://blog.csdn.net/wanglei_person
 * @日期： 2017年11月27日  上午9:31:15
 *
 * @描述：通过委让方式来实现适配器功能
 */
public class Adapter2 {
	private Current current;
	
	public  Adapter2(Current current){
		this.current = current;
	}
	
	public void use18V(){
		System.out.println("使用适配器");
		current.use220();
	}
}
