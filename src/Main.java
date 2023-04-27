import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter you");

        Scanner in = new Scanner(System.in);
        //String out = in.nextLine();
        

        int i = 0;
        do {
            System.out.println("i is : "+i);
            i++;
        }while (i<10);

//        for (int i=0; i<10 ;i++){
//            System.out.println(i);
//        }
        in.close();

    }
}