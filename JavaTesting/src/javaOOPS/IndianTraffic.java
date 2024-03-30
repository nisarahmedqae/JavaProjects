package javaOOPS;

public class IndianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		/*
		 * I have created an object for class IndianTraffic to implement methods present
		 * in CentralTraffic
		 */

		CentralTraffic a = new IndianTraffic();
		a.redStop();
		a.greenGo();
		a.yellowWait();

		IndianTraffic it = new IndianTraffic();
		it.zebraCrossing();

		ContinentalTraffic ct = new IndianTraffic();
		ct.trainSymbol();

	}

	public void zebraCrossing() {
		System.out.println("People can cross the road");
	}

	@Override
	public void greenGo() {
		System.out.println("Green Signal Implemented");

	}

	@Override
	public void redStop() {
		System.out.println("Red Signal Implemented");

	}

	@Override
	public void yellowWait() {
		System.out.println("Yellow Signal Implemented");

	}

	@Override
	public void trainSymbol() {
		System.out.println("trainSymbol Implemented");

	}

}
