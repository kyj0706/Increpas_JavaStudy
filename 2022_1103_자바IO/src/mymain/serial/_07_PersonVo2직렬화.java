package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;
import vo.PersonVo2;

public class _07_PersonVo2직렬화 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//(객체)직렬화 : 객체를 순서대로 분해하는 과정
		PersonVo2 p = new PersonVo2("일길동 ", 20, "서울시 관악구 신림동");
		//System.out.println(p);
		//열리는 순서1
		OutputStream os = new FileOutputStream("person_2.dat");
		
		//열리는순서2
		//객체직렬화 처리객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		
		//직렬화처리(화일저장)
		oos.writeObject(p);
		
		
		
		
		
		
		//닫기(열린역순)
		oos.close();//2
		os.close();//1
	}

}
