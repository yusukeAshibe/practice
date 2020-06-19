package 良問;

import java.util.Scanner;

public class Product {
	//	二つの正整数a,bが与えられます。
	//	aとbの積が偶数か奇数か判定してください。
	//	【制約】
	//	1≤a,b≤10000
	//	1≤a,b≤10000
	//	a,bは整数
	//	【数値例】
	//	1)
	//	a=3b=4
	//	　答え: Even
	//	3 × 4 = 12 でこれは偶数なので、"Even" を出力します。
	//	2)
	//	a=1
	//	b=21
	//	　答え: Odd
	//	1 × 21 = 21 でこれは奇数なので、"Odd" を出力します。
	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);//コンソールに入力できるようにする
			System.out.println("数字二回を入力してください");
			int a = s.nextInt();//入力された最初の値を取得
			int b = s.nextInt();//入力された次の値を取得

			System.out.println("aの値 " + a);
			System.out.println("bの値 " + b);
			int mult = a * b;

			if (mult % 2 == 0) {
				System.out.println(mult + " :Even");
			} else {
				System.out.println(mult + ":Odd");
			}
		} catch (Exception e) {
			System.out.println("数字を入力してください（要再起動）");
		}

	}

}
