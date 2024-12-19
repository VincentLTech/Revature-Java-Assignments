public class FlowControlStatements {
    public static void main(String[] args) {
        // First label
        first:
        for (int i = 0; i < 3; i++) {
        // Second label
        second:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {

                    // Using break statement with label
                    break first;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
