package SecondDay;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 7;
        boolean isPrime = true;
        if(number<=1) {
            isPrime = false;
        }else {
            for (int i =2;i<=number-1;i++){
                if (number%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("The Entered "+number+ " is Prime number");
        }else{
            System.out.println("The Entered "+number+ " is not a Prime number");
        }
    }
}
