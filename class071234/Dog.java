package class071234;

public class Dog {

	private String name;
	private int age;
	private String kind;

	public Dog(String name, int age, String kind) {

		this.name = name;
		this.age = age;
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void ShowProfile() {
		System.out.println("名前は、" + name + "です。" + "  " + "年齢は" + age + "歳です。" + "種類は" + kind + "です。");
	}
}
