class MyPoint {
	int x,y;
}

//class Circle extends MyPoint {
//	int r;
//}

class Circle {
	MyPoint p = new MyPoint();
	int r;
}
public class SangPo {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 4;
		c.r = 9;
		
		System.out.printf("c.p.x = %d%n", c.p.x);
		System.out.printf("c.p.y = %d%n", c.p.y);
		System.out.printf("c.r = %d%n", c.r);
	}

}
