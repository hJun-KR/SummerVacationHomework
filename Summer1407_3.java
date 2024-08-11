import java.util.Scanner;

public class Summer1407_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("뒤집을 문자열을 입력하세요 : ");
        String no = sc.nextLine();
        int index = 0;
        char[] ch = new char[no.length()];

        for (int i = no.length()-1; i >= 0; i--) {
            ch[index] = no.charAt(i);
            index++;
        }
        for (int i = 0; i < no.length(); i++) {
            System.out.print(ch[i]);
        }

    }
}
