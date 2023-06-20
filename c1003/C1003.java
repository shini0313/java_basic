/**
 * 質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂
字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
public static void main(String...args) {
 String value = ”abced12345あいうえお１２３４５”;
 // バイト数は？
 // 桁数は？
}
 */
package c1003;

public class C1003 {
	public static void main(String... args) {
		String value = "abced12345あいうえお１２３４５";
	
		
		System.out.println("abced12345あいうえお１２３４５".length());
		System.out.println("abced12345あいうえお１２３４５".getBytes().length);

	}
}
