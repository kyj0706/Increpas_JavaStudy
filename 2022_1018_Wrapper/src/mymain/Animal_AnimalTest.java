package mymain;


import myutil.AnimalTest;

public class Animal_AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�̸� �ڻԼ�
		
		

		//���� 3��
		
		//AnimalTest animal = new AnimalTest(true, 3, "ū�Լ�");
		AnimalTest animal = new AnimalTest();
		
		//��ü ���� ���
		animal.getName(3, "ū�Լ�");
		animal.getLive(true);
		animal.display();
		
		//��ü ���� 
		String name = "�ر�";
		boolean live = false;
		animal.setName(name);
		
		//���
		animal.display();
		
		
		
		
		
		
		

	}

}
