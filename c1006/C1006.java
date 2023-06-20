/**
 * 質問６︓整数16の16進数をSystem.out.println()してください。
 */

package c1006;

public class C1006 {

	public static void main(String[]args) {
		
	int number = 16;
	
	String format = String.format("%x", number);
	
	System.out.println(format);
	}
}
