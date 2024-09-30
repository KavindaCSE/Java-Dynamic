/**
 * fib
 */
class fib {

    static int value ;

    public static int fibonacci(int a){
        if(a==0){
            return 0;
        }else if (a == 1){
            return 1;
        }else{
            return fibonacci(a-1) + fibonacci(a-2);
        }
    }

    public static void main(String[] arg){
        value = fibonacci(10);
        System.out.println(value);
    }
}