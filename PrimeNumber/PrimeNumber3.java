package SecondDay.PrimeNumber;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int number1= 7;
        boolean isPrime = true;
        if (number1<=1){
            isPrime = false;
        }else{
            for (int i=2; i*i<=number1;i++){
                if (number1%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Entered number "+number1+" is Prime number");
        }else{
            System.out.println("Entered number "+number1+" is not a Prime number");
        }
    }
}
