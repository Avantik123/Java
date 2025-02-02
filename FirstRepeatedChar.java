public class Main {
    public static char firstRepeatedCharacter(String str) {
        int[] count = new int[26]; // Array for 'a' to 'z'

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (count[currentChar - 'a'] > 0) {
                return currentChar; // If character has already appeared, return it
            }
            count[currentChar - 'a']++; // Increment count
        }
        return '\0'; // If no repeated character found
    }

    public static void main(String[] args) {
        System.out.println(firstRepeatedCharacter("swiss")); // Output: 's'
    }
}
