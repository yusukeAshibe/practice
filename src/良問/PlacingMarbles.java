package 良問;

import java.util.Scanner;

public class PlacingMarbles {
	//	問題文
	//	すぬけ君は 1,2,3の番号がついた
	//	3つのマスからなるマス目を持っています。 各マスには 0 か 1 が書かれており、
	//	マスには siが書かれています。すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
	//	制約
	//	s1,s2,s3
	//	は 1 あるいは 0
	//
	//	入力
	//	入力は以下の形式で標準入力から与えられる。
	//	s1
	//	s2
	//	s3
	//	出力
	//	答えを出力せよ。
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("0 or 1 を三回入力してください");
		//各マスの数字設定
		int S1 = s.nextInt();
		int S2 = s.nextInt();
		int S3 = s.nextInt();
		//ビー玉の個数
		int count = 0;

		//判定
		if (S1 == 1) {
			count++;
		}
		if (S2 == 1) {
			count++;
		}
		if (S3 == 1) {
			count++;
		}
		System.out.println("ビー玉の個数：" + count);

	}

}
