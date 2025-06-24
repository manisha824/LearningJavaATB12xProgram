package Tasks.Tasks;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j=1;j<=num-i;j++) {
                System.out.print(" ");}
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");}
            System.out.println();
        }


        int num1=4;
        int i=1;
        while(i<=num1){
            int j=1;
            int k=1;
            while(j<=num1-i){
                System.out.print(" ");
                j++;}
            while(k<=2*i-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }


    }
}
