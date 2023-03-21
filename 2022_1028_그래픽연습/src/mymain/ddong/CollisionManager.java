package mymain.ddong;

public class CollisionManager {

	Me me;
	DDongManager ddongManager;
	
	public CollisionManager(Me me, DDongManager ddongManager) {
		super();
		this.me = me;
		this.ddongManager = ddongManager;
	}
	
	
	public boolean collison() {
		
		for(int i=0;i< ddongManager.ddong_list.size();i++) {
			
			DDong ddong = ddongManager.ddong_list.get(i);
			
			//�˰� ���� ����������
			if(ddong.pos.intersects(me.pos)) {
				
				ddongManager.ddong_list.remove(ddong);
				
			    return true;	
			}
		}
		
		return false;
		
	}
	
	
	
}
