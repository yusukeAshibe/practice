package 良問;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class KagamiMochi {
	//	問題文
	//	X段重ねの鏡餅 	(X≥1)とは、
	//	X枚の円形の餅を縦に積み重ねたものであって、どの餅もその真下の餅より直径が小さい（一番下の餅を除く）もののことです
	//	例えば、直径 10、8、6センチメートルの餅をこの順に下から積み重ねると
	//	3段重ねの鏡餅になり、餅を一枚だけ置くと
	//	1段重ねの鏡餅になります。
	//	ダックスフンドのルンルンは N枚の円形の餅を持っていて、
	//	そのうち i枚目の餅の直径は
	//	diセンチメートルです。これらの餅のうち一部または全部を使って鏡餅を作るとき、最大で何段重ねの鏡餅を作ることができるでしょうか。
	//	制約
	//	1≤N≤100
	//	1≤di≤100
	//	入力値はすべて整数である。
	//
	//	入力
	//	入力は以下の形式で標準入力から与えられる。
	//	N
	//	d1::dN
	//
	//	出力
	//	作ることのできる鏡餅の最大の段数を出力せよ。

	//N=5 d=[4, 10, 8, 8, 6] 答え 4

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//まず何枚のカードがあるのか決定しその枚数で配列を作成する.
		System.out.println("N個の餅のNを指定");
		Integer N = s.nextInt();
		System.out.println(N + "個の餅の直径を入力");
		Integer A[] = new Integer[N];
		for (int i = 0; i < N; i++) {
			A[i] = s.nextInt();
		}
		System.out.println(N + "個の餅直径の一覧");
		System.out.println(Arrays.toString(A));

		Set<Integer> IntegerList = new LinkedHashSet<Integer>();

		// 配列の要素を順にLinkedHashSetオブジェクトへ追加（LinkedHashSetを使うと重複が削除できる）
		for (int i = 0; i < A.length; i++) {
			IntegerList.add(A[i]);
		}

		// LinkedHashSetオブジェクトを配列に変換
		Object[] IntegerListAfter = IntegerList.toArray();

		// 重複削除後配列を出力
		System.out.println("重複をなくした餅の直径一覧");
		System.out.println(Arrays.toString(IntegerListAfter));
		System.out.println("重ねられる餅の個数：" + IntegerList.size());

	}

}
