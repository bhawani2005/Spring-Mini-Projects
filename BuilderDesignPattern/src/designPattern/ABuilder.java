package designPattern;

public class ABuilder {

	private int num1;
	private int num2;
	
	public ABuilder() {
		
	}

	public int getNum1() {
		return num1;
	}

	public ABuilder setNum1(int num1) {
		this.num1 = num1;
		return this;
	}

	public int getNum2() {
		return num2;
	}

	public ABuilder setNum2(int num2) {
		this.num2 = num2;
		return this;
	}
	
	public A build() {
		A a = new A();
		a.setNum1(this.num1);
		a.setNum2(this.num2);
		
		return a;
	}

}
