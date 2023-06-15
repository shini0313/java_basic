/**
 * 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
び出してください。
 * @author shini
 *
 */
public class R0602 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		int sum = sum(array);
		System.out.println("和：" + sum);
		
		int max = max(array);
		System.out.println("最大値："+max);
		
		int min = min(array);
		System.out.println("最小値：" + min);

	}

	/**
	 * 行列の和を求める。
	 * @param datas 配列
	 * @return sum 和
	 */
	public static int sum(int[] datas) {

		int sum = 0;

		for (int i : datas) {

			sum += i;
		}
		return sum;

	}
	/**
	 * 最大値を求める
	 * @param datas　配列
	 * @return　max 最大値
	 */
	public static int max(int[] datas) {
		
		int max = datas[0];
		
		for(int i : datas  ) {
			
			if(i >= max)
			
			max = i ;
		}
		return max;
	}
	/**
	 * 最小値を求める
	 * @param datas　配列
	 * @return　min 最小値
	 */

	public static int min(int[] datas) {
		
		int min = datas[0] ;
		
		for(int i : datas) {
			
			if(i < min) {
				
				min = i;
			}
			
		}
		return min;
	}
}
