/**
 * 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
 * @author shini
 *
 */
public class R0504 {

	public static void main(String[] args) {
		
		int array[]= new int [] {1, 2, 6, 7, 9, 6, 2, 1} ;
		
		for(int i = 0 ; i< array.length; i++) {
			
			for(int j = 0 ; j < array.length ; j++) {
				
				if(i != j && array[i]==array[j]) {
					
					System.out.println("重複ある要素" + array[i]);
					break;
				}
				
				
				
			}
		}

	}

}
