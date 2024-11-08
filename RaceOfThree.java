public class RaceOfThree {
    public static void main(String[] args) {
        float distance = 400.0f;

        float x = 30.5f;
        float y = 60.0f; 
        float z = 54.2f; 

        float speedAlice = distance / x;
        float speedBob = distance / y;
        float speedCharlie = distance / z;

        if (speedAlice > speedBob && speedAlice > speedCharlie) {
            System.out.println("Alice had the highest average speed.");
        } else if (speedBob > speedAlice && speedBob > speedCharlie) {
            System.out.println("Bob had the highest average speed.");
        } else {
            System.out.println("Charlie had the highest average speed.");
        }
    }
}