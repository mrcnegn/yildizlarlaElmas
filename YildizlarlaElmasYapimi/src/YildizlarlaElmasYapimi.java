import java.util.Scanner;
public class YildizlarlaElmasYapimi {
	
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);	
			
			System.out.println("say? giriniz: ");
			int a=input.nextInt();
			
			for(int i=1;i<=a;i++) {
				for(int k=1;k<=(a-i);k++) {
				System.out.print(" ");
			}
				for(int j=1;j<=(2*i)-1;j++) {
					System.out.print("*");
				}
				 System.out.println();
		}
			for(int i=1;i<a;i++) {
				for(int k=1;k<=(a-i);k++) {
					System.out.print("n");
				}
			}
			
	}

}
