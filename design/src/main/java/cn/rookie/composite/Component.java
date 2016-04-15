package cn.rookie.composite;

import java.util.List;

public interface Component {
	public void doSomething();

	//方法二中直接在Component中定义
	public void add(Component component);
	public void remove(Component component);
	public List<Component> getAll();
}
