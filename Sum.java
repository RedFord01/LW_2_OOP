public class Sum {
    public static void main(String[] args) {
        String str1 = "Ed1eJo6";
        String str2 = "Casper";
        System.out.println(getNumbersSum(str1));
        System.out.println(getNumbersSum(str2));
    }
    private static int getNumbersSum(String str) {
        int Sum = 0;
        for(int i = 0; i<str.length();i++) {
            // Якщо символ рядка цифра
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int numericVal = Character.getNumericValue(str.charAt(i)); // Конфвертуємо з ascii в int
                Sum += numericVal;
            }
        }
        return Sum;
    }
}
