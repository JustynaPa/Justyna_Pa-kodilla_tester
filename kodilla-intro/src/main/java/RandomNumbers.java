import java.util.Random;

public class RandomNumbers {

    int max;
    int min;

 
    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateNumbers();


        System.out.println("Min value is: " + randomNumbers.getMinValue());
        System.out.println("Max value is: " + randomNumbers.getMaxValue());


    }
     public void generateNumbers() {
         Random random  = new Random();

         int sum = 0;
         max = -1;
         min = 31;

         while (sum < 5000) {

             int temp = random.nextInt(30);
             sum = sum + temp;

             if (temp > max ) {
                 max = temp;
             }
             if (temp < min ) {
                 min = temp;
             }

         }
     }

    public int getMaxValue() {
        return max;
    }

    public int getMinValue() {
        return min;
    }
}
