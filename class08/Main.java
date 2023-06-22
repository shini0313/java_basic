package class08;

public class Main {

	public static void main(String[] args) {

		Cat cat = new Cat();

		cat.Name = "mimi";

		cat.Age = 3;

		cat.ShowProfile();

		cat.Sleep();

		cat.Speak();

		Dog dog = new Dog();

		dog.Name = "wangcai";

		dog.Age = 6;

		dog.ShowProfile();

		dog.Run();

		dog.Speak();

		Animal[] animals = new Animal[4];

		animals[0] = new Cat();

		animals[1] = new Dog();

		animals[2] = new Cat();

		animals[3] = new Dog();

		for (Animal animal : animals) {

			animal.Speak();
		}

	}

}
