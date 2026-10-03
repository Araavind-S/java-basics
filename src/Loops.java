public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i=1;
        while (i<=10) {
            System.out.println("7 x "+i+" = "+7*i);
            i++;
        }
        int sum=0;
        for(int j=0;j<=100;j+=2){
            sum+=j;
        }
        System.out.println(sum);
        int factorial=1;
        for(int k=5;k>=1;k--){
            factorial=factorial*k;
        }
        System.out.println(factorial);
        int num=12345;
        int count=0;
        while(num>0){
            num=(num/10);
            count++;
        }
        System.out.println(count);
        for(int a=1;a<=5;a++){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
