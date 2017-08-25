package AbstractAndInterface;

public class Suica {
	
	String cardName;
	int chargePrice;
	
	//Apple PayにSuicaを登録するメソッド
	public void applePaySuicaRegist() {
		System.out.println(this.cardName+"をApple Payに登録しました");
	}

	//Apple Payにチャージするメソッド
	public void applePayCharge() {
		System.out.println("チャージ金額を入力してください");
		int chargePrice = new java.util.Scanner(System.in).nextInt();
		System.out.println(this.chargePrice+"円をチャージしました");
	
	}

	
}
