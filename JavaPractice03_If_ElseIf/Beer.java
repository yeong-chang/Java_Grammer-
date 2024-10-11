package JavaPractice03_If_ElseIf;

public class Beer {
    public static void main(String[] args) {
        order(18); // 18세가 캔맥주를 사려 함
        order(19); // 19세가 캔맥주를 사려 함
        order(20); // 20세가 캔맥주를 사려 함
    }

    public static void order(int age) {
        //19세 이상이면 실행되는 코드
        if (age>=19) {
            System.out.printf("%d세, 성인인증 완료 => 캔맥주가 나왔습니다.\n", age);

            //19세 이상이 아니면 실행되는 코드
        }else {
            System.out.printf("%d세, 성인인증 실패 => 미성년자 입니다.\n", age);
        }
    }
}
