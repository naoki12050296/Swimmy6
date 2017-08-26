package AbstractAndInterface;

public interface Wallet {

	//お会計のメソッドを宣言
	public void pay();

	//カードを登録するメソッド
	public void applePayCardRegist(String cardName);

	//Apple Payで決済するメソッド
	public void applePaySettlement(String cardName,int price);
}
