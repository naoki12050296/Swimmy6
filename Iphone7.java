package AbstractAndInterface;

public class Iphone7 extends Iphone implements Wallet{

	//インターフェースのお会計するメソッドをオーバーライド
	public void pay() {
		System.out.println("お会計します");
	}

}
