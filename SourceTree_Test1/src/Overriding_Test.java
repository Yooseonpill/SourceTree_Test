class Point1 {
	int x,y;
	
	String text() {
		return "x : "+x+", y : "+y;
	}
}

class Point2 extends Point1 {
	int z;
	
	Point2(int x, int y, int z){ //생성자 초기화
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// z를 return에 포함시키기 위해 오버라이딩을 해야함.
	public String toString() { //toString 메서드로 오버라이딩
		return "x : "+x+", y : "+y+", z : " +z;
	}
}

public class Overriding_Test {

	public static void main(String[] args) {
		Point2 p = new Point2(2,3,4);
		System.out.println(p);
//		p.x = 2;
//		p.y = 4;
//		p.z = 8;
//		System.out.println(p.text());
	}

}
