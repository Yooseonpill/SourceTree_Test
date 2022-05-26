class Sangsock1 extends Tv1 {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {System.out.println(text);} //caption 상태가 true일때만 text 출력
	}
}
