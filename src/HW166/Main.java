package HW166;

public class Main {
    public static String mergeStrings(String one, String two){
        String newString ="";
        String smallWord = one;
        String bigWord = two;

        if(one.length() > two.length()){
            smallWord = two;
            bigWord = one;
        }

        for(int i = 0; i < smallWord.length(); i++){
            newString = newString + one.charAt(i) + two.charAt(i);
        }
        newString = newString + bigWord.substring(bigWord.length()-(bigWord.length() - smallWord.length()));


    return newString;
    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("12345", "abcde"));
        System.out.println(mergeStrings("WOODEN", "spoon"));
        System.out.println(mergeStrings("JAVA", "selenium"));

    }

}
