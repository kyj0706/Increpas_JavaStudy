package mymain;

import java.util.Scanner;

public class _01_if_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//키보드입력
				Scanner scanner = new Scanner(System.in);
				
				int age = 20;
				String res= "";
				
				//나이를 입력받는다
				System.out.print("나이:");
				age = scanner.nextInt();
				
				
				if(age<10)
				{
					System.out.println("조건:age<10");
					res = "아동";
				}
				else
				{
					if(age>=10 && age<20)
					{
						System.out.println("조건:age>=10 && age<20");
						res = "청소년";
					}
					else
					{
						if(age>=20 && age<40)
						{
							System.out.println("조건:age>=20 && age<40");
							res = "성년";
						}
						else
						{
							if(age>=40 && age<60)
							{
								System.out.println("조건:age>=40 && age<60");
								res = "장년";
							}
							else
							{
							    if(age>=60)
							    {
							    	System.out.println("조건:age>=60");
							    	res = "노년";
							    }
							}
						}
					}
				}
				
				System.out.printf("[%d]세 [%s]입니다\n", age,res);
				
				
				scanner.close();
					
				
			}

		}