package AbstractAndInterface;

public abstract class Smartphone {

	//音声通話の抽象メソッドを定義（Call()をオーバーロード）
	abstract void Call(String phoneNumber);

	//LINE通話の抽象メソッドを定義（Call()をオーバーロード）
	abstract void Call(int lineId);

	//音楽ダウンロードのメソッドを定義
	abstract void downloadMusic();

}
