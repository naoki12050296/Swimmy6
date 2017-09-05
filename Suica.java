package AbstractAndInterface;

import java.util.ArrayList;

public class Suica{
	
	public static ArrayList<Integer> show = new ArrayList<Integer>();

	public static int chargePrice_;
	private int chargeSum;

	//コンストラクタ
	public void Suica() {

	}

	//Apple PayにSuicaを登録するメソッド
	public void applePaySuicaRegist(Iphone7 wallet) {
		wallet.applePayCardRegist("suica");
	}

	//Suicaにチャージするメソッド
	public void suicaCharge(Iphone7 wallet) throws CheckException {
			Iphone7.cardCheck("suica");
			System.out.println("チャージ金額を入力してください");
			int chargePrice = new java.util.Scanner(System.in).nextInt();
			chargePrice_ = chargePrice;
			show.add(chargePrice);
			chargeSum += chargePrice;
			wallet.applePaySettlement("jcb");
			System.out.println("現在のSuica残金は"+this.chargeSum+"円です");
			System.out.println("続けてチャージしますか？ 0:する 1:しない");
			int nextCharge = new java.util.Scanner(System.in).nextInt();
				if(nextCharge == 0) {
					System.out.println("続けてチャージを行います");
					suicaCharge(wallet);
				} else if(nextCharge == 1) {
					System.out.println("チャージは終了します");
				} else {
					System.out.println("入力された値が不正です");
				}
	}
	//履歴を一覧で見るメソッド
	public void showSuica() {
		System.out.println("過去のチャージ履歴を表示します");
			for(int i = 0 ; i < show.size(); i++) {
				int price = show.get(i);
				System.out.println(price+"円チャージしました");
			}
	}

}
