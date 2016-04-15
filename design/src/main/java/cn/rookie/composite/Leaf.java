package cn.rookie.composite;

import java.util.List;

public class Leaf implements Component{

	@Override
	public void doSomething() {
		System.out.println("do it");
	}

	//leaf中的这些方法不需要实现
	@Override
	public void add(Component component) {
	}

	@Override
	public void remove(Component component) {
	}

	@Override
	public List<Component> getAll() {
		
		
		return null;
		
		
	}

}
