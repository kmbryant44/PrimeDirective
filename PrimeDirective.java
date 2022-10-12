// Import statement:
import java.util.*;

class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number) {
    //edge cases
    if (number == 2) {
      return true;
    }
    else if (number < 2) { 
      return false;
    }
    //loop to check if number is prime
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
//build ArrayList of the prime numbers
  public ArrayList<Integer> onlyPrimes(int [] numbers) {
    ArrayList<Integer> primes = new ArrayList<>();
    //use for each loop to find primes
    for(int number : numbers) {
      if (isPrime(number) == true) {
        primes.add(number);
      }
    }
    return primes;
  }
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    //System.out.println(pd.isPrime(0));

    System.out.println(pd.onlyPrimes(numbers));

  }  

}