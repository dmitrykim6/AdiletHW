package HW166;

public class Main {
    public static String mergeStrings(String one, String two){
        String newString ="";

        if(one.length() - two.length() >= 0){
            for(int i = 0; i < one.length(); i++){
                newString = newString + one.charAt(i) + two.charAt(i);
            }
        }else{

        }


        for(int i = 0; i < one.length(); i++){
            for(int j = 1; j < two.length(); j ++){
                newString = newString + one.charAt(i) + two.charAt(j);
            }
        }




    return newString;
    }

}
