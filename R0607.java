/**
 * 以下静的なメソッドを定義してください。
1. メソッド名︓trim
2. 引数１︓charの配列
3. 戻り値︓charの配列
4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。

 * @author shini
 *
 */
public class R0607 {

	public static void main(String[] args) {

		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };

		char[] trim = trim(input);

		printArray(trim);
	}

	/**
	 * 引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
	 * @param array 配列
	 * @return trimmedArray　配列
	 */
	public static char[] trim(char[] array) {

		int startIndex = 0;
		int endIndex = array.length - 1;

		while (startIndex <= endIndex && array[startIndex] == ' ') {
			startIndex++;
		}

		while (endIndex >= startIndex && array[endIndex] == ' ') {
			endIndex--;
		}

		int length = endIndex - startIndex + 1;

		char[] trimmedArray = new char[length];

		System.arraycopy(array, startIndex, trimmedArray, 0, length);

		return trimmedArray;
	}

	/**
	 * 配列出力
	 * @param objs
	 */
	public static void printArray(char[] objs) {
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

}
