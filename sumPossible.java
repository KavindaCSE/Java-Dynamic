import java.util.List;
import java.util.Arrays;;

public class sumPossible {

    public static boolean sumPos(int a , List<Integer> list){
        // int item ;
        if ( a == 0){
            return true;
        }
        System.out.println(a);

        for (int item : list){
            if ( item <= a){
                if(sumPos(a-item, list)){
                    return true;                    
                }
            }
        }

        return false;
        
    }

    public static void main(String[] arg){

        List<Integer> list = Arrays.asList(2,4,7);
        boolean result = sumPos(5, list);
        System.out.println(result);

    }
}