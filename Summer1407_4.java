import java.util.Scanner;

public class Summer1407_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        str = str.trim();
        int count = moeum(str);

        System.out.println(count);

        }
    public static int moeum(String str) {
        int count = 0;
        int index = 0;
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[index] = str.charAt(i);
            index++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ) {
                count++;
            }
        }

        return count;
    }
}
