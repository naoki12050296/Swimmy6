package AbstractAndInterface;

public class Suica{

	private int chargePrice_;
	private int chargeSum;
	public static String cardName_;

	//コンストラクタ
	public void Suica() {

	}

	//Apple PayにSuicaを登録するメソッド
	public void applePaySuicaRegist(Iphone7 wallet) {
		wallet.applePayCardRegist("suica");
	}

	//Suicaにチャージするメソッド
	public void suicaCharge(Iphone7 wallet) throws CheckException {
		if(Iphone7.cardName_ == "suica") {
			cardName_ = "suica";
			System.out.println("チャージ金額を入力してください");
			int chargePrice = new java.util.Scanner(System.in).nextInt();
			chargeSum += chargePrice;
			System.out.println("現在のSuica残金は"+this.chargeSum+"円です");
			System.out.println("続けてチャージしますか？ 0:する 1:しない");
			int nextCharge = new java.util.Scanner(System.in).nextInt();
				if(nextCharge == 0) {
					System.out.println("続けてチャージを行います");
					suicaCharge(wallet);
				}
				else if(nextCharge == 1){
					System.out.println("チャージは終了します");
				}
				else {
					System.out.println("入力された値が不正です");
				}
		} else {
			System.out.println("Suicaが登録されていません");
		}
		wallet.applePaySettlement(cardName_,chargeSum);
	}

}
