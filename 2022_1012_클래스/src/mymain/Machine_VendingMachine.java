package mymain;

import java.util.Scanner;

import myutil.VendingMachine;

public class Machine_VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է�
		Scanner scanner = new Scanner(System.in);
		int money; //���Ǳ� �Է±ݾ�
		int drink; //��������
		
		String yn = "y";//��ӿ���
		
		VendingMachine vendingMachine = new VendingMachine();
		
		while(true) {
			
			System.out.print("�ݾ�:");
			money = scanner.nextInt();
			
			System.out.print("���ἱ��(1.�ݶ� 2.�꽺 3.���̴� 4.����):");
			drink = scanner.nextInt();
			
			
			//���Ǳ⿡ ���� �Ѱ��ش�
			vendingMachine.insertCoin(money);
			vendingMachine.selectDrink(drink);
			
			//���Ǳ� ó����� ���
			vendingMachine.displayResult();
			
			
			
			//��ӿ���
			System.out.print("���?(y/n):");
			yn = scanner.next();
			
			//y�� �ƴϸ� ������..
			if(!yn.equalsIgnoreCase("Y"))break;
			
		}//end while
		
		System.out.println("---End---");
			
		
		
		scanner.close();
	}

}