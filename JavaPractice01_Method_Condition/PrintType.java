package JavaPractice01_Method_Condition;

public class PrintType {
    public static void main(String[] args) {
        // 변수 생성
        String title = "로미오와 줄리엣";
        String author = "윌리엄 셰익스피어";
        double price = 5.94;

        // 결과 출력
        // %s = 문자형 , %n = 줄 바꿈
        System.out.printf("제목: %s%n", title);
        System.out.printf("저자: %s%n", author);
        // %.2f 소수점 두번째 자리까지 출력
        System.out.printf("가격: $%.2f%n", price);
    }
}
