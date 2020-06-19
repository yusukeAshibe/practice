package 良問;

import java.util.Scanner;

public class Traveling {
	//	問題文
	//	シカのAtCoDeerくんは二次元平面上で旅行をしようとしています。AtCoDeerくんの旅行プランでは、時刻 0 0に 点
	//	(0,0)を出発し、
	//	1以上 N	以下の各 iに対し、時刻 tiに 点 (xi,yi)
	//	を訪れる予定です。
	//	AtCoDeerくんが時刻 tに 点 (x,y)にいる時、 時刻
	//	t+1には 点 (x+1,y)
	//	, (x−1,y)
	//	, (x,y+1)
	//	, (x,y−1)
	//	のうちいずれかに存在することができます。 その場にとどまることは出来ないことに注意してください。
	//	AtCoDeerくんの旅行プランが実行可能かどうか判定してください。
	//	制約
	//	1≤N≤10^5
	//	0≤xi≤10^5
	//	105
	//	0≤yi≤10^5
	//	1≤ti≤10^5
	//	ti<ti+1
	//	(1≤i≤N−1)
	//	入力は全て整数
	//
	//	入力
	//	入力は以下の形式で標準入力から与えられる。
	//	N
	//	t1 x1 y1
	//	t2 x2 y2
	//	tN xN yN
	//	出力
	//	旅行プランが実行可能ならYesを、不可能ならNoを出力してください。
	//	入力例
	//	2
	//	3 1 2
	//	6 1 1  yes
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("何箇所回るか入力");
		int N = s.nextInt();
		System.out.println(N + "箇所回る");

		//初回（前回）
		int t = 0;//時間
		int x = 0;//x座標
		int y = 0;//y座標
		int d = 0; //移動距離
		//二回目以降（最新座標）
		int t1 = 0;
		int x1 = 0;
		int y1 = 0;
		int d1 = 0;
		int subD = 0;//座標の距離差
		int subT = 0;//時間差
		String a = null;//yes or no

		System.out.println("中継地点回数分入力");
		for (int i = 1; i <= N; i++) {
			if (i == 1) {
				System.out.println(i + "回目の中継地点到着時刻と座標");
				t = s.nextInt();
				x = s.nextInt();
				y = s.nextInt();
				System.out.println(t + "秒後に、x座標が" + x + "、y座標が" + y);
				d = x + y;
				if (d > t) { //最短距離でもたどり着けない
					a = "no";
					break;
				}
				if (t % 2 == 0) {//時間が偶数の場合
					if (d % 2 == 0) {//移動距離が偶数である
						a = "yes";
						System.out.println("経由成功1");
					} else {//移動距離が奇数である
						a = "no";
						break;//経由失敗
					}
				} else {//移動距離が奇数の場合　
					if (d % 2 == 1) {//時間が奇数
						a = "yes";
						System.out.println("経由成功2");
					} else {
						a = "no";
						break;//経由失敗
					}
				}
			}

			else {
				System.out.println(i + "回目の中継地点到着時刻と座標");
				t1 = s.nextInt();
				x1 = s.nextInt();
				y1 = s.nextInt();
				System.out.println(t1 + "秒後に、x座標が" + x1 + "、y座標が" + y1);
				d1 = x1 + y1;
				subD = Math.abs(d1 - d);//移動距離1
				subT = Math.abs(t1 - t);//移動時間3
				System.out.println("移動距離：" + subD + "、移動時間：" + subT);
				if (subD > subT) {
					a = "no";
					break;
				}
				if (subT % 2 == 0) {//時間が偶数の場合
					if (subD % 2 == 0) {//移動距離が偶数である
						a = "yes";
						System.out.println("経由成功3");
						t = t1;
						x = x1;
						y = y1;
						d = d1;
					} else {
						a = "no";
						break;//経由失敗
					}
				} else {//時間が奇数の場合
					if (subD % 2 == 1) {//移動距離が奇数
						a = "yes";
						t = t1;
						x = x1;
						y = y1;
						d = d1;
						System.out.println("経由成功4");
					} else {
						a = "no";
						break;//経由失敗
					}

				}
			}
		}
		System.out.println(a);
	}
}
