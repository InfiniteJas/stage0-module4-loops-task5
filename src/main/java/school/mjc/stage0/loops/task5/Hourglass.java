package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height <= 0) {
            System.out.print(" ");
            return;
        }

        // Print the upper part of the hourglass
        for (int i = 0; i < height; i++) {
            // Print spaces before '8'-s
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print '8'-s
            for (int j = 0; j < 2 * (height - i) - 1; j++) {
                System.out.print("8");
            }
            System.out.println(); // Move to the next line
        }

        // Print the lower part of the hourglass
        for (int i = height - 2; i >= 0; i--) {
            // Print spaces before '8'-s
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print '8'-s
            for (int j = 0; j < 2 * (height - i) - 1; j++) {
                System.out.print("8");
            }
            System.out.println(); // Move to the next line
        }
    }
}
