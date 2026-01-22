package portfolio;

public class Main {
	public static void main(String[] args) {

		String handan;
		int num1;
		int num2;
		String figure1;
		int output;

		System.out.println("好きな数字を入力してください。");
		num1 = new java.util.Scanner(System.in).nextInt();
		output = num1;

		do {
			System.out.println("好きな演算子（+ - × ÷）を入力してください");
			figure1 = new java.util.Scanner(System.in).nextLine();

			System.out.println("好きな数字を入力してください。");
			num2 = new java.util.Scanner(System.in).nextInt();

			if (figure1.equals("+") || figure1.equals("＋")) {
				output = output + num2;
			}
			if (figure1.equals("-") || figure1.equals("ー")) {
				output = output - num2;
			}
			if (figure1.equals("×") || figure1.equals("*")) {
				output = output * num2;
			}
			if (figure1.equals("÷") || figure1.equals("/")) {
				output = output / num2;
			}

			System.out.println("結果を表示したいですか？その場合はyを、処理を追加したい場合は、nを入力してください。");
			handan = new java.util.Scanner(System.in).nextLine();
		} while (handan.equals("n"));

		if (handan.equals("y")) {
			System.out.println(output);
		}
	}
}
