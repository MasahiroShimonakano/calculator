package portfolio;

public class Main {
	public static void main(String[] args) {

		String handan;
		int num1;
		int num2;
		String figure1;
		int output;
//		boolean isACpushed = true;
//		
//		while(isACpushed == true)
//		{
//			
		System.out.println("数字を入力");
		num1 = new java.util.Scanner(System.in).nextInt();
		
		output = num1;

		do {
			System.out.println("演算子（+ - × ÷）を入力");
			figure1 = new java.util.Scanner(System.in).nextLine();

			System.out.println("数字を入力");
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

			System.out.println("結果を表示:y 処理を追加:n");
			handan = new java.util.Scanner(System.in).nextLine();
		} while (handan.equals("n"));

		if (handan.equals("y")) {
			System.out.println(output);
		}
	}
}
