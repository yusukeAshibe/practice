package 良問;

import java.util.Scanner;

public class SomeSums {
	//【問題概要】
	//1 以上 N 以下の整数のうち、10進法で各桁の和が A以上 B 以下であるものについて、総和を求めてください。
	//
	//【制約】
	//
	//1≤N≤10^4
	//1≤A≤B≤36
	//入力はすべて整数
	//【数値例】
	//1)
	//　N=20
	//　A=2
	//　B=5
	//　答え: 84
	//20 以下の整数のうち、各桁の和が 2 以上 5 以下なのは、2, 3, 4, 5, 11, 12, 13, 14, 20 です。これらの合計である 84 を出力します。

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Nを入力してください");
		int N = s.nextInt();
		System.out.println(N + "以下の整数のうち各桁の総和が");
		System.out.println("Aを入力してください");
		int A = s.nextInt();
		System.out.println(A + "以上");
		System.out.println("Bを入力してください");
		int B = s.nextInt();
		System.out.println(B + "以下であるもののの和");

		int placeOfOne = 0;//1の位
		int placeOfTen = 0;//10の位
		int sumOfEachDigit = 0;//二桁の整数の各桁の総和
		int sum = 0;//総和
		//int n=0;//N以下の二桁の整数

		for (int i = 1; i <= N; i++) {
			placeOfTen = i / 10;
			placeOfOne = i % 10;
			sumOfEachDigit = placeOfTen + placeOfOne;
			if (A <= sumOfEachDigit && sumOfEachDigit <= B) {
				//System.out.println(i);
				//System.out.println(sumOfEachDigit);
				sum += i;

			}
		}
		System.out.println("合計" + sum);
	}

}
