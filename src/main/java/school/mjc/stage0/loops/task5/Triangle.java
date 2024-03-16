package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                System.out.print(8);
                if (i == j) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}
