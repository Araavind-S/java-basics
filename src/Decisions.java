public class Decisions {
    public static void main(String[] args) {
        int a = 0;
        if (a==0){
            System.out.println("Zero");
        }
        else if (a<0){
            System.out.println("Negative");
        }
        else if (a>0){
            System.out.println("Positive");
        }
        int b = 2;
        if (b%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        double markA = 45;
        double markB = 35;
        double markC = 45;
        double avg = (markA+markB+markC)/3;
        System.out.println("Average mark is: " + avg);
        if(avg>=90){
            System.out.println("Grade A");
        }
        else if(avg>=75){
            System.out.println("Grade B");
        }
        else if(avg>=50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
        int year = 2000;
        if(year%4==0 && year%100!=0){
            System.out.println("Leap Year");
        }
        else if(year%100==0 && year%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }

    }
}
