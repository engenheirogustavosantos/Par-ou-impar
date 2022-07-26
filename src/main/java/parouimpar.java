import java.util.Scanner;
public class parouimpar {

    public static void main(String[] args) {
        int num, poi;
        Scanner in = new Scanner (System.in);
        System.out.println("Digite aqui um numero: ");
        num = in.nextInt();
        poi = (num%2);
        if(poi == 0){
            System.out.println("O numero " + num + " e par");
        }
        else{
            System.out.println("O numero " + num + " e impar");
        }
    }
    
}
