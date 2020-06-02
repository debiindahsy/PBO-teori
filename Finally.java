public class try_return_finally {
  
    public static String myMethod()
    {
       try {
         return "Ini adalah pernyataan return dalam blok try";
         
       }
       finally {
         System.err.println("Ini adalah pernyataan dalam blok finally");
         System.err.println("Pernyataan ini dieksekusi walaupun blok try memiliki pernyataan return");
       }
    }
    
    public static void main(String args[])
    {
       System.out.println(myMethod());  
    }
 
}
