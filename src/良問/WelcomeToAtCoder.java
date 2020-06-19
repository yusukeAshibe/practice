package 良問;

import java.util.Scanner;

public class WelcomeToAtCoder {
	//	問題文
	//	高橋君はデータの加工が行いたいです。
	//	整数 a,b,cと、文字列 sが与えられます。
	//	a+b+c
	//	の計算結果と、文字列 sを並べて表示しなさい。
	//	制約
	//	1≤a,b,c≤1,000
	//	1≤1≤|s|≤100
	//
	//	入力
	//	入力は以下の形式で与えられる。
	//	a
	//	b c
	//	s
	//
	//	出力
	//	a+b+cと sを空白区切りで1行に出力せよ。

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//数字の入力
		System.out.println("数字を三回入力してください");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		System.out.println("文字列を一回入力してください");
		String s = sc.next();
		// 出力
		System.out.println((a + b + c) + " " + s);

	}

}
