
import java.util.HashSet;
import java.util.Scanner;
public class VowelGame {
    static HashSet<Character> vowels = new HashSet<>();

    public static int checkPoints(int vowelCount) {
        if(vowelCount<2) return 0;
        if(vowelCount==2) return 1;
        if(vowelCount<5) return vowelCount;
        if(vowelCount==5) return 6;
        return 8;
    }

    public static void winner(int[] points){
        int max =0;
        boolean tie = false;
        for(int i=0;i<5;i++){
            if(points[max]<points[i]){
                max =i;
                tie = false;
            }else if(points[i] == points[max]){
                tie = true;
            } 
            System.out.println((i+1) + "-" + points[i]);
        }

        if (tie) {
            System.out.println("Winner: None");
        } else {
            System.out.println("Winner: " + (max + 1));
        }

        System.out.println("Points: " + points[max]);
    }

    public static void playersPoints(String[] playersWords) {
        int[] points = new int[5];
        for(int i=0;i<5;i++){
            int count=0;
            for(int j=0;j< playersWords[i].length();j++){
                char letter = playersWords[i].charAt(j);
                if(vowels.contains(letter)){
                    count++;
                }
                if(letter == ' '|| j ==playersWords[i].length()-1){
                   int point = checkPoints(count); 
                   points[i] +=point;
                   count =0;
                }
            }
        }
        winner(points);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        String[] players = new String[5];
        System.out.println("Enter words for each player");
        for(int i=0;i<5;i++){
            players[i] = sc.nextLine();
        }
        
        playersPoints(players);
    }
}
