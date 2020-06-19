package 良問;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CardGameForTwo {
	//	【問題概要】
	//	N 枚のカードがあり、i 枚目のカードには aiという数が書かれています。
	//	Alice と Bob はこれらのカードを使ってゲームを行います。ゲームでは 2 人が交互に 1 枚ずつカードを取っていきます。Alice が先にカードを取ります。
	//	2 人がすべてのカードを取ったときゲームは終了し、取ったカードの数の合計がその人の得点になります。
	//	2 人とも自分の得点を最大化するように最適戦略をとったとき、Alice は Bob より何点多くの得点を獲得できるかを求めてください。
	//
	//	【制約】
	//
	//	N は 1 以上 100以下の整数
	//	ai は 1 以上 100 以下の整数
	//	【数値例】
	//	1)
	//	　N=3
	//	　a=(2,7,4)
	//	　答え: 5
	//	以下が最適です:
	//
	//	1 ターン目: Alice が 7 を取る
	//	2 ターン目: Bob が 4 を取る
	//	3 ターン目: Alice が 2 を取る
	//	Alice は 7 + 2 = 9 点、Bob は 4 点を獲得するので、その差は 9 - 4 = 5 点です。

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//まず何枚のカードがあるのか決定しその枚数で配列を作成する.
		System.out.println("N個の数字の入る配列の作成");
		Integer N = s.nextInt();
		//int scores[] = new int[N];
		System.out.println("N個配列の中の数字を入力");
		Integer scores[] = new Integer[N];
		for (int i = 0; i < N; i++) {
			scores[i] = s.nextInt();
		}
		//作成した配列を降順に並び替え
		System.out.println("ソート前");
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores, Collections.reverseOrder());//配列がintだと使えない
		System.out.println("ソート後");
		System.out.println(Arrays.toString(scores));

		//合計の差を求める
		int AliceSum = 0;
		int BobSum = 0;
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {

				AliceSum += scores[i];
			}
			if (i % 2 != 0) {
				BobSum += scores[i];
			}
		}
		System.out.println("Alice計：" + AliceSum);
		System.out.println("Bob計：" + BobSum);
		int sub = AliceSum - BobSum;
		System.out.println(sub);

	}

}
