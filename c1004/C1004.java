/**
 * 質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似て
いるメソッドを実装してください。

public static boolean nullOrEmpty(String value) {
 // value は null or Empty 判断してください。
}
 */
package c1004;

public class C1004 {
	public static boolean nullOrEmpty(String value) {
		
	    return value == null || value.isEmpty();
	}
}
