package _02_cat;

public class Runner {
	public static void main(String[] args) {
		new Cat("kitty");
		Cat.meow();
		Cat.printName();
		for(int i = 0; i < 9; i++) {
			Cat.kill();
		}
	}
}
