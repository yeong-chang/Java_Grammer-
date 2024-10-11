package JavaPractice07_Constructor;

public class HeroTest {
    public static void main(String[]args){
        // 객체 생성
        Hero ironMan = new Hero("아이언맨", 80);
        Hero thanos = new Hero("타노스", 160);
        Hero thor = new Hero("토르", 150);
        Hero groot = new Hero("그루트", 40);

        // 모든 객체 정보를 출력
        System.out.println(ironMan.toStr());
        System.out.println(thanos.toStr());
        System.out.println(thor.toStr());
        System.out.println(groot.toStr());
    }
}

// Hero 클래스
class Hero {
    // 필드
    String name;
    int hp;

    // 생성자
    Hero(String n, int p) {
        name=n;
        hp=p;
    }

    // 메소드
    //return 값을 문자열 형식으로 return
    String toStr() {
        return String.format("Hero { name: %s, hp: %d }", name, hp);
    }
}
