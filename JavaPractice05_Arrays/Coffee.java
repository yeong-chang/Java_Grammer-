package JavaPractice05_Arrays;

public class Coffee {
    public static void main(String[] args) {
        // 길이가 5인 배열 생성
        int[] sales = new int[5];

        // 배열 값 초기화
        sales[0] = 52; // 월
        sales[1] = 50; // 화
        sales[2] = 55; // 수
        sales[3] = 42; // 목
        sales[4] = 38; // 금

        // 배열 합 계산
        int sum = 0;
        int i = 0;
        for (i = 0; i < 5; i++) {
            sum += sales[i];
        }
        // 출력
        System.out.printf("총 판매량: %d잔\n", sum);
    }
}
