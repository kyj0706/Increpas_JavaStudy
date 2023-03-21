package Object;

public class Deck {
	
	//52���� ī�� ����
		//52���� ī�� kind, number
		//52���� ��� �޼ҵ����
		//52���� ī�带 ������ �޼ҵ� ����
		//�޼ҵ� ������ �� ����
		
		String[] kinds = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
		String[] numbers = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] kinds_c = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
		String[] numbers_c = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		Card[] me_C = new Card[52];
		Card[] com_C = new Card[52];
		Card[] Mycard = new Card[7];
		Card[] Comcard = new Card[7];
		
		
		//�⺻������
		public Deck() {	// 13*i+j �� �ϴ� ����  52���� �ϱ� ���ؼ� ?
			for(int i=0; i<4; i++) {
				for(int j=0; j<13; j++) {
					 me_C[13*i+j] = new Card(kinds[i],numbers[j]);
					 com_C[13*i+j] = new Card(kinds_c[i],numbers_c[j]);
					
				}
			}
			
		}
		//��ī�� ����
		public void shuffle_me( ) {
			System.out.println("�� ī�带 �������ϴ�.");
			for(int i=0; i<1000; i++) {
				int random_no = (int)(Math.random()*52);
				Card temp_me = me_C[0];
				 me_C[0] =  me_C[random_no];
				 me_C[random_no]= temp_me;
			}
		}
		//��ǻ��ī�� ����
		public void shuffle_com() {
			System.out.println("��ǻ�� ī�带 �������ϴ�.");
			for(int i=0; i<1000; i++) {
				int random_no = (int)(Math.random()*52);
				Card temp_c = com_C[0];
				 com_C[0] =  com_C[random_no];
				 com_C[random_no]= temp_c;
			}
		}
		
		//���� ī�� ã��
		public void same_card() {
			
		}
		
		
		public void print_1card(int index) {
			System.out.printf("ī�� : %s , %s \n", me_C[index].kind, me_C[index].number);
		}
		
		public void print_5card() {
			System.out.println("[5�� ���]");
			for(int i=0; i<5; i++) {
				System.out.printf("ī�� : %s , %s \n", me_C[i].kind, me_C[i].number);
			}
		}
		public void print_my7card() {
			System.out.println("[MYī�� 7��]");
			
			//��ī��
			for(int i=0; i<14; i++) {
				if(i<=6) {
					
					Mycard[i] = new Card( me_C[i].kind, me_C[i].number);
					System.out.printf("MYī�� : %s , %s \n",Mycard[i].kind,Mycard[i].number);	
				}
				/*
				 * else { Comcard[i-7] = new Card(c[i].kind,c[i].number); count++;
				 * System.out.printf("COMī�� : %s , %s \n",Comcard[i-7].kind,Comcard[i-7].number)
				 * ;
				 * 
				 * }
				 */
					
			}
			
//			if(count_1==count_2)
//				System.out.printf("���᰹�� : %s\n", count_1);
//			else
//				System.out.println("�ϳ��� �ȸ¾ҽ��ϴ�.");
		}
		
		public void print_com7card() {
			//��ǻ�� ī��
			System.out.println("[COMī�� 7��]");
			for(int k=0; k<14; k++) {
				if(k<=6) {
					
					Comcard[k] = new Card(com_C[k].kind_c,com_C[k].number_c);
					System.out.printf("COMī�� : %s , %s \n",Comcard[k].kind_c,Comcard[k].number_c);	
				}
			}
			
		}

		//52�� ī�� ���
		public void print_52card() {
			for(int i=0; i<4; i++) {
				for(int j=0; j<13; j++) {
					System.out.printf("ī�� : %s, %s \n" , me_C[13*i+j].kind,  me_C[13*i+j].number);
				}
			}
		}
		public void menu_print() {
			System.out.println();
			
			System.out.println("[ī�� ���α׷�]");
			System.out.println("1.ī�� 1�� ���");
			System.out.println("2.ī�� 5�� ���");
			System.out.println("3.ī�� 52�� ���");
			System.out.println("4.ī�� ����");
			System.out.println("5.COM�� ����");
			
			System.out.println("0.����");
			System.out.println("====================");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			
		}
	}