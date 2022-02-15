/*
  Ödev
  Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/



import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int n, count = 0, sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        for (int i=1; i<n; i++) {
            if (i%3 == 0 && i%4 == 0) {
                sum +=i;
                count +=1;
            } else if (i%3 == 0) {
                sum +=i;
                count +=1;
            } else if (i%4 == 0) {
                sum +=i;
                count +=1;
            }
        }
        
        double avg = sum/count;
        
        System.out.print("Average: " + avg);
    }
}
