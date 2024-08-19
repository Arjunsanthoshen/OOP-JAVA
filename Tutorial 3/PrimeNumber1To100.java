public class PrimeNumber1To100{
    public static void main(String[] args){
        int i,n;
        System.out.println("\nThe prime numbers B/W 1 to 100 are :");
        for(n=2;n<=100;n++){
            boolean isPrime=true;
            for(i=2;i<=n/2;i++){
                if (n % i == 0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(n+" ");
            }
        }
    }
}
