class Fibonacci {
    public static void main(String[] args) {
  
      int n = 10, fTerm = 0, sTerm = 1;
      System.out.println("Fibonacci Series " + n + " terms:");
  
      for (int i = 1; i <= n; ++i) {
        System.out.print(fTerm + ", ");
  
        // compute the next term
        int nextTerm = fTerm + sTerm;
        fTerm = sTerm;
        sTerm = nextTerm;
      }
    }
  }