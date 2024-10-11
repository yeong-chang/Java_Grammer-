package JavaPractice04_Loops;

public class WhileStatement {
    public static void main(String[] args) {
        // 입력값 받기
        int startNum = 5;

        // 카운트 다운 출력
        countDown(startNum);
    }

    public static void countDown(int num) {
        System.out.println("카운트 다운을 시작합니다..");

        //num이 0보다 작거나 클때 까지 실행
        while (num>=0) {
            System.out.printf("%d..\n", num);
            num--;
        }

        System.out.println("발사!!");
    }
}
