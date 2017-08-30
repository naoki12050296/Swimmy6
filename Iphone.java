package AbstractAndInterface;

public class Iphone extends Smartphone{

		public static String cardName_;

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

		//カード未登録の場合の例外処理
		public void check() throws CheckException{
			if(Iphone7.cardName_ == null) {
				throw new NotRegistCard();
			} else {}
	}
}
