package myutil;


//interface는 다중상속이 가능하다.(클래스는 단일 상속만된다.)
public interface RemoteCon extends Channel,Volume{

	void onOff();
}
