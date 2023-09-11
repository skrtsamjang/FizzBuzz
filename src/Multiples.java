public class Multiples {
    public static void main(String[] args) {

        int count3 = 0;
        int count5 = 0;

        for (int i=1000; i > 0; i--) {

            if (i % 3 == 0) {
                count3 = count3 + 1;
            }
            if (i % 5 == 0) {
                count5 = count5 + 1;
            }
        }
        System.out.println(count3+count5);
    }
}
