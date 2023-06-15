/**
 * 質問５︓質問３の配列に値「７」のインデックスを求む。
 * @author shini
 *
 */
public class R0505 {

	public static void main(String[] args) {
		
		int array[]= new int [] {1, 2, 6, 7, 9, 6, 2, 1} ;
		
		for(int i = 0 ; i < array.length ; i++) {
			
			if(array[i] == 7) {
				
				System.out.println("値「７」のインデックス" +i);
				
			}
		}
		

	}

}
