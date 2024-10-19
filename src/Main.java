public class Main {
    public static void main(String[] args) {
        int initBalance = 100;
        int topUp = 1100;
        int bonus = topUp >= 1000 ? topUp / 100 : 0;
        System.out.println(initBalance + topUp + bonus);
    }
}