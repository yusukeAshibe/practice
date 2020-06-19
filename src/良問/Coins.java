package 良問;

import java.util.Scanner;

public class Coins {
	//	問題文
	//	あなたは、
	//	500円玉を A枚、
	//	100円玉をB枚、
	//	50円玉をC枚持っています。
	//	これらの硬貨の中から何枚かを選び、合計金額をちょうど X円にする方法は何通りありますか。
	//	同じ種類の硬貨どうしは区別できません。2 通りの硬貨の選び方は、ある種類の硬貨についてその硬貨を選ぶ枚数が異なるとき区別されます。
	//	制約
	//	0≤A,B,C≤50
	//	A+B+C≥1
	//	50≤X≤20,000
	//	A,B,C
	//	は整数である
	//	Xは 50の倍数である
	//
	//	入力
	//	入力は以下の形式で標準入力から与えられる。
	//	A
	//	B
	//	C
	//	X
	//
	//	出力
	//	硬貨を選ぶ方法の個数を出力せよ。
	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int C = 0;
		int X = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("500円玉の枚数を入力してください");
		A = s.nextInt();
		System.out.println("500円: " + A + "枚");
		System.out.println("100円玉の枚数を入力してください");
		B = s.nextInt();
		System.out.println("100円: " + B + "枚");
		System.out.println("50円玉の枚数を入力してください");
		C = s.nextInt();
		System.out.println("50円: " + C + "枚");
		System.out.println("合計金額を入力してください");
		X = s.nextInt();
		System.out.println("合計金額: " + X + "円");
		int ways = 0; //何通りあるか
		int total = 0;//計算された合計金額
		for (int i = 0; i <= A; i++) {
			for (int j = 0; j <= B; j++) {
				for (int k = 0; k <= C; k++) {
					total = (500 * i + 100 * j + 50 * k);
					if (total == X) {
						System.out.println("500円　" + i + "枚" + "：100円" + j + "枚" + "：50円　" + k + "枚");
						ways++;
					}
				}
			}
		}

		System.out.println(ways + "パターン");
	}

}
