public class Divided_by_3_5 {
    // print number between 1 to 100 can be divided by 3 and 5
    public static void main(String[] args) {
        System.out.println("\ndivided by 3");

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " , ");
            }
        }
        System.out.println("\ndivided by 5");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " , ");
            }
        }
    }
    }

