package JavaPractice05_Arrays;

public class Grade {
    public static void main(String[] args) {
        // 배열 생성
        //grade = 학년
        String[] grade = {"1","2","3","4"};
        //grades = 학점
        double[] grades = {3.45,2.82,3.85,3.94};

        //i가 0일때 grade배열의 길이만큼 반복
        for(int i=0;i<grade.length;i++) {
            System.out.printf("%s학년: %.2f\n", grade[i], grades[i]);
        }
    }
}
