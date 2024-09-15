public class ReverseEachWord {
    public static void main(String[] args) {
        // Sample input string
        String input = "java is platform independent";
        
        // Call the method to reverse each word and print the result
        String output = reverseEachWord(input);
        System.out.println(output);
    }

    // Method to reverse each word in the input string
    public static String reverseEachWord(String input) {
        // Split the input string into words using space as a delimiter
        String[] words = input.split(" ");
        
        // StringBuilder to accumulate the result
        StringBuilder reversedWords = new StringBuilder();
        
        // Iterate through each word in the array
        for (String word : words) {
            // Reverse each word and append it to the StringBuilder
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedWords.append(reversedWord).append(" ");
        }
        
        // Convert StringBuilder to string and trim trailing space
        return reversedWords.toString().trim();
    }
}
