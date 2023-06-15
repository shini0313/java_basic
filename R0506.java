/**
 * 質問６︓任意⾏列（２次元配列）の積を求める。
 * @author shini
 *
 */
public class R0506 {

	public static void main(String[] args) {
		
		int [][]array2d = new int [][] {
			
			{1, 2, 3, 4, 5},
			{7, 9, 11, 13, 15}
		};
		
		int seki = 1;
	
		for (int i = 0 ; i < array2d.length ; i++) {
			for(int j = i+1 ; j < array2d[i].length ; j++) {
				
				seki = seki * array2d[i][j];
				
				System.out.println("積："+ seki);
			}
		}
		
 
	}

}
