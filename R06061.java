/**
 * 以下静的なメソッドを定義してください。
 * 1. メソッド名: megerArray
2. 引数１︓intの配列 left
3. 引数２︓intの配列 right
4. 戻り値︓intの配列
5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
 * @author shini
 *
 */
public class R06061 {

	public static void main(String[] args) {

		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };

		int result[] = megerArray(left, right);

		printArray(result);

		//	System.out.println(Arrays.toString(result));

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
	 * 引数left と 引数right をマージして、新しい配列を作成して返却する。
	 * @param left　配列
	 * @param right　配列
	 * @return result　配列
	 */
	public static int[] megerArray(int[] left, int[] right) {

		int[] result = new int[left.length + right.length];

		int index = 0;

		for (int i = 0; i < left.length; i++) {

			result[index] = left[i];

			index++;
		}

		for (int i = 0; i < right.length; i++) {

			result[index] = right[i];

			index++;
		}

		return result;

	}

}
