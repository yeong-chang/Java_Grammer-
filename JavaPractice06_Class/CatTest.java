package JavaPractice06_Class;


public class CatTest {
    public static void main(String[] args){
        Cat cat = new Cat();

        //cat 필드값 입력
        cat.name="딱콩이";
        cat.breeds="페르시안";
        cat.age=3;

        //필드값 출력
        System.out.println("이름:"+cat.name+", 종:"+cat.breeds+", 나이:"+cat.age);

        //Cat 메서드 호출
        cat.claw();
    }
}
//팔드영역
class Cat{
    String name;
    String breeds;
    int age;
    //메서드 영역
    void claw(){
        System.out.println("고양이가 할큅니다");
    }
}