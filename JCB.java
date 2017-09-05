package AbstractAndInterface;

public class JCB{


	//コンストラクタ
	public void Jcb() {

	}

	//Apple PayにJCBカードを登録するメソッド
	public void applePayJcbRegist(Iphone7 wallet) throws CheckException {
		wallet.applePayCardRegist("jcb");
	}

}
