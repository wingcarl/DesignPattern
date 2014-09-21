package creationalPatterns.FactoryMethod.SimpleFactory;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黄色皮肤...");
	}

	@Override
	public void talk() {
		System.out.println("我是黄色人种...");
	}

}
