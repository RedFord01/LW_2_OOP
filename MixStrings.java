public class MixStrings {
    public static void main(String[] args) {
        String str1 = "Bidm!";
        String str2 = "ul e";
        System.out.println(getStringsMix(str1, str2));
    }
    private static String getStringsMix(String str1, String str2) {
        String shorterString = str2;
        boolean isLongerSecond = false;
        if (str1.length() < str2.length()) {
            shorterString = str1;
            isLongerSecond = true;
        }
        StringBuilder builder = new StringBuilder(); // створюємо клас білдер для праці з символами;
        int i;
        for (i = 0; i < shorterString.length(); i++) {
            builder.append(str1.charAt(i)).append(str2.charAt(i));
        }
        if (isLongerSecond)
            builder.append(str2.substring(i));
        else
            builder.append(str1.substring(i));
        return builder.toString();
    }

}
