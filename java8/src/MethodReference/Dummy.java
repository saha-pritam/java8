package MethodReference;

public class Dummy {
	private int x;
	private int y;
	
	public Dummy() {
		x=1;
		y=2;
	}
	
	public Dummy(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	@Override
	public String toString() {
		return "Dummy [x=" + x + ", y=" + y + "]";
	}
}
