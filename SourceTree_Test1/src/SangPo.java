class MyPoint {
	int x,y;
}

//class Circle extends MyPoint {
//	int r;
//}

class Circle { // 부모가 없는 모든 클래스는 Object가 부모가 된다.
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
		System.out.println(c.toString()); //Object클래스 안에 toString메소드가 있어서 사용가능(주소값 반환)
		System.out.println(c); // c가 참조변수라서 주소값을 반환
	}

}
