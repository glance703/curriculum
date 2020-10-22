package check;

public class Check {
	public static void main(String[] args) {
		//【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
		//firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
		//なお、変数のアクセス修飾子は「private」とする。
		private String firstName = "猿田";
		private String lastName = "涼";

		//【Check.java】にてfirstNameとlastNameを引数で受け取って、
		//連結して表示させるメソッド「printName」を作成しなさい。
		//作成した関数のアクセス修飾子は「private」とする。
		private void printName(String firstName, String lastName) {
			System.out.println(firstName + lastName);
		}

		//【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、
		//下記の完成イメージを出力させなさい。
		Pet name = new Pet();
		RobotPet output = new RobotPet();

		name.Pet(new RobotPet(CHECK_CLASS_JAVA),  new RobotPet(CHECK_CLASS_HOGE));
		RobotPet output = new RobotPet(CHECK_CLASS_JAVA),  new RobotPet(CHECK_CLASS_HOGE));
	}
}
