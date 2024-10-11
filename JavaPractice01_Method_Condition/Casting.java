package JavaPractice01_Method_Condition;

public class Casting {
    public static void main(String[] args) {
        // 실수형 변수 생성
        double tall = 176.4;
        double weight = 82.34;

        // 실수형 변수를 정수로 캐스팅.
        System.out.printf("신장: %dcm\n", (int)tall);
        System.out.printf("체중: %dkg\n", (int)weight);
        //출력결과
        //신장: 176cm
        //체중: 82kg
    }
}
