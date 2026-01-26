package portfolio;

public class Main {
	public static void main(String[] args) {

		boolean a = true;
		boolean b = true;
		String handan;
		String enzan;
		int output = 0;

		while (a) {
			System.out.println("数字を入力 現在の数字は:" + output + "です(初期化:ac)");
			String s1 = new java.util.Scanner(System.in).nextLine();
			if (s1.equals("ac")) {
				output = 0;
				continue;
			}
			output = Integer.parseInt(s1);

			while (b) {
				System.out.println("演算子（+ - × ÷）を入力 現在の数字は:" + output + "です (初期化:ac)");
				enzan = new java.util.Scanner(System.in).nextLine();
				if (enzan.equals("ac")) {
					output = 0;
					break;
				}

				System.out.println("数字を入力 現在の数字は:" + output + "です(初期化:ac)");
				String s2 = new java.util.Scanner(System.in).nextLine();
				if (s2.equals("ac")) {
					output = 0;
					break;
				}
				int output2 = Integer.parseInt(s2);

				if (enzan.equals("+") || enzan.equals("＋")) {
					output += output2;
				}
				if (enzan.equals("-") || enzan.equals("ー")) {
					output -= output2;
				}
				if (enzan.equals("×") || enzan.equals("*")) {
					output *= output2;
				}
				if (enzan.equals("÷") || enzan.equals("/")) {
					output /= output2;
				}

				System.out.println("結果を表示:y 処理を追加:n 初期化;ac");
				handan = new java.util.Scanner(System.in).nextLine();
				if (handan.equals("ac")) {
					output = 0;
					break;
				}

				if (handan.equals("y")) {
					System.out.println("結果は" + output + "でした（1"
							+ "もう一回:enter 初期化:ac 処理を追加:n）");
					String end = new java.util.Scanner(System.in).nextLine();
					if (end.equals("ac")) {
						output = 0;
						break;
					} else if (end.equals("n")) {
						continue;
					}
					output = 0;
					break;
				} else if (handan.equals("n")) {
					continue;
				}
			}
		}
	}
}
