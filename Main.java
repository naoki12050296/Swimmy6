package AbstractAndInterface;

public class Main {

	public static void main(String[] args) {

		Iphone7 iphone7 = new Iphone7();

		//音声通話する
		iphone7.Call("本田尚大");

		//LINE電話する
		iphone7.Call(1205);

		//音楽をダウンロードする
		iphone7.downloadMusic();

		//お会計をする
		iphone7.pay();

		//Suicaクラスをインスタンス化
		Suica suica = new Suica();

		//ApplePayにSuicaを登録
		suica.applePaySuicaRegist(iphone7);

		//Suicaにチャージ
		suica.suicaCharge(iphone7);

	}

}
