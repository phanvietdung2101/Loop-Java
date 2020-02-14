
public class main {
    public static void main(String[] args) {

        int x = 2;

        while(x <= 100){
            if(isPrime(x)) {
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
