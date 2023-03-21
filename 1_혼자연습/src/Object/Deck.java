package Object;

public class Deck {
	
	//52장의 카드 생성
		//52장의 카드 kind, number
		//52장을 썩는 메소드생성
		//52장의 카드를 꺼내는 메소드 생성
		//메소드 관련은 다 여기
		
		String[] kinds = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
		String[] numbers = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] kinds_c = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
		String[] numbers_c = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		Card[] me_C = new Card[52];
		Card[] com_C = new Card[52];
		Card[] Mycard = new Card[7];
		Card[] Comcard = new Card[7];
		
		
		//기본생성자
		public Deck() {	// 13*i+j 를 하는 이유  52개를 하기 위해서 ?
			for(int i=0; i<4; i++) {
				for(int j=0; j<13; j++) {
					 me_C[13*i+j] = new Card(kinds[i],numbers[j]);
					 com_C[13*i+j] = new Card(kinds_c[i],numbers_c[j]);
					
				}
			}
			
		}
		//내카드 섞기
		public void shuffle_me( ) {
			System.out.println("내 카드를 섞었습니다.");
			for(int i=0; i<1000; i++) {
				int random_no = (int)(Math.random()*52);
				Card temp_me = me_C[0];
				 me_C[0] =  me_C[random_no];
				 me_C[random_no]= temp_me;
			}
		}
		//컴퓨터카드 섞기
		public void shuffle_com() {
			System.out.println("컴퓨터 카드를 섞었습니다.");
			for(int i=0; i<1000; i++) {
				int random_no = (int)(Math.random()*52);
				Card temp_c = com_C[0];
				 com_C[0] =  com_C[random_no];
				 com_C[random_no]= temp_c;
			}
		}
		
		//맞은 카드 찾기
		public void same_card() {
			
		}
		
		
		public void print_1card(int index) {
			System.out.printf("카드 : %s , %s \n", me_C[index].kind, me_C[index].number);
		}
		
		public void print_5card() {
			System.out.println("[5장 출력]");
			for(int i=0; i<5; i++) {
				System.out.printf("카드 : %s , %s \n", me_C[i].kind, me_C[i].number);
			}
		}
		public void print_my7card() {
			System.out.println("[MY카드 7장]");
			
			//내카드
			for(int i=0; i<14; i++) {
				if(i<=6) {
					
					Mycard[i] = new Card( me_C[i].kind, me_C[i].number);
					System.out.printf("MY카드 : %s , %s \n",Mycard[i].kind,Mycard[i].number);	
				}
				/*
				 * else { Comcard[i-7] = new Card(c[i].kind,c[i].number); count++;
				 * System.out.printf("COM카드 : %s , %s \n",Comcard[i-7].kind,Comcard[i-7].number)
				 * ;
				 * 
				 * }
				 */
					
			}
			
//			if(count_1==count_2)
//				System.out.printf("맞춘갯수 : %s\n", count_1);
//			else
//				System.out.println("하나도 안맞았습니다.");
		}
		
		public void print_com7card() {
			//컴퓨터 카드
			System.out.println("[COM카드 7장]");
			for(int k=0; k<14; k++) {
				if(k<=6) {
					
					Comcard[k] = new Card(com_C[k].kind_c,com_C[k].number_c);
					System.out.printf("COM카드 : %s , %s \n",Comcard[k].kind_c,Comcard[k].number_c);	
				}
			}
			
		}

		//52장 카드 출력
		public void print_52card() {
			for(int i=0; i<4; i++) {
				for(int j=0; j<13; j++) {
					System.out.printf("카드 : %s, %s \n" , me_C[13*i+j].kind,  me_C[13*i+j].number);
				}
			}
		}
		public void menu_print() {
			System.out.println();
			
			System.out.println("[카드 프로그램]");
			System.out.println("1.카드 1장 출력");
			System.out.println("2.카드 5장 출력");
			System.out.println("3.카드 52장 출력");
			System.out.println("4.카드 섞기");
			System.out.println("5.COM과 게임");
			
			System.out.println("0.종료");
			System.out.println("====================");
			System.out.println("원하는 번호를 입력하세요.>>");
			
		}
	}