package JavaPractice05_Arrays;

public class SumArray {
    public static void main(String[] args){
        // 변수 생성
        int[] runningMinutes = { 42, 66, 57, 54, 88 };
        int sum = 0;
        //총합계산
        int i = 0;
        for (i=0;i<runningMinutes.length;i++) {
            sum += runningMinutes[i];
        }
        // 평균 계산
        double average = sum / 5.0;
        // 결과 출력
        System.out.printf("달리기 시간 총합: %d분\n", sum);
        System.out.printf("달리기 시간 평균: %.0f분\n", average);
    }
}
