package JavaPractice07_Constructor;

public class DrinkTest {
    public static void main(String[] args){
                // 디폴트 생성자로 객체 만들기
                Drink d1 = new Drink();
                d1.name = "포카리";
                d1.price = 1000;
                // 다른 생성자로 객체 만들기
                Drink d2 = new Drink("박카스", 800);
                // 두 객체를 배열에 저장
                Drink[] drinks = { d1, d2 };
                // 반복문을 통한 모든 객체 출력
                for (int i = 0; i < drinks.length; i++) {
                    System.out.println(drinks[i].toStr());
                }
            }
        }
// 드링크 객체
        class Drink {
            // 필드
            String name;
            int price;

            // 디폴트 생성자
            //-객체를 생성할 때 어떤 초기값도 설정하지 않고,
            //-나중에 필드 값을 할당할 수 있게 해줍니다
            Drink() {}

            // 생성자
            Drink(String n, int p) {
                name = n;
                price = p;
            }
            // 메소드
            String toStr() {
                return String.format("Drink { name: %s, price: %d }", name, price);
            }
        }
