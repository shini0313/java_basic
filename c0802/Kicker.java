package c0802;

public class Kicker {
	
	public static void main(String...args) {
		
		Employee x = new Employee("1234");
		
		Employee y = new Employee("1234");
		
		System.out.println(x==y);
		//x和y是通过两个不同的new分别创建的，是不同的内存地址，所以false
		
		System.out.println(x.equals(y));
		//里面的结果都是1234，所以是true
	}

}
