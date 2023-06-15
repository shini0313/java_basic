/**
 * 設問１︓1から100までの偶数の和を求める(for + if)。

 * @author shini
 *
 */
public class R0501 {

	public static void main(String[] args) {
		
		 int sum=0;
		 
		for(int i = 0 ;i <= 100 ; i++) {
			
			if( i % 2 == 0 ) {
				
				sum=sum+i;
				
			}
		
			
		}
		
		
	System.out.println("和："+sum);

	}

}
