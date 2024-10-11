package practice1;

public class Kakao {
    public static void main(String[] args) {

        int[] group = new int[12];
        group[0] = 12;  group[1] = 30;
        group[2] = 1;   group[3] = 8;
        group[4] = 8;   group[5] = 6;
        group[6] = 20;  group[7] = 7;
        group[8] = 5;   group[9] = 10;
        group[10] = 4;  group[11] = 1;
        System.out.println("그룹별 사람수");
    for(int i=0; i<group.length; i++) {
        System.out.print(group[i]);
        if(i<group.length-1) {
            System.out.print("      ");
        }
    }
        System.out.println("");
        System.out.println("각 그룹 연결상태");
        int[][] links = new int[12][2];
        links[0][0] = -1;  links[0][1] = -1;
        links[1][0] = -1;  links[1][1] = -1;
        links[2][0] = -1;  links[2][1] = -1;
        links[3][0] = -1;  links[3][1] = -1;
        links[4][0] = 8;   links[4][1] = 5;
        links[5][0] = 2;   links[5][1] = 10;
        links[6][0] = 3;   links[6][1] = 0;
        links[7][0] = 6;   links[7][1] = 1;
        links[8][0] = 11;  links[8][1] = -1;
        links[9][0] = 7;   links[9][1] = 4;
        links[10][0] = -1; links[10][1] = -1;
        links[11][0] = -1; links[11][1] = -1;

        for (int i = 0; i < links.length; i++) {
            System.out.print("[");
            for (int j = 0; j < links[i].length; j++) {
                System.out.print(links[i][j] );
                if(j < links[j].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if (i < links.length - 1) {
                System.out.print(",");
            }
        }


//        for (int i = 0; i < 12; i++) {
//            int count = group[i];
//            System.out.println(count);
//        }
    }
}
