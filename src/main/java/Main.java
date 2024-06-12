import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Podaj liczbę:  ");
    int n = input.nextInt();
    int Silnia = 1;
    for(int i = 1; i <= n; i++){
        Silnia *= i;
      }
    System.out.println("Silnia z liczby(inercyjnie) "+ n + " wynosi: " + Silnia);
  //  System.out.println("Silnia z liczby(rekurencyjnie) "+ n + " wynosi: " + SilniaRek(n));
      }

 // public int rekurencja(int n){
  //  int rekurencja = 1;
  //  if(n == 0){
   //   return 1;
   // }
  //  else{
   //   return (n * rekurencja(n - 1));
  //  }
 // }

}