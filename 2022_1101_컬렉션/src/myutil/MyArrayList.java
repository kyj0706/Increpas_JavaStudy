package myutil;

//generic����   :   Ŭ������<������Type>  
//                  E: element(���)  
public class MyArrayList<E> {

	//�ڹ��� ��簴ü�� ��������ϱ� ���ؼ� Object�迭�� ���������
	E [] data=null;
	
	public int size() {
		
		return (data==null) ? 0 : data.length;
	}
	
	public void add(E newObject) {
		
		//1��° �����Ͱ� ���ö�
		if(data==null) {
			data = (E[]) new Object[1];
			data[0] = newObject;
			return;
		}
		
		//����������(this.size()) ���� 1�� ���� imsi �迭�� ����
		E [] imsi = (E[])new Object[this.size()+1];
		
		//���1 : �����迭���� �ӽù迭�� �ű��(for)
		for(int i=0;i<this.size();i++) {
			imsi[i] = data[i];
		}
		
		//���2: System.arraycopy()
		//System.arraycopy(data, 0, imsi, 0, this.size());
		
		//�Ǹ�����÷�ڿ� newObject�� �ִ´�
		imsi[this.size()] = newObject;
		
		//�ӽ��� �迭�� data�� �Ѱ��ش�
		data = imsi;
		
	}//end-add()
	
	
	// index��° �����͸� ��ȯ
	//                            throws:����ó���� �絵(����) 
	//                                   �ش�޼ҵ�(get)�� ����ϴ� ������ catch���� ���
	public E get(int index) throws Exception {
		
		//��ȿ��üũ
		if( index<0 || index >= this.size()) {
			
			String message = String.format("÷���� ��ȿ������ 0~%d����(���� �Է°�:%d)", 
					                                          this.size()-1,   index
					);
			
			throw new Exception(message);
		}
		
		
		return data[index];
		
	}//end-get()
	
	
	public void clear() {
		
		data = null;
	}//end-clear()
	
	
	
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
		E []  imsi = (E [])new Object[this.size()-1];    
		
		//2) ����index�� ������ �������� imsi�迭�� �ű��
		//   ����index���� ������ �״�� ���� �ƴϸ� ������ ����
		for(int i=0;i<imsi.length;i++) {
			
			if(i < index) 
				imsi[i] = data[i];  //�״�κ���
			else
				imsi[i] = data[i+1];//�����ͺ���
		}
		
		//3) imsi�迭���� data�� �ѱ��
		data = imsi;
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
