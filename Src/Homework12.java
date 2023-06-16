import java.util.Arrays;
import java.util.Random;

public class Homework12 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = new int[7];
        int[] array2 = new int[7];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(8);
            array2[i] = random.nextInt(8);

        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
            if (count > 0) {

            }
            for (int j = 0; j < 7; j++) {
                if (array1 == array2) {
                    count++;
                }
            }
        }

    }

}
