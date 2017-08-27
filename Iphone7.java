package AbstractAndInterface;

public class Iphone7 extends Iphone implements Wallet{

	public static String cardName_;

	//コンストラクタ
	public Iphone7() {

	}

	//何もしない
	public void pay() {

	}

	//ApplePayにSuicaを登録
	public void applePayCardRegist(String cardName) {
		if(cardName == "suica") {
			System.out.println("suicaがApplePayに登録されました");
			cardName_ = cardName;
		} else if(cardName == "id") {
			System.out.println("idがApplePayに登録されました");
			cardName_ = cardName;
		} else if(cardName == "quickpay") {
			System.out.println("quickpayがApplePayに登録されました");
			cardName_ = cardName;
		}else {
			System.out.println("登録カードが不正です。");
		}

		}

	//指定したカードでの決済を行う
	public void applePaySettlement(String cardName,int chargePrice) {
		System.out.println(cardName+"でのお支払いの有無を選んでください");
		System.out.println("0:お支払いあり 1:お支払いなし");
		int choice = new java.util.Scanner(System.in).nextInt();
			if(choice == 0) {
				System.out.println("お会計します");
			}
			else if(choice == 1) {
				System.out.println("チャージのみ実施しました");
			}
			else {
				System.out.println("入力された値が不正です。");
			}
	}

}
