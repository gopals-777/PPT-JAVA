class Animal {
	public void makeSound() {
		System.out.println("Animal");
	}
}

class Cat extends Animal {

	@Override
	public void makeSound() {
		System.out.println("meowwwwwwwwww");
	}
}

class Dog extends Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("bark bark");
	}

}

class Cow extends Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("mooooooooooo");
	}

}

public class Test1 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		cat.makeSound();
		dog.makeSound();
		cow.makeSound();
	}
}
