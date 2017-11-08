
package Queue;

import java.util.Scanner;

public class DriverQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner scan = new Scanner(System.in);
        String t;
        int i = 0, p;
        while(i == 0){
            System.out.println("\nStackLinked List");
            System.out.println("Masukkan Pilihan");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus ");
            System.out.println("3. Lihat Antrian pertama");
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
                        q.push(t);
                        System.out.println("\033[32m Data Telah d tambahkan ke Antrian");
                        break;
                    case 2:
                        q.pop();
                        System.out.println("\033[32m Data Antrian telah di hapus");
                        break;
                    
                    case 3:
                        System.out.print("Antrian Pertama adalah ");
                        System.out.println(q.peek());
                        break;
                    case 4:
                        System.out.println("Isi Stack");
                        System.out.println(q.toString());
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
