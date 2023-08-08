import java.util.Scanner;

public class MyCalculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	quitMenu:while(true) {
			showMenu();
//			int selectedMenu = sc.nextInt(); // 정수형이 아닌 값을 입력 받으면 에러 발생함.
			String nextLine = sc.nextLine();
			if (nextLine.length() == 0) nextLine = sc.nextLine();
			
			char myChar = nextLine.charAt(0);
			if (!checkNum(myChar)) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				continue;
			}
			
			int selectedMenu = myChar - '0';
			switch (selectedMenu) {
			case 0:
				break quitMenu;
			case 1:
				add(sc.nextInt(), sc.nextInt());
				break;
			case 2:
				minus(sc.nextInt(), sc.nextInt());
				break;
			case 3:
				multiply(sc.nextInt(), sc.nextInt());
				break;
			case 4:
				divide(sc.nextInt(), sc.nextInt());
				break;
			default:
				System.out.println("메뉴를 잘못 선택했습니다.");
			}
			
		}
		System.out.println("계산기를 종료합니다.");
		sc.close();
	}
	
	public static void showMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("0.끝내기");
	}
	
	public static void add(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	public static void minus(int num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	
	public static void multiply(int num1, int num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	}
	
	public static void divide(int num1, int num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
	}
	
	public static boolean checkNum(char ch) {
		if (ch >= '0' && ch <= '9') return true;
		else  return false;
	}
}
