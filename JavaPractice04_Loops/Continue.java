package JavaPractice04_Loops;

public class Continue {
    public static void main(String[] args) {
        printSum(1, 10);
    }

    public static void printSum(int start, int end) {
        // 변수 생성
        int sum = 0;

        // 반복 수행
        for (int i = start; i <= end; i++) {
            // 만약 i가 3의 배수인경우 넘어간다
            if (i % 3 == 0) {
                continue;
            }

            System.out.printf("%d", i);
            sum += i;

            // 만약 i가 end인 경우 반복문을 빠져나간다
            if (i==end) {
                break;
            }
            System.out.printf(" + ");
        }

        // 결과 출력
        System.out.printf("\n=> %d", sum);
    }
}
