/**
 * 以下コンパイルを修正してください。
 * // Parent.java
public class Parent {
 public void hello() {
 System.out.println("parent method");
 }
}
// Child.java
public class Child extends Parent {
 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
 public void hello() {
 System.out.println("child method");
 }
}
// Kicker.java
public class Kicker {
 public static void print(Child v) {
 v.hello();
 }
 public static void main(String...args) {
 print(new Parent());
  print(new Child());
 }
}


 */
package c0803;

public class Parent {
	
	public void hello() {
		System.out.println("parent method");
	}

}
