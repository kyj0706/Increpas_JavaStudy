package mymain;

import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _05_ArrayListTest_PersonVo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// <Generic> : ����Ÿ���� ����
		List<PersonVo> p_list = new ArrayList<PersonVo>();

		p_list.add(new PersonVo("�ϱ浿",21,"����� ���Ǳ� ����1��"));
		p_list.add(new PersonVo("�̱浿",22,"����� ���Ǳ� ����2��"));
		p_list.add(new PersonVo("��浿",23,"����� ���Ǳ� ����3��"));
		p_list.add(new PersonVo("��浿",24,"����� ���Ǳ� ����4��"));
		p_list.add(new PersonVo("���浿",25,"����� ���Ǳ� ����5��"));
		
		
		PersonVo p1 = p_list.get(0);
		
		//���� ��� �ؽð��� ��µȴ�.
		//System.out.println(p_list.get(0));
		//System.out.println(p1.toString());//toString�� ������... ������ �°ɱ�?
		System.out.println(p1);
		
		System.out.println("--[��ü��ȸ(���� loop]--");
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
		System.out.println("--[��ü��ȸ(÷���̿�)]--");
		for(int i=0; i<p_list.size(); i++) {
			PersonVo p =p_list.get(i);
			
			String name = p.getName();
			
			System.out.printf("[%s]�� ���� : %s\n",name,p);
		}
		
	}

}
