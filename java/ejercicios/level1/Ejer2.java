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
        System.out.print("1st number: ");
        nums[0] = scanner.nextInt();
        System.out.print("2nd number: ");
        nums[1] = scanner.nextInt();
        scanner.close();
        // System.out.println(Arrays.toString(nums));
        return nums;
    }

}
