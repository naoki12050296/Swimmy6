package AbstractAndInterface;

public interface Wallet {

	//カードを登録するメソッド
	public void applePayCardRegist(String cardName) throws CheckException;

	//Apple Payで決済するメソッド
	public void applePaySettlement(String cardName) throws CheckException;
}
