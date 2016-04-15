package cn.rookie.bridge;
abstract class Airplane{
	protected AirplaneMaker airplaneMaker;
	public void setAirMaker(AirplaneMaker airplaneMaker){
		this.airplaneMaker = airplaneMaker;
	}
	public abstract void fly(
			);
}

class PassengerPlane extends Airplane{

	@Override
	public void fly() {
		airplaneMaker.produce();
		System.out.println("客车");
	}
}

class CargoPlane extends Airplane{
	@Override
	public void fly() {
		airplaneMaker.produce();
		System.out.println("货车");
	}
}

abstract class AirplaneMaker{
	 public abstract void produce();
}

class Aibus extends AirplaneMaker{
	@Override
	public void produce() {
		System.out.print("空客生产: ");
	}
}

class Boeing extends AirplaneMaker{

	@Override
	public void produce() {
		System.out.print("波音生产: ");
	}
	
}

class MD extends AirplaneMaker{

	@Override
	public void produce() {
		System.out.print("麦道生产: ");
	}
}

public class BridgeAirplane {

	public static void main(String[] args) {
		Airplane p1=new PassengerPlane();
		Airplane p2=new CargoPlane();
		p1.setAirMaker(new Aibus());
		p2.setAirMaker(new Boeing());
		p1.fly();
		p2.fly();
	}

}
