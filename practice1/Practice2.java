package practice1;

public class Practice2 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 값 수정
        array[0][1] = 10; // (0행, 1열)의 값을 10으로 수정
        array[2][2] = 15; // (2행, 2열)의 값을 15로 수정

        // 배열 출력
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

