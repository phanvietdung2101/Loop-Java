import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers, count = 0, x = 2;
        System.out.println("Nhap so luong so nguyen to can in ra: ");
        numbers = sc.nextInt();

        while(count <= numbers){
            if(isPrime(x)) {
                count++;
                System.out.println(x);
            }
            x++;
        }

    }
    public static boolean isPrime(int number){
        if(number < 2){
           return false;
        } else {
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0)
                    return false;
            }
        }
        return true;
    }
}
