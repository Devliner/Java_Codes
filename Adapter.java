/**
 * 
 * @作者： 王雷：http://blog.csdn.net/wanglei_person
 *
 *
 * @描述：使用适配器，来进行供电
 * 		注意：这里是采用继承的方式实现的
 */
public class Adapter extends Current{
	public void use18(){
		System.out.println("使用适配器");
		this.use220();
	}
}
