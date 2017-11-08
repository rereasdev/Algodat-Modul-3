
package InfixtoPostfix;

import java.util.Scanner;

public class DriverItP {
    public static void main(String[] args) {
        InfixToPostfix i = new InfixToPostfix();
        Scanner scan = new Scanner(System.in);
        String isi;
        System.out.println("Masukkan Infix!");
        isi = scan.nextLine();
        i.postfix(isi);
    }
    
    
}
