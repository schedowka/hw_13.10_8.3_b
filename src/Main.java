public class Main {
    public static void main(String[] args) {
        for (int i = 5; i <=9 ; i++) {
            for (int j = 1; j <=5-(i-5); j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}