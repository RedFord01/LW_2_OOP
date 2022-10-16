public class BlockLength {
    public static void main(String[] args) {
        String str = "Niiiiiice!";
        System.out.println(getBlockLength(str));
    }
    private static int getBlockLength (String str) {
        char c = str.charAt(0); // Перший символ рядка
        int max = 0;
        int len = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) { // Якщо елемент рядка повторюється
                len++;
            }
            else { // При зміні елемента запам'товуємо новий і скидаємо довжину
                c = str.charAt(i);
                len = 1;
            }
            // Якщо довжина більша від максимуму – переприсвоюємо максимум
            if (len > max) max = len;
        }
        return max;
    }
}
