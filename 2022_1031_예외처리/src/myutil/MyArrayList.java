package myutil;

import java.util.ArrayList;

public class MyArrayList {
	
	//��1_2
	//�ڹ��� ��簴ü�� ��������ϱ� ���ؼ� Object�迭�� ���������
	Object [] data=null;
	
	
	//��1_2
	//method
	//size �� ���غ��ô�.
	public int size() {
		
		return (data==null)? 0 :data.length;
	}
	
	//��1_3
	//�����͸� �־�ô�.
	public void add(Object newObject) {
		
		//��1_4
		//1��° �����Ͱ� ���ö�.
		if(data==null) {
			data = new Object[1];
			data[0] = newObject;
			return;
		}
		
		//��1_5
		//���������ͺ���. 1�� ���� �ӽ� �迭�� ����
		Object [] imsi = new Object[this.size()+1];
		
		//��1_6
		//�����迭���� �ӽù迭�� �ű��. 
		
		//���1 for��) : �����迭 ���� �ӽù迭�� �ű��
		for(int i=0; i<this.size(); i++) {
			imsi[i] = data[i];
		}
		
		//���2: System.arraycopy()
		//0System.arraycopy(data, 0, imsi, 0,this.size());
		
		
		
		//��1_7
		//�Ǹ����� ���� newObject�� �ִ´�
		imsi[this.size()] = newObject;
		
		//��1_8
		//�ӽ��� �迭�� data�� �Ѱ��ش�
		data = imsi;
		
	}//end : add()
								 //throws: ����ó���� �絵(����)
	//									 �ش�޼ҵ�(get)�� ����ϴ� ������ catch�ؼ� ��� �ض�
	public Object get(int index) throws Exception{
		
		//��ȿ��üũ
		if(index<0 || index>=this.size()) {
			String message = String.format("÷���� ��ȿ������ 0~%d����(���� �Է°�: %d )"
														,this.size()-1, index
					);
			throw new Exception(message);
		}
		
		return data[index];
	}//end : get
	
	//��λ���
	public void clear() {
		data =null;
	}
	
	//remove
	public void remove(int index) throws Exception {
		//��ȿ��üũ
				if( index<0 || index >= this.size()) {
					
					String message = String.format("÷���� ��ȿ������ 0~%d����(���� �Է°�:%d)", 
							                                          this.size()-1,   index
							);
					
					throw new Exception(message);
				}
				
				//�����ڵ� �ۼ�
				
				//1.�����Ͱ� �Ѱ���������
				if(this.size()==1) {
					data = null;
					return;
				}
				
				
				
				//2.2���̻� ��������
				//1) ���������ͺ��� 1�� ���� �迭����(imsi)
				Object [] imsi = new Object[this.size()-1];    
				
				//2) ����index�� ������ �������� imsi�迭�� �ű��
				/*for(int i= 0; i<imsi.length; i++) {
					if(i <index)
						imsi[i] = data[i];
					else
						imsi[i] = data[i+1];
				}*/
				
				
				for(int i=0; i<imsi.length; i++) {
					if(i<index)
					
					imsi[i] = data[i];
					else 
						imsi[i] = data[i+1];
						
					
				}
				
				
				
				
				//3) imsi�迭���� data�� �ѱ��
				data = imsi;
		
		
		
	  

	}

}
