package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i <= height / 2) {
                    if (j < i || j > height - i + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(8);
                    }
                } else {
                    if (j <= height - i || j > i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(8);
                    }
                }
                if (j == height) {
                    System.out.println();
                }
            }
        }
    }
}
