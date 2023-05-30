public class Troll {
    public static String disemvowel(String str) {
        String stringNoVowels = "";
        String strToUpperCase = str.toUpperCase();
        String vowels = "AEIOU";
        for (int i = 0; i < strToUpperCase.length(); i++) {
            if (!vowels.contains(String.valueOf(strToUpperCase.charAt(i)))) {
                stringNoVowels += String.valueOf(str.charAt(i));
            }
        }
        return stringNoVowels;
    }
}
