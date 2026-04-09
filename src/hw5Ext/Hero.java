package hw5Ext;

public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private Imove useMove;
	private Idefend useDefend;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public abstract void attack();
	
	public void setMove(Imove useMove) {
		this.useMove = useMove;
	}
	
	public void move() {
		useMove.move();
	}
	
	public void setDefend(Idefend useDefend) {
		this.useDefend = useDefend;
	}
	
	public void defend() {
		useDefend.defend();
	}
	
}
