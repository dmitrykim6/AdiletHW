package HW160;

public class Main {
    public static boolean hamletQuote(boolean toBe, boolean notToBe){

    if(toBe || !toBe &&  notToBe)return true;
        else return false;
    }


    public static void main(String[] args) {
        System.out.println(hamletQuote(true, true));
        System.out.println(hamletQuote(true, false));
        System.out.println(hamletQuote(false, true));
        System.out.println(hamletQuote(false, false));
    }




}
