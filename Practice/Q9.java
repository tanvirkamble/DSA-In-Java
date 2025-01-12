package Practice;

public class Q9 {
    public static void main(String[] args) {
        
        int row = 5;
        for (int i = 1; i <= row; i++) {
            
            int num = 1;
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" " );
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            for (int j = 2; j <= i+1; j++) {
                if (num == 1 ) {
                    break;
                }
                num--;
                System.out.print(num);
            }
            System.out.println();

           

        }
    }
}
