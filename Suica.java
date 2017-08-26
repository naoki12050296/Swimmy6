package AbstractAndInterface;

public class Suica{

	private int chargePrice_;

	//コンストラクタ
	public void Suica() {

	}

	//Apple PayにSuicaを登録するメソッド
	public void applePaySuicaRegist(Wallet wallet) {
		wallet.applePayCardRegist("suica");
	}

	//Suicaにチャージするメソッド
	public void suicaCharge(Wallet wallet) {
		System.out.println("チャージ金額を入力してください");
		int chargePrice = new java.util.Scanner(System.in).nextInt();
		chargePrice_ = chargePrice;
		System.out.println(this.chargePrice_+"円をチャージしました");
		wallet.applePaySettlement("Suica",chargePrice);
	}


}
