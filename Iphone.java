package AbstractAndInterface;

public class Iphone extends Smartphone{

		//音声通話の抽象メソッドをオーバーライド
		public void Call(String phoneNumber) {
			System.out.println(phoneNumber+"に音声通話します");
		}

		//LINE通話の抽象メソッドをオーバーロード
		public void Call(int lineId) {
			System.out.println(lineId+"にLINE通話します");
		}

		//音楽ダウンロードのメソッドをオーバーロード
		public void downloadMusic() {
			System.out.println("音楽をダウンロードします");
		}
}
