package JavaPractice06_Class;

public class Main {
    public static void main(String[] args) {
        // Dog 객체 생성
        Dog dog = new Dog();

        // Dog 객체 필드 값 출력
        System.out.printf("이름: %s\n", dog.name);
        System.out.printf("품종: %s\n", dog.breeds);
        System.out.printf("나이: %s\n", dog.age);

        //Dog클래스 메소드 호출
        dog.wag();
        dog.bark();
    }
}

//Dog클래스 생성
class Dog {
    // 필드 영역
    String name;
    String breeds;
    int age;

    //메소드 영역
    void wag() {
        System.out.println("강아지가 꼬리를 흔듭니다");
    }

    void bark() {
        System.out.println("강아지가 짖습니다");
    }
}
