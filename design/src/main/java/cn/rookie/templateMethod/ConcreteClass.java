package cn.rookie.templateMethod;

public class ConcreteClass extends AbstarctClass{
	private static ConcreteClass concreteClass;
	private ConcreteClass() {
	}
	public static ConcreteClass getInstance(){
		concreteClass = new ConcreteClass();
		return concreteClass;
	}
	@Override
	public void method1() {
		System.out.println("这是方法一");
	}

	@Override
	public void method2() {
		System.out.println("这是方法二");
	}

	@Override
	public void method3() {
		System.out.println("这是方法三");
	}
	public static void main(String[] args){
		AbstarctClass a1= ConcreteClass.getInstance();
		a1.template();
	}
}
