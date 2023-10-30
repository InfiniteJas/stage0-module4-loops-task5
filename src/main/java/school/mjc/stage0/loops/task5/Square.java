package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if (sideLength <= 0) {
            System.out.print();
            return;
        }
        for (int i = 0; i < sideLength; i++) {
            System.out.print("8");
        }
        System.out.println();

        for (int i = 2; i < sideLength; i++) {
            System.out.print("8");
            for (int j = 2; j < sideLength; j++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }

        if (sideLength > 1) {
            for (int i = 0; i < sideLength; i++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
