package JavaPractice05_Arrays;

public class ArrayToParameter {
    public static void main(String[] args){
        // 배열 생성
        int[] evens = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 }; // 짝수
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19 }; // 소수
        // 계산 sum 메서드에 파라미터 (evens),(primes) 입력
        int evenSum = sum(evens);
        int primeSum = sum(primes);

        // 출력
        System.out.println("0 이상 20 미만의 짝수와 소수 중..");
        System.out.printf("짝수의 합: %d\n", evenSum);
        System.out.printf("소수의 합: %d\n", primeSum);
    }

    // 정수형 배열을 입력 받아 총합을 반환
    public static int sum(int[] arr) {
        int sum = 0;
        // 각 배열의 합을 구해주는 반복문
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
