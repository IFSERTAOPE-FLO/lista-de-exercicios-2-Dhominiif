import java.util.Scanner;

public class Quest_4 {

    public static void main(String[] args){

        String nome, r; int quant; double preco;
        Scanner l = new Scanner(System.in);
  
        do{
            System.out.println("Qual o nome do produto: ");
            nome = l.nextLine();
            System.out.println("Qual o valor do produto: ");
            preco = l.nextDouble();
            System.out.println("Qual a quantidade produto: ");
            quant = l.nextInt();
            l.nextLine();

            System.out.println(" ");
            System.out.println("Informações da compra");
            if(quant >= 11 && quant <= 20){

                preco = preco * quant;
                preco = preco-(preco*10)/100;

                System.out.println("Nome do produto: "+nome);
                System.out.println("A quantidade de produto: "+quant);
                System.out.println("Preco total: "+preco);

            }else if(quant >= 21 && quant <= 50){
                        
                preco = preco * quant;
                preco = preco-(preco*20)/100;

                System.out.println("Nome do produto: "+nome);
                System.out.println("A quantidade de produto: "+quant);
                System.out.println("Preco total: "+preco);

            }else if(quant > 50){
                    
                preco = preco * quant;
                preco = preco-(preco*25)/100;

                System.out.println("Nome do produto: "+nome);
                System.out.println("A quantidade de produto: "+quant);
                System.out.println("Preco total: "+preco);

            }else{

                preco = preco * quant;
                System.out.println("Nome do produto: "+nome);
                System.out.println("A quantidade de produto: "+quant);
                System.out.println("Preco total: "+preco);

            }
            System.out.println(" ");
            System.out.printf("Comprar mais: (S/N) ");
            r = l.nextLine();
            System.out.println(" ");

        }while("s".equals(r) || "S".equals(r));
        l.close();
    }
}