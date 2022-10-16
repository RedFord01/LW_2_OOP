public class DivideOnWords {
    public static void main(String[] args) {
        String str = "Dolby atmos is the best!";
        getWords(str);
    }
    public static void getWords(String str) {
        // Розділяємо рядок на слова через пробіли
        String[] words = str.split(" ");
        System.out.println("Слова:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
