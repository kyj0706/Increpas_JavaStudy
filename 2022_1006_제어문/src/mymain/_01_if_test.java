package mymain;

import java.util.Scanner;

public class _01_if_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Ű�����Է�
				Scanner scanner = new Scanner(System.in);
				
				int age = 20;
				String res= "";
				
				//���̸� �Է¹޴´�
				System.out.print("����:");
				age = scanner.nextInt();
				
				
				if(age<10)
				{
					System.out.println("����:age<10");
					res = "�Ƶ�";
				}
				else
				{
					if(age>=10 && age<20)
					{
						System.out.println("����:age>=10 && age<20");
						res = "û�ҳ�";
					}
					else
					{
						if(age>=20 && age<40)
						{
							System.out.println("����:age>=20 && age<40");
							res = "����";
						}
						else
						{
							if(age>=40 && age<60)
							{
								System.out.println("����:age>=40 && age<60");
								res = "���";
							}
							else
							{
							    if(age>=60)
							    {
							    	System.out.println("����:age>=60");
							    	res = "���";
							    }
							}
						}
					}
				}
				
				System.out.printf("[%d]�� [%s]�Դϴ�\n", age,res);
				
				
				scanner.close();
					
				
			}

		}