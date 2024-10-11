package practice1;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class Lotto { public static void main(String[] args) {
    // 45개의 공을 만든다
    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 1; i < 45; i++) {
        numbers.add(i);
    }
    // 섞는다
    Collections.shuffle(numbers);

    // 뽑는다
    int[] pickedNumbers = new int[6];
    for(int i = 0; i < pickedNumbers.length; i++){

        pickedNumbers[i]=numbers.remove(0);
    }

    // 결과 출력
    System.out.printf("자동 생성 번호: %s", Arrays.toString(pickedNumbers));
    }
}
