/**
 * 質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
1. 浮動⼩数点数
2. ⻑さは5桁数
3. 精度は⼩数点後2位
 */
package c1005;

public class C1005 {

	public static void main(String[] args) {
        double value = 123.45678; 

        String i = String.format("%5.2f", value);

        System.out.println(i);
    }
	
}
