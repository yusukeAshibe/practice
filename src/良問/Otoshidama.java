package 良問;

import java.util.Scanner;

public class Otoshidama {
	//	問題文
	//  日本でよく使われる紙幣は、10000 円札、5000 円札、1000 円札です。以下、「お札」とはこれらのみを指します。青橋くんが言うには、
	//	彼が祖父から受け取ったお年玉袋にはお札が N枚入っていて、
	//	合計で Y円だったそうですが、嘘かもしれません。このような状況がありうるか判定し、ありうる場合はお年玉袋の中身の候補を一つ見つけてください。
	//	なお、彼の祖父は十分裕福であり、お年玉袋は十分大きかったものとします。制約 1≤N≤2000 1000≤Y≤2×107 Nは整数である。Yは 1000 の倍数である。
	//
	//	入力 入力は以下の形式で標準入力から与えられる。
	//	N Y
	//
	//	出力
	//  N枚のお札の合計金額が Y円となることがありえない場合は、-1-1-1 と出力せよ。
	//	N枚のお札の合計金額が Y円となることがありうる場合は、そのような
	//	N枚のお札の組み合わせの一例を「10000円札 x枚、5000円札 y枚、1000円札 z枚」として
	//  x、y、z を空白で区切って出力せよ。複数の可能性が考えられるときは、そのうちどれを出力してもよい。
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//まず何枚のお札があるのか決定しその枚数で配列を作成する.
		System.out.println("N枚のお札の枚数を指定");
		int N = s.nextInt();
		System.out.println(N + "枚のお札");
		System.out.println("合計金額Y円の指定");
		int Y = s.nextInt();
		System.out.println(Y + "円のお年玉");

		int x;//10000円札の枚数
		int y;//5000円札の枚数
		int z;//1000円札の枚数
		Integer total;//合計金額
		String a = null;//答えのありなし判定
		for (x = 0; x <= N; x++) {
			for (y = 0; y <= N; y++) {
				z = N - x - y;
				total = (10000 * x + 5000 * y + 1000 * z);
				if (total == Y) {
					Y = total;
					a = "解あり";
					System.out.println("10000円札" + x + "枚、5000円札" + y + "枚、1000円札" + z + "枚");
					break;
				}
			}
		}

		if (!("解あり").equals(a)) {
			System.out.println("-1-1-1");

		}
	}

}
