import java.util.*;


class uniquewords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        
        String[] words =input.toLowerCase().split("\\w+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        
        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        
        scanner.close();
    }
}