import java.util.Scanner;
public class Main_1330 {//두 수 비교하기
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
	
        
		if(a>b) System.out.println(">");
		else if(a<b) System.out.println("<");
		else System.out.println("==");
 
	}
 
}