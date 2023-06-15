/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * @author shini
 *
 */
public class R0503 {

	public static void main(String[] args) {

		int array[]= new int [] {1, 2, 6, 7, 9, 6, 2, 1} ;
		
		int max =array[0];
		int min = array[0];
		float sum = 0f;
		float average = 0f;
		
		for(int i = 0 ; i < array.length ; i++ ) {
			
			if(array[i]>=max) {
				max = array[i];
			}
			
			if(array[i]<=min) {
				min=array[i];
			}
			
			sum = sum+array[i];
			
			average = sum / array.length;
			
		}
				
	System.out.println("最大値："+max);
	System.out.println("最小値："+min);
	System.out.println("和："+sum);
	System.out.println("平均値："+average);
	}

}
