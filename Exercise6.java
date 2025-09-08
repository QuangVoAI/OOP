import java.util.*;
public class Exercise6 {
    public static double avarageScore (double math, double literature, double english){

        return (math * 2.0 + literature + english) / 4.0;
    }

    public static void studyRank (double avg){

        if (avg >= 8.0){
            System.out.println("Rank A");
        }
        else if (avg >= 5.0 && avg < 8.0){
            System.out.println("Rank B");
        }
        else{
            System.out.println("Rank C");
        } 
    }
    
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Math score: ");
        double math, literature, english;
        while (true){
            math = sc.nextDouble();
            if (math >= 0 && math <= 10){
                break;
            }
            System.out.print("Invalid input. Please enter again: ");
        }

        System.out.print("Literature score: ");
        while (true){
            literature = sc.nextDouble();
            if (literature >= 0 && literature <= 10){
                break;
            }
            System.out.print("Invalid input. Please enter again: ");
        }

        System.out.print("English score: ");
        while(true){
            english = sc.nextDouble();
            if (english >= 0 && english <= 10){
                break;
            }
            System.out.print("Invalid input. Please enter again: ");
        }

        double avg = avarageScore(math, literature, english);
        
        System.out.printf("Avarage Score is %.2f\n", avarageScore(math, literature, english));
        studyRank(avg);
    }
}
