public class Remainder {

    public static void main(String[] args) {
        int A = 26; 
        int B = 3;  

        int remainder = calculateRemainder(A, B);

        System.out.println(" A divided by B is "+ remainder);
    }

    public static int calculateRemainder(int A, int B) {
        return A % B; 
    }
}

