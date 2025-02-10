import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            numbers.add(sc.nextInt());
        }
        
        // 오른차순으로 정렬
        numbers.sort(null);
        
        for(int number : numbers){
            System.out.println(number);
        }
    }
}