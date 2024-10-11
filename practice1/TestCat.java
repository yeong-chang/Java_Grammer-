package practice1;

public class TestCat {
public static void main(String[] args) {
    Cat cat = new Cat();
    cat.name = "딱콩이";
    cat.breeds = "페르시안";
    cat.age = 1;

    System.out.printf("이름: %s\n", cat.name);
    System.out.printf("품종: %s\n", cat.breeds);
    System.out.printf("나이: %d\n", cat.age);
}
}
class Cat{
    String name;
    String breeds;
    int age;
}
