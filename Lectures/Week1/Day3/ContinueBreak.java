public class ContinueBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i == 3) {
                continue; // Continues the loop BUT SKIPS the iteration. So that it skips to print out 4
            }
            if (i == 5) {
                break; // When i is 5 the WHOLE LOOP ENDS HERE
            }
            System.out.println(i);
        }
        for (int j = 0; j < 10; j++) {
			// If the number is 2
			// skip and continue
			if (j == 2)
				continue;

			System.out.print(j + " ");
		}
    }
}