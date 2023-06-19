/**
 * クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成しま
す。変数catのsayHello()メソッドを呼び出してください。
1. 属性︓年齢
2. 属性︓名前
3. 属性︓分類
4. コンストラクタ︓名前を渡して、初期化する
5. 操作︓sayHello()︓void
6. 操作︓getName(): String ⾃分の名称を返す
 */
package c0913;

public class Animal {
	
	private int age;
	
	private String name;
	
	private String classname;
	
	public Animal(int age , String name , String classname) {
		
		this.age = age;
		
		this.name = name;
		
		this.classname = classname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		
		return name;
	}
	public void setClassname(String classname) {
		this.classname = classname;
		
	}
	public String getClassname() {
		return classname;
		
	}
	public void hello() {
		 System.out.println("こんにちは");
		 }


}
