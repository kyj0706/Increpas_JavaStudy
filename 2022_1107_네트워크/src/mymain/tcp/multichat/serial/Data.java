package mymain.tcp.multichat.serial;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

//가장 중요한게 이거다.
//선언한 것들이 직렬화가 가능한지에 대한 여부확인 
//그 모든것들을 직렬화 시키겠다는 ↓ 를 선언 
public class Data implements Serializable {

	public static final int IN = 1;
	public static final int OUT = 2;
	public static final int LIST = 3;
	public static final int MSG = 4;
	public static final int DRAW = 5;

	public int protocol; // 전송데이터 종류

	public String user_name; // 대화명
	public String message; // 내용
	public ArrayList<String> userList; // 접속자 목록

	// 그리기정보
	public Point pt; // 좌표
	public int line_thick; // 굵기
	public Color line_color; // 색상
	// 직렬화가 되는지 안되는지 확인은 Serializable이게 존재하면 가능 하다.~!!
	// public으로 한 이유 수업의 목적상
	// 생성자는 어설프게 만들지 않는게 좋다 .
	// get/set으로

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("P[%d]-U[%s]-M[%s]", protocol, user_name, message);
	}

	public int getProtocol() {
		return protocol;
	}

	public void setProtocol(int protocol) {
		this.protocol = protocol;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getMesaage() {
		return message;
	}

	public void setMesaage(String mesaage) {
		this.message = mesaage;
	}

	public ArrayList<String> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<String> userList) {
		this.userList = userList;
	}

	public Point getPt() {
		return pt;
	}

	public void setPt(Point pt) {
		this.pt = pt;
	}

	public int getLine_thick() {
		return line_thick;
	}

	public void setLine_thick(int line_thick) {
		this.line_thick = line_thick;
	}

	public Color getLine_color() {
		return line_color;
	}

	public void setLine_color(Color line_color) {
		this.line_color = line_color;
	}

}
