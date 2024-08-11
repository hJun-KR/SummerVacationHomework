import java.util.Scanner;

public class Summer1407_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력하세요 : ");
        String str = sc.nextLine();
        char[] ch = new char[str.length()];
        int index = 0;
        int[] alphacount = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            ch[index] = str.charAt(i);
            index++;
        }

        while (true) {
            System.out.print("지울 문자를 입력하세요 (0을 입력하여 종료)");
            char input = sc.next().charAt(0);
            if (input == '0') break;
            if ((input < 'a' && input == 'z') || (input < 'A' && input == 'Z')) {
                System.out.println("다시 입력하세요");
                continue;
            }
            int removeCount = findalpha(ch, input, alphacount);
            System.out.println("제거된 문자수 : " + removeCount);

        }

        System.out.print("제거된 문장 : ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        System.out.println();
        
        System.out.println("제거된 알파벳");
        for (int i = 0; i < alphacount.length; i++) {
            char c = (char)('a'+i);
            if (alphacount[i] > 0) {
                System.out.println(c + " : " + alphacount[i]);
            }
        }

    }

    public static int findalpha(char[] ch, char input, int[] alphacount) {
        int removeCount = 0;

        if (input >= 'A' && input <= 'Z') {
            input = (char) (input + 'a' - 'A');
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == input || ch[i] == (char)(input - 'a' + 'A')) {
                ch[i] = '\0';
                removeCount++;
            }
        }

        alphacount[input-'a'] = removeCount;

        return removeCount;
    }

}
