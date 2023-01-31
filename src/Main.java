import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double fiyat,sonuc;
		try (Scanner giris = new Scanner(System.in)) {
			System.out.print("Lütfen KDV sini hesaplamak istediğiniz fiyatı yazınız = ");
			fiyat=giris.nextDouble();
			if(fiyat<0) {
				System.out.println("Fiyat 0'dan küçük olamaz");
			}
				else if(fiyat>=0 && fiyat<=1000) {
					sonuc=fiyat+((fiyat*18)/100);
					System.out.println("KDV'li fiyat = "+sonuc);
				}
				else if(fiyat>1000) {
					sonuc=fiyat+((fiyat*8)/100);
					System.out.println("KDV'li fiyat = "+sonuc);
				}
			}
				
	}
}


