import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String giriniz : ");
        String str = input.nextLine();
        String[] arr1 = str.split("") ;
        int x = arr1.length-1;
        int total=0;

        for(int i=0;i<arr1.length;i++) {

            if(!arr1[i].equals(arr1[x-i])) {

                System.out.println("Palindrom kelime değil");
                break;
            }else {total++;}

        }
        if(total-1 == x) {
            System.out.println("Palindrom Kelime");
        }

    }
}

