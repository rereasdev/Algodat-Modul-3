
package Stack;

import java.util.Scanner;

public class DriverStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner scan = new Scanner(System.in);
        String t;
        int i = 0, p;
        while(i == 0){
            System.out.println("\nStackLinked List");
            System.out.println("Masukkan Pilihan");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus ");
            System.out.println("3. Lihat Tumpukan Teratas");
            System.out.println("4. Tampilkan isi");
            System.out.println("5. Keluar");
            System.out.print("Pilihan = ");
            try{
                p = scan.nextInt();
                switch(p){
                    case 1:
                        scan.nextLine();
                        System.out.println("Masukkan Huruf/ Angka");
                        t = scan.nextLine();
                        s.push(t);
                        System.out.println("\033[32m Data Telah d tambahkan ke tumpukan teratas");
                        break;
                    case 2:
                        s.pop();
                        System.out.println("\033[32m Data Teratas telah di hapus");
                        break;
                    
                    case 3:
                        System.out.print("Tumpukan Teratas adalah ");
                        System.out.println(s.peek());
                        break;
                    case 4:
                        System.out.println("Isi Stack");
                        System.out.println(s.toString());
                        break;
                    case 5:
                        i=1;
                        break;
                    default:
                        System.err.println("Masukkan angka 1 - 5");
                        break;
                }
            }
            catch(java.util.InputMismatchException e){
                System.err.println("Masukkan Angka");
                i = 1;
            }
        }
    }
}
