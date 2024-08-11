import java.util.Scanner;

public class Summer1407_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요 : ");
        int n = sc.nextInt();
        int[][] ary = new int[n][n];
        int[][] rotate = new int[n][n];

        System.out.print("2차원 배열의 값을 입력하세요 : ");
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length; j++) {
                ary[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate.length; j++) {
                rotate[i][j] = ary[j][n-1-i];
            }
        }

        System.out.println("뒤집은 2차원 배열입니다.");
        for (int j = 0; j < rotate.length; j++) {
            for (int j2 = 0; j2 < rotate.length; j2++) {
                System.out.print(rotate[j][j2] + " ");
            }
            System.out.println();
        }

    }
}
