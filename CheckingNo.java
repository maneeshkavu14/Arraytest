public class CheckingNo {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int n = arr.length;        
        int x = 4; 

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Yes");
                return; 
            }
        }
        System.out.println("No");

    }
}