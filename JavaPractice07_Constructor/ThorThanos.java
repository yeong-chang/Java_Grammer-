package JavaPractice07_Constructor;

public class ThorThanos {
    public static void main (String[] args){
        //객체 생성
    Unit thor =new Unit("토르",150);
    Unit thanos =new Unit("타노스",160);

    //토르의 펀치
    thor.punch(thanos);

    //타노스의 펀치
    thanos.punch(thor);
    thor.punch(thanos);
    }
}
class Unit{
    //필드
    String name;
    int hp;

    //생성자
    public Unit(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    //메서드
    public void punch(Unit enemy){
        //때린 객체
        System.out.printf("[%s]의 펀치!!",name);
        //맞을 객체
        System.out.printf(" %s의 HP: %d ->",enemy.name,enemy.hp);
        //체력 감소
        enemy.hp -= 10;
        //맞은 객체의 hp
        System.out.printf(" %d\n",enemy.hp);
    }

}
