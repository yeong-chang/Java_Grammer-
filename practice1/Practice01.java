package practice1;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        // - 1~100사이 난수 발생, 이 숫자 맞추기
        // 1. 1~100사이 난수
        System.out.println("┌────────────────────────────────────────┐");
        System.out.println("│  1~100사이 난수 발생, 이 숫자 맞추기!          │");
        System.out.println("└────────────────────────────────────────┘");

//		for (int i = 1; i <= 20; i++) {
//			int answer = (int) (Math.random() * 100) + 1;// 난수
//			System.out.printf("answer:%2d%n", answer);
//		}

        int input  = 0; //입력 변수
        int answer = 0; //발생 난수(답)


        answer = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("answer=%d%n",answer);

        do {
            System.out.print("1~100사이 숫자 입력 하세요>");
            input = scanner.nextInt();

            if(input>answer) {
                System.out.println("더 작은 수를 입력 하세요.");
            }else if(input<answer){
                System.out.println("더 큰 수를 입력 하세요.");
            }

        }while(input!=answer);
        System.out.println("정답 입니다.");

    }
}
