import java.util.Scanner;

public class Quest_16_1 {
    
    public static void main(String[] args){

        String resp;
        Scanner l = new Scanner(System.in);
        Quest_16_0 n1 = new Quest_16_0();
        do{
            System.out.printf("\n\nDiga os segundo: ");
            n1.settempo(l.nextLong());
            l.nextLine();
            n1.status();
            System.out.printf(" ");
            System.out.printf("\n\nConverte mais segundo: (S/N) ");
            resp = l.nextLine();

        }while("s".equals(resp) || "s".equals(resp));
        l.close();


    }

}
