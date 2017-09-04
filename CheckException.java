package AbstractAndInterface;

public class CheckException extends Exception{
	public CheckException(String str){
		super(str);
	}
}

//カードが登録されていない場合の例外
class NotRegistCard extends CheckException{
	public NotRegistCard(){
		super("カードが登録されていません");
	}
}
