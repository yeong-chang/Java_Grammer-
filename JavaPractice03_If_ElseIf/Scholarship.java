package JavaPractice03_If_ElseIf;

public class Scholarship {
    public static void main(String[] args) {
        //메소드 호출
        printTest("Park", 100, 92); // Park => 전액 장학금!
        printTest("Kim", 82, 96); // Kim => 반액 장학금!
        printTest("Choi", 82, 88); // Choi => 다음 기회에~
    }

    public static void printTest(String name, int math, int eng) {
        // 변수 생성
        String result = "";

        // 조건에 따른 값 변경
        // && -> 두조건이 모두 성립해야 실행
        if (math>=90&&eng>=90) {
            result = "전액 장학금!";
            // || -> 둘중에 하나만 성립해도 실행
        } else if (math>=90||eng>=90) {
            result = "반액 장학금!";
        } else {
            result = "다음 기회에~";
        }

        // 결과 출력
        System.out.printf("%s => %s\n", name, result);
    }
}
