package SpringCore.MyFirstSpringApplication;

public class Person {
	String name;
	int age;
	static {
		System.out.println("Class Loaded....");
	}

	public Person() {

		super();
		System.out.println("Object created.....");
	}

	public Person(String name, int age) {
		super();
		System.out.println("Value injected via constractor");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Name injected via seter");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age injected via seter");
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
