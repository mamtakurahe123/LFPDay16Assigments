package day16assigment;

public class PrimeNumber {

  public static void main (String[]args)
  {

    int lower = 0, upper = 1000;


    for (int i = lower; i <= upper; i++) {
      if (isPrime (i))
       System.out.println (i);
    }
	  
     for (int i = lower; i <= upper; i++)
	  if (areAnagrams(lower, upper))
	      System.out.println("Yes");
	  else
	      System.out.println("No");
      }
	 
  static boolean isPrime (int n)
  {
    int count = 0;

    // 0, 1 negative numbers are not prime
    if (n < 2)
      return false;

    // checking the number of divisors b/w 1 and the number n-1
    for (int i = 2; i < n; i++)
      {
    if (n % i == 0)
       return false;
      }

    // if reached here then must be true
    return true;
  }

  static final int TEN = 10;
   
  
  static void updateFreq(int n, int [] freq)
  {
   
      // While there are digits
      // left to process
      while (n > 0)
      {
          int digit = n % TEN;
   
          // Update the frequency of
          // the current digit
          freq[digit]++;
   
          // Remove the last digit
          n /= TEN;
      }
  }
   
  // Function that returns true if a and b
  // are anagarams of each other
  static boolean areAnagrams(int lower, int upper)
  {
   
      // To store the frequencies of
      // the digits in a and b
      int [] freqA = new int[TEN];
      int [] freqB = new int[TEN];
   
      // Update the frequency of
      // the digits in a
      updateFreq(lower, freqA);
   
      // Update the frequency of
      // the digits in b
      updateFreq(upper, freqB);
   
      // Match the frequencies of
      // the common digits
      for (int i = 0; i < TEN; i++)
      {
   
          // If frequency differs for any digit
          // then the numbers are not
          // anagrams of each other
          if (freqA[i] != freqB[i])
              return false;
      }
      return true;
  }
}