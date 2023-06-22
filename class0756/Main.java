package class0756;

public class Main {
	public static void main(String[] args) {
		Coincase coincase = new Coincase();

		for (int i = 0; i < 10; i++) {
			int coinType = 500;
			int count = 5;
			coincase.getCoins(coinType, count);
		}

		System.out.println("500円は" + coincase.GetCount(500) + "枚");
		System.out.println("100円は" + coincase.GetCount(100) + "枚");
		System.out.println("50円は" + coincase.GetCount(50) + "枚");
		System.out.println("10円は" + coincase.GetCount(10) + "枚");
		System.out.println("5円は" + coincase.GetCount(5) + "枚");
		System.out.println("1円は" + coincase.GetCount(1) + "枚");
		System.out.println("総枚数は" + coincase.GetCount(0) + "枚");
		System.out.println("500円の総額は" + coincase.GetAmount(500) + "円");
		System.out.println("100円の総額は" + coincase.GetAmount(100) + "円");
		System.out.println("50円の総額は" + coincase.GetAmount(50) + "円");
		System.out.println("10円の総額は" + coincase.GetAmount(10) + "円");
		System.out.println("5円の総額は" + coincase.GetAmount(5) + "円");
		System.out.println("1円の総額は" + coincase.GetAmount(5) + "円");

	}
}
