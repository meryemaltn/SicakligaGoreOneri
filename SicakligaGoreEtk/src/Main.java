import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
			int heat;
			Scanner input= new Scanner(System.in);
			System.out.println("S�cakl�k De�erini Giriniz: ");
			heat= input.nextInt();
			
			if (heat<5) {
				System.out.println("Kayak Yapabilirsin!");
				}
			else if(heat>=5 && heat<=10){
				System.out.println("Bu havada sinemaya gidilir!");
				}
			else if (heat>=15 && heat<=25) {
				System.out.println("Bu havada pikni�e gidilir!");
				}
			else if (heat>=25){
				System.out.println("Bu havada y�zmeye gidilir!");
				}
			else {
				System.out.println("Sinema veya pikni�e gidebilirsin!");
			}
			}
	}