/**
 *
 * @author xekid78
 *
 */
public class Constructor {

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
