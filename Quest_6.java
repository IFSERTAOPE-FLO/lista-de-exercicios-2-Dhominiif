import java.util.Scanner;

public class Quest_6 {

    public static void main(String[] args){

        String n, r; int num;
        Scanner l = new Scanner(System.in);

        do{

            System.out.printf("Qual o numero: ");
            num = l.nextInt();
            l.nextLine();

            n = Integer.toString(num);

            System.out.printf("Foram digitados "+n.length()+" números");
            System.out.println(" ");
            System.out.println(" ");

            System.out.println(" ");
            System.out.println("Quer contar a quantidade de digitos de outro numero (S/N): ");
            r = l.nextLine();
        
        }while("S".equals(r) || "s".equals(r));
    
        l.close();

    }

}
