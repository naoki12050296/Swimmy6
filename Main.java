package AbstractAndInterface;

public class Main {

	public static void main(String[] args) throws CheckException {

		Iphone7 iphone7 = new Iphone7();

		//音声通話する
		iphone7.Call("本田尚大");

		//LINE電話する
		iphone7.Call(1205);

		//音楽をダウンロードする
		iphone7.downloadMusic();

		//JCBカードをApplePayに登録する
		iphone7.applePayCardRegist("jcb");

		//Suicaクラスをインスタンス化
		Suica suica = new Suica();

		//ApplePayにSuicaを登録
		suica.applePaySuicaRegist(iphone7);

		//Suicaにチャージ
		suica.suicaCharge(iphone7);

		//登録したSuicaで決済する
		iphone7.applePaySettlement("suica");

		//登録したクレジットカード（JCB）で決済する
		iphone7.applePaySettlement("jcb");
		
		//今までのチャージ履歴をみる
		suica.showSuica();

		//登録していないクレジットカード（VISA）で決済する(例外処理発生)
		iphone7.applePaySettlement("visa");

	}

}
