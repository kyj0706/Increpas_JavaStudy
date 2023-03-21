package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _05_PersonVo리스트직렬화 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//(객체)직렬화 : 객체를 순서대로 분해하는 과정
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		
		p_list.add(new PersonVo("일길동 ", 20, "서울시 관악구 신림1동"));
		p_list.add(new PersonVo("이길동 ", 21, "서울시 관악구 신림2동"));
		p_list.add(new PersonVo("삼길동 ", 22, "서울시 관악구 신림3동"));
		p_list.add(new PersonVo("사길동 ", 23, "서울시 관악구 신림4동"));
		p_list.add(new PersonVo("오길동 ", 24, "서울시 관악구 신림5동"));
		
		
	
		//System.out.println(p);
		//열리는 순서1
		OutputStream os = new FileOutputStream("person_list.dat");
		
		//열리는순서2
		//객체직렬화 처리객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		
		//직렬화처리(화일저장)
		oos.writeObject(p_list);
		
		
		
		
		
		
		//닫기(열린역순)
		oos.close();//2
		os.close();//1
	}

}
