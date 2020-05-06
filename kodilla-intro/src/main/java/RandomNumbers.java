import java.util.Random;

public class RandomNumbers {

 
    public static void main(String[] args) {


        Random random  = new Random();

        int result = 0;
        int sum = 0;
        int max = -1;
        int min = 31;

        while (sum < 5000) {
            result++;
            int temp = random.nextInt(30);
            sum = sum + temp;

            if (temp > max ) {
                max = temp;
            }
            if (temp < min ) {
                min = temp;
            }

        }

        System.out.println("Min value is: " + getMinValue());
        System.out.println("Max value is: " + getMaxValue());


    }

    public static int getMaxValue() {
        int max = 0;
        return max;
    }

    public static int getMinValue() {
        int min = 0;
        return min;
    }
}
