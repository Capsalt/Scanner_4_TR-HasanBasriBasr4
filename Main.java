import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
		
		//System.out.println("ne kadar çay?");
		
		int cay = scan.nextInt();
		
		//System.out.println("kaç şeker");
		
		int seker = scan.nextInt();
		
		double son = cay * seker * 0.017 * 365;
		
		System.out.println("Yilda " + son + " kg şeker kulanıyor." );

  }
}