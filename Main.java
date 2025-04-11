import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String Product;
        Double price;
        Double Quantity;
        System.out.print("<<--What you want ?-->>");
        Product = sc.nextLine();
        System.out.print("Price= $");
        price = sc.nextDouble();
        System.out.print("Quantity= ");
        Quantity = sc.nextDouble();


        Double Your_Total = price*Quantity;

        System.out.println("You Ordered "+Quantity+" "+Product+", Your Total cost is $"+Your_Total);
    }
}