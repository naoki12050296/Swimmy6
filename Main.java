package AbstractAndInterface;

public class Main {

	public static void main(String[] args) {
		Iphone7 phone = new Iphone7();

		//音声通話する
		phone.Call("本田尚大");

		//LINE電話する
		phone.Call(1205);

		//音楽をダウンロードする
		phone.downloadMusic();

		//お会計をする
		phone.pay();

	}

}
