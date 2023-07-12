class Person {
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class Test3 {
	public static void main(String[] args) {
		Person person = new Person();

		person.setName("Rahul Day");
		person.setAge(50);
		person.setAddress("New Delhi");

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Address: " + person.getAddress());
	}
}
