class MyPoint {
	int x,y;
}

class Circle extends MyPoint {
	int r;
}
public class SangPo {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.x = 1;
		c.y = 4;
		c.r = 9;
		
		System.out.printf("c.x = %d%n", c.x);
		System.out.printf("c.y = %d%n", c.y);
		System.out.printf("c.r = %d%n", c.r);
	}

}
