package practice1;

public class PracticeSquare {
    public static void main(String[] args) {
//        한 변의 길이가 4인 정사각형의 넓이: 16
        square s1 = new square();
        s1.width=4;

        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", s1.width, s1.area());
    }
}
    class square {
        public int width;
        public int area(){
            return width*width;
        }
    }

