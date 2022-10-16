public class Main {
    public static void main(String[] args) {
        String str1 = "loaded";
        String str2 = "builder";
        System.out.println(endsWithEd(str1));
        System.out.println(endsWithEd(str2));
    }

    private static boolean endsWithEd (String str) {
        boolean flag = false;
        //Якщо останній та передостанній елементи рядка дорівнюють сиволам 'd' та 'e'
        if(str.charAt(str.length()-1) == 'd' && str.charAt(str.length()-2) == 'e') {
            flag = true;
        }
        return flag;
    }
}