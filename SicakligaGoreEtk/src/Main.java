import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
			int heat;
			Scanner input= new Scanner(System.in);
			System.out.println("Sýcaklýk Deðerini Giriniz: ");
			heat= input.nextInt();
			
			if (heat<5) {
				System.out.println("Kayak Yapabilirsin!");
				}
			else if(heat>=5 && heat<=10){
				System.out.println("Bu havada sinemaya gidilir!");
				}
			else if (heat>=15 && heat<=25) {
				System.out.println("Bu havada pikniðe gidilir!");
				}
			else if (heat>=25){
				System.out.println("Bu havada yüzmeye gidilir!");
				}
			else {
				System.out.println("Sinema veya pikniðe gidebilirsin!");
			}
			}
	}