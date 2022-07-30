import java.util.Scanner;

public class EX02 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.print("마름모 중간선의 별 갯수를 입력하세요>>>(홀수만 입력가능)");
      int n=scan.nextInt();
      for (int i = 0; i < n; i++) {
         if (i < n/2+1) { // 삼각형 만들기
            for (int j = 0; j < n / 2 - i; j++) {
               System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
               System.out.print("*");
            }
            System.out.println();
         } else { // 역삼각형?? 만들기
            for (int h = n / 2; h < i; h++) {
               System.out.print(" ");
            }
            for (int g = 0; g < (n % i) + (n % (i + 1)); g++) {
               System.out.print("*");
            }
            System.out.println();
         }
      }

   }
}