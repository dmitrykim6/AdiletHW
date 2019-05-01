public class Main {

    enum Apple{
        Jonathan, GoldenDel, RedDel, Winesap, Cortland
    }

    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы: ");

        Apple allapples[] = Apple.values();
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }

        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержит "+  ap);
    }
}
