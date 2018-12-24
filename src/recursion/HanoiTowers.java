package recursion;

public class HanoiTowers {

	public static void move(int n, char a, char b, char c) {
		if(n == 1) {
			System.out.println(a + "--->" + c);
		} else {
			move(n - 1, a, c, b);
			move(1, a, ' ', c);
			move(n - 1, b, a, c);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		move(3, 'A', 'B', 'C');
	}

}
