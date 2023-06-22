package class0756;

public class Coincase {
	private int coin500 = 0;
	private int coin100 = 0;
	private int coin50 = 0;
	private int coin10 = 0;
	private int coin5 = 0;
	private int coin1 = 0;

	public void getCoins(int kind, int count) {
		switch (kind) {
		case 500:
			coin500 += count;
			break;
		case 100:
			coin100 += count;
			break;
		case 50:
			coin50 += count;
			break;
		case 10:
			coin10 += count;
			break;
		case 5:
			coin5 += count;
			break;
		case 1:
			coin1 += count;
			break;
		}
	}

	public int GetCount(int kind) {
		switch (kind) {
		case 500:
			return coin500;
		case 100:
			return coin100;
		case 50:
			return coin50;
		case 10:
			return coin10;
		case 5:
			return coin5;
		case 1:
			return coin1;
		}
		return 0;

	}

	public int GetAmount() {
		int Amount = (coin500 * 500) + (coin100 * 100) + (coin50 * 50) + (coin10 * 10) + (coin5 * 5) + coin1;
		return Amount;
	}

	public int GetAmount(int kind) {
		switch (kind) {
		case 500:
			return coin500 * 500;
		case 100:
			return coin100 * 100;
		case 50:
			return coin50 * 50;
		case 10:
			return coin10 * 10;
		case 5:
			return coin5 * 5;
		case 1:
			return coin1;
		}
		return 0;
	}

}
