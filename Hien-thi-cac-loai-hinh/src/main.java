import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        do {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle(The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    int width,height;
                    System.out.println("Enter width:");
                    width = sc.nextInt();
                    System.out.println("Enter height: ");
                    height = sc.nextInt();
                    for(int i = 1; i <= height; i++){
                        for(int j = 1; j <= width; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Enter width same as height:");
                    width = sc.nextInt();
                    System.out.println("Choose:\n1.Top-left\n2.Top-right\n3.Bottom-left\n4.Bottom-right");
                    int corner = sc.nextInt();
                    switch (corner){
                        case 1:
                            int i = 0;
                            int j;
                            while(i < width){
                                j = width - i;
                                while(j > 0){
                                    System.out.print("* ");
                                    j--;
                                }
                                System.out.print("\n");
                                i++;
                            }
                            break;
                        case 2:
                            i = 0;
                            int k;
                            while(i < width){
                                j = width - i;
                                k = i;
                                while(k > 0){
                                    System.out.print("  ");
                                    k--;
                                }
                                while(j > 0){
                                    System.out.print("* ");
                                    j--;
                                }
                                System.out.print("\n");
                                i++;
                            }
                            break;
                        case 3:
                            i = 1;
                            while(i <= width){
                                j = 1;
                                while(j <= i){
                                    System.out.print("* ");
                                    j++;
                                }
                                System.out.print("\n");
                                i++;
                            }
                            break;
                        case 4:
                            i = 1;
                            while(i <= width){
                                j = 1;
                                k = 1;
                                while(k <= width - i){
                                    System.out.print("  ");
                                    k++;
                                }
                                while(j <= i){
                                    System.out.print("* ");
                                    j++;
                                }
                                System.out.print("\n");
                                i++;
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter size");
                    height = sc.nextInt();
                    width = 2 * (height - 1) + 1;
                    for(int i = 0; i < height; i++){
                        for(int j = 1; j <= (width - 1 - i * 2) / 2; j++)
                            System.out.print(" ");
                        for(int k = 1; k <= i; k++)
                            System.out.print("*");
                        System.out.print("*");
                        for(int k = 1; k <= i; k++)
                            System.out.print("*");
                        for(int j = 1; j <= (width - 1 - i * 2) / 2; j++)
                            System.out.print(" ");
                        System.out.print("\n");
                    }
                case 4:
                    System.exit(0);
            }
        } while (choice != 4);
    }
}
