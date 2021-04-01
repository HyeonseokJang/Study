import java.util.Scanner;

public class Book_3 {
    public static void main(String[] args) {
        // 다음 2차원 배열 n을 출력하는 프로그램을 작성하라
        int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };

        System.out.println(n.length);
        System.out.println(n[0].length);

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

        // Scanner 을 이용하여 정수를 입력받고 다음과같이 *를 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>");
        int num = sc.nextInt();
        sc.close();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
