package AbstractAndInterface;

public class Main {

	public static void main(String[] args) {
		Iphone7 phone = new Iphone7();

		//音声通話する
		phone.voiceCall();

		//LINE電話する
		phone.lineCall();

		//音楽をダウンロードする
		phone.downloadMusic();

		//お会計をする
		phone.pay();

	}

}
