import java.util.Scanner;
public class evenodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER");

        }
    }
}