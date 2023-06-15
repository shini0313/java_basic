/**
 * 以下静的なメソッドを定義してください。
1. メソッド名: subArray
2. 引数１︓intの配列 array
3. 引数２︓開始のstartIndex
4. 引数３︓⻑さlength
5. 戻り値︓intの配列
6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
 * @author shini
 *
 */
public class R06062 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4 };

		int startIndex = 1;

		int length = 2;

		int[] result = subArray(array, startIndex, length);

		printArray(result);

	}

	/**
	 * 配列出力
	 * @param objs
	 */
	public static void printArray(int[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	/**
	 * startIndexからstartIndex + lengthまでサブ配列を取得する
	 * @param array　配列
	 * @param startIndex　始まる値
	 * @param length　長さ
	 * @return subArray　
	 */
	public static int[] subArray(int[] array, int startIndex, int length) {

		int[] subArray = new int[length];

		for (int i = 0; i < length; i++) {

			subArray[i] = array[startIndex + i];
		}

		return subArray;
	}
}
