package Arrays.Container_With_Most_Water;

public class ContainerWithMostWater {
    public static int maximumArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right] * (right - left)));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {

        int[] arguments = {8, 6, 5, 12, 9, 2, 3};
        int x = ContainerWithMostWater.maximumArea(arguments);
        System.out.println(x);

    }
}