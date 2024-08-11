import java.util.Scanner;

public class Summer1407_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean findokay = false;

        System.out.print("배열의 크기를 입력하시오 : ");
        
        int n = sc.nextInt();
        int[] ary = new int[n];
        System.out.print("배열의 숫자를 입력하시오 : ");

        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }

        System.out.print("더했을때 찾을 값을 입력하시오 : ");

        int find = sc.nextInt();

        for (int i = 0; i < ary.length; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                if(ary[i] + ary[j] == find) {
                    findokay = true;
                    System.out.println(i + " " + j);
                    break;
                }
            }
            if (findokay) break;
        }

        if(!findokay) System.out.println("해당하는 값을 찾을수 없습니다.");

    }
}
