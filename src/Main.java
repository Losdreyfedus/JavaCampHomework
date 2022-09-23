public class Main {
    public static void main(String[] args) {
        int number = -1; //this project shows that a number is prime number or not
        boolean isPrime = false;
        if (number == 1 || number<0){
            System.out.println("This is not a Prime Number");
            return;
        }
        if (number == 0){
            System.out.println("This is not a Prime Number");
            return;
        }

        for (int i = 2; i<number;i++){
            if(number%i == 0){
                isPrime = true;
            }
        }
        if (isPrime == true){
            System.out.println("This is not a Prime Number");
        }
        else{
            System.out.println("This is a Prime Number!");
        }
    }
}
