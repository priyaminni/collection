
public class ArrayTest3 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 1, 4, 6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i+ 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("The duplicate element is " + a[i]);
				}
			}

		}

	}

}
