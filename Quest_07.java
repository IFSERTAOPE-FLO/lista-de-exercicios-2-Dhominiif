import java.util.Scanner;

public class Quest_07 {

    public static void main(String[] args) {

        /*  O código errado é o "B"

            O erro era que com o "DO while" executa o codigo e depois verifica, assim o -1 era exibido. Para consertarmos 
            basta colocarmos um if dentro do "do while", com isso ele só imprimirá caso o codigo não seja -1. */

        Scanner teclado = new Scanner(System.in);
        int codigo;
 
        do {

            System.out.print("Informe o código: ");
            codigo = teclado.nextInt();
            
            if(codigo != -1){
                System.out.println("Código: " + codigo);
            }

        } while (codigo != -1);
        teclado.close();

    }

}
