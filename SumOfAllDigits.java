public class SumOfAllDigits {
    
    public static void main(String[] args) {
        int[] N = {1, 8, 5, 31, 5}; 
        
        int totalSum = 0; 
        for (int i = 0; i < N.length; i++) {
            int number = N[i];
            totalSum += sumDigits(number);
        }

        System.out.println("sum of all digits is: " + totalSum);
    }

    public static int sumDigits(int number) {
        int sum = 0; 
        while (number > 0) {
            int digit = number % 10; 
            sum += digit; 
            number = number / 10; 
        }
        return sum;
    }
}