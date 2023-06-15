/**
 * 質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
 * @author shini
 *
 */
public class R0507 {

	public static void main(String[] args) {
		
		int array[]= new int[] {7, 5, 3, 4, 6, 1, 8};
		
		for(int i = 0 ; i< array.length ; i++) {
			
			for(int j =0; j < array.length ; j++) {
				
				if( array[i] < array[j]) {
					
				    int temp = 0;
				    
				    temp = array[i];
				    
				    array[i] = array[j];
				    
				    array[j] = temp;
				}
			}
			
		}
		for(int i = 0 ; i< array.length ; i++) {
			
			System.out.print(" " + array[i]);
		}
	//	System.out.print(" "+ Arrays.toString(array));
		
	}

}
