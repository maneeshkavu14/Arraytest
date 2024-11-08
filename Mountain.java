public class Mountain {

    public static void main(String[] args) {
        int[] heights = {100, 300, 200, 400}; 

        int tallest = findTallestMountain(heights);

        System.out.println("height of the tallest mountain is: " + tallest);
    }

    public static int findTallestMountain(int[] heights) {
        int maxHeight = 0; 

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i]; 
            }
        }

        return maxHeight; 
    }
}