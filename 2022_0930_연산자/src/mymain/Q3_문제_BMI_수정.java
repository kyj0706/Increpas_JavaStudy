package mymain;

import java.util.Scanner;

public class Q3_����_BMI_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BMI(Body Mass Indexer): üĥ�� ���
		
		Scanner scanner = new Scanner(System.in);
		
		//���� 
		double body_height;//Ű
		double body_weight;//������
		
		double bmi = 18.5;
		
		String body_state="����";
		
		System.out.print("Ű:");
		body_height = scanner.nextDouble();
		
		System.out.print("������:");
		body_weight = scanner.nextDouble();
		
		
		
		//bmi��� : ������ /(Ű(m)) * Ű(m))
		bmi = body_weight/((body_height/100) * (body_height/100));
		//�����
		//����������
		double body_height_m = body_height/100; //Ű
		bmi = body_weight/(body_height_m*body_height_m);
		//�ٵ��̷��� �ϸ� ���� ���� ���ϴµ� ������ �ִ� Java API�� �ִ�.
		//Math.pow (a.b) -> a' s b ��
		bmi = body_weight/Math.pow(body_height_m,2);
		
		//!!!!!!!!!!!!!!!!!!!!!!!
		//����_221006
		
		//body_state ���� �־��ش�.
		if(bmi<18.5) body_state ="��ü��";
		else if(bmi>=18.5 && bmi < 23) body_state ="����ü��";
		else if(bmi>=23 && bmi < 25) body_state ="��";
		else if(bmi>=25 && bmi < 30) body_state ="1�ܰ� ��";
		else if(bmi>=30 && bmi < 35) body_state ="2�ܰ� ��";
		else if(bmi>=36) body_state ="3�ܰ��";
		
		
		System.out.println("======[�Է�Ȯ��]======");
		System.out.printf("[Ű]:%.1f(cm)\n[������]%.1f(kg)\n",body_height, body_weight);
		
		//���
		System.out.println("======[BMI���]======");
		System.out.printf("BMI:%.1f  ����:%s\n",bmi,body_state);
		
		//�߰�
		System.out.println("======[���� ��Ȳ��?]======");
		if(bmi>=18.5 && bmi < 23) {
			System.out.println("ǥ���Դϴ�.");
		}else if(bmi >=23 && bmi <25) {
			System.out.println("������ �ʿ��մϴ�.");
		}else {
			System.out.println("ū�� �����ϴ�.");
		}
	}

}
