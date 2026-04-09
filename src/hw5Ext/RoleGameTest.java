package hw5Ext;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		Move m = new Move();
		FastMove fm = new FastMove();

		saber.setMove(m);
		saber.setDefend(new Defend());
		archer.setMove(m);
		archer.setDefend(new Defend());
				
		saber.attack();
		saber.move();
		saber.defend();
		
		archer.attack();
		archer.move();
		archer.defend();
		
		archer.setMove(fm);
		archer.move();
	}

}
