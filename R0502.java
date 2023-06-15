/**
 * 設問２︓5の階乗を求める(for)。
 * @author shini
 *
 */
public class R0502 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int seki = 1;
		
		for(int i = 5 ; i>0; i--) {
			
			seki=seki * i;
			
			
		}

		System.out.println("積："+seki);
	}
}
