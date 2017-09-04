package AbstractAndInterface;

public class JCB{

	public static int chargePrice_;
	private int chargeSum;

	//コンストラクタ
	public void Suica() {

	}

	//Apple PayにJCBカードを登録するメソッド
	public void applePaySuicaRegist(Iphone7 wallet) {
		wallet.applePayCardRegist("jcb");
	}

}
