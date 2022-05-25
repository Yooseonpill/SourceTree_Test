
public class CaptionTv_Test {

	public static void main(String[] args) {
		Sangsock1 ctv = new Sangsock1();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true; //caption 기능 켜기
		ctv.displayCaption("Hello, World");
	}

}
