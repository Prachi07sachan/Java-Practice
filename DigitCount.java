public class DigitCount {
    public static void main(String[] args) {
        int num = 122334;
        int[] count = new int[10];

        while (num > 0) {
            int digit = num % 10;
            count[digit]++;
            num = num / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + " times");
            }
        }
    }
}