# JavaConstructor
コンストラクタ

## 処理
コンストラクタを設定してメッセージを表示させる。

## コード
```
public class Sample24 {

	public static void main(String[] args) {
		Player p1 = new Player("ケンシロウ");
		p1.work();
		Player p2 = new Player("ラオウ");
		p2.work();
		p1.work();

	}

}

class Player {

	// メンバ変数
	private String myName;		

	// コンストラクタ
	public Player(String name) {
		myName = name;
	}

	// workメソッド
	public void work() {
		System.out.println(myName + "は荒野を歩いていた");

	}

}
```

## 出力結果  
```
ケンシロウは荒野を歩いていた
ラオウは荒野を歩いていた
ケンシロウは荒野を歩いていた
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
