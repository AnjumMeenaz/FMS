import java.util.*;
class BinomialCoefficent 
{
    // Returns value of Binomial 
    // Coefficient C(n, k)
    static int binomialCoeff(int n, int k) 
    {
    
        // Base Cases
        if (k == 0 || k == n)
            return 1;
        
        // Recur
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }
    
    /* Driver program to test above function */
    public static void main(String[] args) 
   {
        int n = 0, k = 0;
		Scanner in=new Scanner(System.in);
		System.out.printf("enter the n and k values  ");
		n=in.nextInt();
		k=in.nextInt();
        System.out.printf("Value of C(%d, %d) is %d ",n, k, binomialCoeff(n, k));
    }
}