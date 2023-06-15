/**
 * バブルソート⽤メソッドを作成してください。
1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
 * @author shini
 *
 */
public class R0608 {

	public static void main(String[] args) {

		int[] array = { 5, 2, 8, 1, 9 };

		bubbleSort(array);

		printArray(array);

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
	 * bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
	 * @param array　配列
	 * @return array　配列
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
}
