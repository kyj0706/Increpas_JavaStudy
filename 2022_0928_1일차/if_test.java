import java.util.Scanner;

public class if_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// 2210006참조

				// 키보드입력
				Scanner scanner = new Scanner(System.in);

				int age = 20;
				String res = "";
				//이게 왜 null 이 되지 ?


				// 나이를 입력받는다.
				System.out.print("나이:");
				age = scanner.nextInt();

				// 순서1
				// 강사님 =>이렇게 해도 되는데 하나하나 처리하기때문에 오래 걸린다.
				// => 지금은 상관없으나. 접속자= 사용자가 많으면 ....
				// if(age <10) res ="아동";
				// if(age >=10 && age <20) res ="청소년";
				// if(age >=20 && age <40) res ="성년";
				// if(age >=40 && age <60) res ="장년";
				// if(age >=60) res ="노년";

				// System.out.printf("[%d]세 [%s]입니다.\n",age, res);
				// System.out.printf("%s",res);

				// 순서2
				// 정리
				if (age < 10) 
				{
					System.out.println("조건:age<10");
					res = "아동";
				} 
				else 
				{
					if (age >= 10 && age < 20) 
					{
						System.out.println("조건:age >=10 && age <20");
						res = "청소년";
					}
					else 
					{
						if (age >= 20 && age < 40)
						{
							System.out.println("조건:age >= 20 && age < 40");
							res = "성년";
						}
						else
						{
							if (age >= 40 && age < 60)
							{
								System.out.println("조건:age >= 40 && age < 60");
								res = "장년";
							}
							else
							{
								if (age >= 60)
								{				
									System.out.println("조건:age >= 60");
									res = "노년";
								}
							}
						}	
					}

					

					System.out.printf("[%d]세 [%s]입니다.\n", age, res);
					System.out.printf("%s", res);

					/*
					 * 내가한거 그냥 if 만 걸은거 if (age <= 10) { System.out.print("아동");
					 * 
					 * }if (age >=10 && age <=19) { System.out.print("청년");
					 * 
					 * }if (age >=20 && age <=39) { System.out.print("성년");
					 * 
					 * }if (age >=40 && age <59) { System.out.print("장년");
					 * 
					 * }if (age <= 60) { System.out.print("노년");
					 * 
					 * } else System.out.println("death");
					 */

					// 입력종료
					scanner.close();

				}

			}
		}
