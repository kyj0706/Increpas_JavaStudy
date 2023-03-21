package mymain.tcp.multichat.serial;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

//���� �߿��Ѱ� �̰Ŵ�.
//������ �͵��� ����ȭ�� ���������� ���� ����Ȯ�� 
//�� ���͵��� ����ȭ ��Ű�ڴٴ� �� �� ���� 
public class Data implements Serializable {

	public static final int IN = 1;
	public static final int OUT = 2;
	public static final int LIST = 3;
	public static final int MSG = 4;
	public static final int DRAW = 5;

	public int protocol; // ���۵����� ����

	public String user_name; // ��ȭ��
	public String message; // ����
	public ArrayList<String> userList; // ������ ���

	// �׸�������
	public Point pt; // ��ǥ
	public int line_thick; // ����
	public Color line_color; // ����
	// ����ȭ�� �Ǵ��� �ȵǴ��� Ȯ���� Serializable�̰� �����ϸ� ���� �ϴ�.~!!
	// public���� �� ���� ������ ������
	// �����ڴ� ����� ������ �ʴ°� ���� .
	// get/set����

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
