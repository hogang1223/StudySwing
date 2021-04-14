import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		CalcClass calcClass = new CalcClass();
		int max = 0;
		
		System.out.println("계산할 숫자를 입력하세요.");
		max = scanner.nextInt();
		
		System.out.println("수식은 다음과 같습니다.");
		System.out.println(calcClass.SquareSumExp(max));
		
		System.out.println("계산결과는 다음과 같습니다.");
		System.out.print("Result:" + calcClass.SquareSum(max));
		
		
	}

}
class CalcClass{
	int SquareSum(int max) {
		int result = 0;
		for(int i=1; i<=max; i++) {
			if(i%2==0) {
				result -= Math.pow(i, 3);
			}else {
				result += Math.pow(i, 2);
			}
		}
		return result ;
	}
	String SquareSumExp(int max) {
		String calc ="";
		String message = "";
		for(int i=1; i<=max; i++) {
			if(i%2==1) {
				calc = i+"^"+2;
			}else {
				calc = " - "+i+"^"+3 + " + ";
			}
			message +=calc ;
		}
		
		return message;
	}
}
