import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// �ζ� ��÷ ���α׷�
		int[] lottoNum = new int[6];
		int count = 0;
		for (int i = 0; i < lottoNum.length; i++) { // �ζǹ�ȣ 6�� ����
			lottoNum[i] = (int) (Math.random() * 45 + 1);
			for (int j=0; j<i;j++) { //�ߺ� ����
				if(lottoNum[i] == lottoNum[j]) i--;
			}
		}

		System.out.println("���� �ټ����� �Է��� �ּ���");
		Scanner scan = new Scanner(System.in);

		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) { // �ζǹ�ȣ 6�� ���߱�
			num[i] = scan.nextInt();
		}
		System.out.println("�ζǹ�ȣ : " + Arrays.toString(lottoNum));
		System.out.println("����� ��ȣ : " + Arrays.toString(num));

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (lottoNum[i] == num[j]) {
					count++;
				}
			}
		}

		System.out.println(count + "�� �¾ҽ��ϴ�.");
	}

}
