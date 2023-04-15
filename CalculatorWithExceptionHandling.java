import java.util.Scanner;

public class CalculatorWithExceptionHandling {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		start();
		System.out.println("Done");
	}

	static void start() {
		System.out.println(
				"Select your option: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Stop the Program");

		int option = sc.nextInt();
		boolean flag = true;

		while (flag) {

			try {
				switch (option) {
				case 1:
					add();
					flag = false;
					break;
				case 2:
					sub();
					flag = false;
					break;
				case 3:
					mul();
					flag = false;
					break;
				case 4:
					div();
					flag = false;
					break;
				case 5:
					stop();
					flag = false;
					break;
				default:
					sc.nextLine();
					flag = true;
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	static void add() {
		double n1 = 0, n2 = 0;

		boolean flag1 = true;
		boolean flag2 = true;
		while (flag1) {

			try {
				System.out.println("Enter First Number");
				n1 = sc.nextInt();
				flag1 = false;
				break;
			} catch (Exception e) {
				System.out.println("Invalid Number");
				sc.nextLine();
				flag1 = true;
			}
		}

		while (flag2) {

			try {
				System.out.println("Enter Second Number");
				n2 = sc.nextInt();
				flag2 = false;
				break;
			} catch (Exception e) {
				System.out.println("Invalid Number");
				sc.nextLine();
				flag2 = true;
			}
		}

		System.out.println(n1 + n2);
		start();
	}

	static void sub() {
		double n1 = 0, n2 = 0;

		boolean flag1 = true;
		boolean flag2 = true;
		while (flag1) {

			try {
				System.out.println("Enter First Number");
				n1 = sc.nextInt();
				flag1 = false;
				break;
			} catch (Exception e) {
				System.out.println("Invalid Number");
				sc.nextLine();
				flag1 = true;
			}
		}

		while (flag2) {

			try {
				System.out.println("Enter Second Number");
				n2 = sc.nextInt();
				flag2 = false;
				break;
			} catch (Exception e) {
				System.out.println("Invalid Number");
				sc.nextLine();
				flag2 = true;
			}
		}

		System.out.println(n1 - n2);
		start();
	}

	static void mul() {
		double n1 = 0, n2 = 0;

		boolean flag1 = true;
		boolean flag2 = true;
		while (flag1) {

			try {
				System.out.println("Enter First Number");
				n1 = sc.nextInt();
				flag1 = false;
				break;
			} catch (Exception e) {
				System.out.println("Invalid Number");
				sc.nextLine();
				flag1 = true;
			}
		}

		while (flag2) {

			try {
				System.out.println("Enter Second Number");
				n2 = sc.nextInt();
				flag2 = false;
				break;
			} catch (Exception e) {
				System.out.println("Invalid Number");
				sc.nextLine();
				flag2 = true;
			}
		}

		System.out.println(n1 * n2);
		start();
	}

	static void div() {
		double n1 = 0, n2 = 0;

		boolean flag1 = true;
		boolean flag2 = true;
		while (flag1) {

			try {
				System.out.println("Enter First Number");
				n1 = sc.nextInt();
				flag1 = false;
				break;
			} catch (Exception e) {
				System.out.println("Invalid Number");
				sc.nextLine();
				flag1 = true;
			}
		}

		while (flag2) {

			try {
				System.out.println("Enter Second Number");
				n2 = sc.nextInt();
				flag2 = false;
				break;
			} catch (Exception e) {
				System.out.println("Invalid Number");
				sc.nextLine();
				flag2 = true;
			}
		}

		if (n2 == 0) {
			flag2 = true;
			while (flag2) {

				try {
					System.out.println("Enter Second Number");
					n2 = sc.nextInt();
					flag2 = false;
					break;
				} catch (Exception e) {
					System.out.println("Invalid Number");
					sc.nextLine();
					flag2 = true;
				}
			}
		}
		System.out.println(n1 / n2);
		start();
	}

	static void stop() {
		System.out.println("Thank you! Have a great day! : )");
	}
}
