package JavaPractice04_Loops;

public class Matrix {
    public static void main(String[] args) {
        // 입력값 받기
        int r = 3;
        int c = 7;

        // 매트릭스 출력
        printMatrix(r, c);
    }

    public static void printMatrix(int rowMax, int columnMax) {
        // 바깥쪽 for문 rowMax값이 3이므로 3번 실행
        for (int i = 0; i < rowMax; i++) {
            //안쪽 for문 columnMax값은 7이지만
            //바깥쪽 for문으로 인해 3번실행되므로 21번 실행
            for (int j = 0; j < columnMax; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
