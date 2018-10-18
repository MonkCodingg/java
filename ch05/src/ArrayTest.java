
public class ArrayTest {
	public static void printArray(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		printArray(new int[] {1, 2, 3, 4 });
	} 

}
