import java.util.Scanner;

public class if_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// 2210006����

				// Ű�����Է�
				Scanner scanner = new Scanner(System.in);

				int age = 20;
				String res = "";
				//�̰� �� null �� ���� ?


				// ���̸� �Է¹޴´�.
				System.out.print("����:");
				age = scanner.nextInt();

				// ����1
				// ����� =>�̷��� �ص� �Ǵµ� �ϳ��ϳ� ó���ϱ⶧���� ���� �ɸ���.
				// => ������ ���������. ������= ����ڰ� ������ ....
				// if(age <10) res ="�Ƶ�";
				// if(age >=10 && age <20) res ="û�ҳ�";
				// if(age >=20 && age <40) res ="����";
				// if(age >=40 && age <60) res ="���";
				// if(age >=60) res ="���";

				// System.out.printf("[%d]�� [%s]�Դϴ�.\n",age, res);
				// System.out.printf("%s",res);

				// ����2
				// ����
				if (age < 10) 
				{
					System.out.println("����:age<10");
					res = "�Ƶ�";
				} 
				else 
				{
					if (age >= 10 && age < 20) 
					{
						System.out.println("����:age >=10 && age <20");
						res = "û�ҳ�";
					}
					else 
					{
						if (age >= 20 && age < 40)
						{
							System.out.println("����:age >= 20 && age < 40");
							res = "����";
						}
						else
						{
							if (age >= 40 && age < 60)
							{
								System.out.println("����:age >= 40 && age < 60");
								res = "���";
							}
							else
							{
								if (age >= 60)
								{				
									System.out.println("����:age >= 60");
									res = "���";
								}
							}
						}	
					}

					

					System.out.printf("[%d]�� [%s]�Դϴ�.\n", age, res);
					System.out.printf("%s", res);

					/*
					 * �����Ѱ� �׳� if �� ������ if (age <= 10) { System.out.print("�Ƶ�");
					 * 
					 * }if (age >=10 && age <=19) { System.out.print("û��");
					 * 
					 * }if (age >=20 && age <=39) { System.out.print("����");
					 * 
					 * }if (age >=40 && age <59) { System.out.print("���");
					 * 
					 * }if (age <= 60) { System.out.print("���");
					 * 
					 * } else System.out.println("death");
					 */

					// �Է�����
					scanner.close();

				}

			}
		}
