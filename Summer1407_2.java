import java.util.Scanner;

public class Summer1407_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("배열의 크기를 입력하세요 : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("배열의 값을 입력하세요 : ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("정렬된 배열의 값입니다 : ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
