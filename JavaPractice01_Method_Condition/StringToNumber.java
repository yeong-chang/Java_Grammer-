package JavaPractice01_Method_Condition;

public class StringToNumber {
    public static void main(String[] args) {
        // 문자형 변수 생성
        String strSeven = "7";
        String strPi = "3.14";
        // 형변환: 문자형 => 숫자
        int a = Integer.parseInt(strSeven);
        double b = Double.parseDouble(strPi);
        // 숫자 계산git
        double c = a + b;
        // 결과 출력
        System.out.printf("%d + %.2f = %.2f", a, b, c);
    }
}
