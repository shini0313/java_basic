/**
 * ︓メソッドの呼び出す練習。
1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください。
 * @author shini
 *
 */
public class R0609 {

	public static void main(String[] args) {

		int[] left = new int[] { 6, 8, 1, 5, 3 };
		int[] right = new int[] { 2, 4, 9, 7, 0 };

		int result[] = megerArray(left, right);

		printArray(result);

		int result2[] = bubbleSort(result);

		printArray(result2);

	}

	/**
	 * ２つ配列をマージする
	 * @param left　配列
	 * @param right　配列
	 * @return　result 配列
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

	/**
	 * ソート処理
	 * @param array 配列
	 * @return array 配列
	 */
	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {

				if (array[i] < array[j]) {

					int temp = 0;

					temp = array[i];

					array[i] = array[j];

					array[j] = temp;
				}
			}
		}
		return array;

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

}
