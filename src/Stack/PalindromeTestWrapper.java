
package Stack;

import java.util.Scanner;

public final class PalindromeTestWrapper {
    final String isMsg = " ADALAH sebuah Palindrome";
    final String isNotMsg = " BUKAN sebuah Palindrome";
    
    public static void main(String[] args) {
         new PalindromeTestWrapper();
    }
    
    public PalindromeTestWrapper(){
        String kata;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan kata!");
        kata = scan.nextLine().toLowerCase();
        if(isPalindrome(kata)){
            System.out.println(kata+isMsg);
        }
        else{
            System.out.println(kata+isNotMsg);
        }
    }
    
    public boolean isPalindrome(String kata){
        Stack s = new Stack();
        for(int i = 0; i < kata.length(); i++){
            s.push(kata.charAt(i));
        }
        String balik = "";
        while (!s.isEmpty()) {
            balik += s.pop();
        }
        return kata.equals(balik);
    }
}
