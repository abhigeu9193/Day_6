public class problem6 {
        public static void primeFactors(int n)
        {
            int c = 2;
            while (n > 1) {
                if (n % c == 0) {
                    System.out.print(c + " ");
                    n /= c;
                }
                else
                    c++;
            }
        }
        public static void main(String[] args)
        {
            int n = 9;
            primeFactors(n);
        }
    }