package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {

                int middleValue = sideLength / 2 + 1;
                if (i == middleValue && j != middleValue) {
                    System.out.print(8);
                } else if (j == middleValue) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
                if (j == sideLength) {
                    System.out.println();
                }
            }
        }

    }
}
