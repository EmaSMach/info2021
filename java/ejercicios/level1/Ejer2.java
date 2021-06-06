package ejercicios.level1;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        int[] nums = askNums();
        System.out.println(String.format("%d + %d = %d", nums[0], nums[1], nums[0] + nums[1]));
        System.out.println(String.format("%d - %d = %d", nums[0], nums[1], nums[0] - nums[1]));
        System.out.println(String.format("%d * %d = %d", nums[0], nums[1], nums[0] * nums[1]));
        System.out.println(String.format("%d / %d = %d", nums[0], nums[1], nums[0] / nums[1]));
        System.out.println(String.format("%d %% %d = %d", nums[0], nums[1], nums[0] % nums[1]));
    }

    public static int[] askNums() {
        int[] nums = new int[2];
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        nums[0] = 8;
        nums[1] = 4;
        System.out.println(Arrays.toString(nums));
        return nums;
    }

}
