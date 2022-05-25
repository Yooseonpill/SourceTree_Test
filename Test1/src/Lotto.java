import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 로또 추첨 프로그램
		int[] lottoNum = new int[6];
		int count = 0;
		for (int i = 0; i < lottoNum.length; i++) { // 로또번호 6개 생성
			lottoNum[i] = (int) (Math.random() * 45 + 1);
			for (int j=0; j<i;j++) { //중복 삭제
				if(lottoNum[i] == lottoNum[j]) i--;
			}
		}

		System.out.println("숫자 다섯개를 입력해 주세요");
		Scanner scan = new Scanner(System.in);

		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) { // 로또번호 6개 맟추기
			num[i] = scan.nextInt();
		}
		System.out.println("로또번호 : " + Arrays.toString(lottoNum));
		System.out.println("사용자 번호 : " + Arrays.toString(num));

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (lottoNum[i] == num[j]) {
					count++;
				}
			}
		}

		System.out.println(count + "개 맞았습니다.");
	}

}
