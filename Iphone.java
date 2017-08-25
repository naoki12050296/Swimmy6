package AbstractAndInterface;

public class Iphone extends Smartphone{

		//音声通話の抽象メソッドをオーバーライド
		public void voiceCall() {
			System.out.println("音声通話します");
		}

		//LINE通話の抽象メソッドをオーバーライド
		public void lineCall() {
			System.out.println("LINE通話します");
		}

		//音楽ダウンロードのメソッドをオーバーライド
		public void downloadMusic() {
			System.out.println("音楽をダウンロードします");
		}
}
