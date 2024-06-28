import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MostRepeatingLetters {

    public static String findWordWithMostRepeatingLetters(String str){
        Map<Character,Integer> hmap = new HashMap<>();
        String[] arr = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int maxi = 0 ;
        int[] count = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                hmap.put(arr[i].charAt(j), hmap.getOrDefault(arr[i].charAt(j), 0)+1);
            }
            System.out.println(hmap);
            int max=0;
            for(Map.Entry<Character,Integer> e : hmap.entrySet()){
                if(e.getValue()>max){
                    max = e.getValue();
                }
            }
            count[i] = max;
            System.out.println(max);
            hmap.clear();
        }

        for(int i=0;i<=count.length-1;i++){
            if(count[i]>count[maxi]){
                maxi = i;
                System.out.println(maxi);
            }else if(count[i] == count[maxi]){

            }
        }
        sb.append(arr[maxi]);

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println(findWordWithMostRepeatingLetters(str));
        sc.close();
    }
}
