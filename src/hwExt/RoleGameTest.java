package hwExt;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);

		saber.setMove(new Move());
		saber.setDefend(new Defend());
		archer.setMove(new Move());
		archer.setDefend(new Defend());
				
		saber.attack();
		saber.move();
		saber.defend();
		
		archer.attack();
		archer.move();
		archer.defend();
		
		archer.setMove(new FastMove());
		archer.move();
	}

}
