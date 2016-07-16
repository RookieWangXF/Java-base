package cn.rookie.cooperate.proCon;

/**
 * 一次生产一个，一个取一个
 */
class Resource
{
	private String name;
	private int count;
	private boolean flag = false;
	public synchronized void set(String name)
	{
		while(flag)
			try{this.wait();}catch(InterruptedException e){}
		this.name = name + count;
		count++;
		System.out.println(Thread.currentThread().getName()+"...Producer..."+this.name);
	    flag = true;
		notifyAll();
	}
	public synchronized void out()
	{
		while(!flag)
			try{this.wait();}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+"...Consumer......"+this.name);
		flag = false;
		notifyAll();
	}
}

class Producer implements Runnable
{
	private Resource r;
	Producer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.set("Duck");
		}
	}
}

class Consumerr implements Runnable
{
	private Resource r;
	Consumerr(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}

class  ProducerConsumerDemo
{
	public static void main(String[] args)
	{
		Resource r = new Resource();
		Producer pro = new Producer(r);
		Consumerr con = new Consumerr(r);
		Thread t0 = new Thread(pro);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(con);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
}
