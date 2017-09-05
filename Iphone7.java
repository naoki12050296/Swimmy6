package AbstractAndInterface;

import java.util.ArrayList;

public class Iphone7 extends Iphone implements Wallet{

	public static ArrayList<String> cardlist = new ArrayList<String>();

	//コンストラクタ
	public Iphone7() {
	}

	//ApplePayにカードを登録
	public void applePayCardRegist(String cardName) {
		cardlist.add(cardName);
		System.out.println(cardName+"を登録しました");
	}

	//指定したカードでの決済を行う
	public void applePaySettlement(String cardName) throws CheckException {
		Iphone7.cardCheck(cardName);
		System.out.println(cardName+"で支払います");
		}
	
	//カードが登録されているのか調べるメソッド
	public static void cardCheck(String cardName) throws CheckException{
		boolean exists = Iphone7.cardlist.contains(cardName);
		if(exists == true) {
			return;
		} else {
			throw new NotRegistCard();
		}
	}
}




