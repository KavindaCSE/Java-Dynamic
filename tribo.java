public class tribo {

    public static int fibonacci(int a){
        if(a==0 | a == 1){
            return 0;
        }else if (a == 2){
            return 1;
        }else{
            return fibonacci(a-1) + fibonacci(a-2) + fibonacci(a-3);
        }
    }

    public static void main(String[] arg){
        int value = fibonacci(8);
        System.out.println(value);
    }
    
}
