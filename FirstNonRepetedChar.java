public class Main {
    public static char firstNonRepeatedCharacter(String str) {
        int[] count = new int[256]; // Step 1
        for (int i = 0; i < str.length(); i++) { // Step 2
            count[str.charAt(i)]++; // Step 3
        }
        for (int i = 0; i < str.length(); i++) { // Step 4
            if (count[str.charAt(i)] == 1) { // Step 5
                return str.charAt(i); // Step 6
            }
        }
        return '\0'; // Step 7
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("swiss")); // Output: 'w'
    }
}
