import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
//		System.out.println("2+3="+(2+3));
		int price;
		price=in.nextInt();
		System.out.println("100-"+price+"="+(100-price));
	}

}
