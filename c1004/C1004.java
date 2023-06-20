/**
 * 質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似て
いるメソッドを実装してください。

public static boolean nullOrEmpty(String value) {
 // value は null or Empty 判断してください。
}
 */
package c1004;

public class C1004 {
	public static void main(String[] age) {

		String value1 = null;

		String value2 = "";

		String value3 = "hello";

		System.out.println(nullOrEmpty(value1));

		System.out.println(nullOrEmpty(value2));

		System.out.println(nullOrEmpty(value3));

	}

	public static boolean nullOrEmpty(String value) {

		return value == null || value.isEmpty();
	}

}
