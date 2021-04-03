package JavaOdevler2;

import java.util.Scanner;

public class IkiCemberinBirbirineGoreDurumu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Birinci cemberin bilgileri kullanicidan aliniyor.
		System.out.println("Birinci cemberin merkezini(x, y) ve yaricapini giriniz... ");
		double birinciCemberMerkeziX0 = input.nextDouble();
		double birinciCemberMerkeziY0 = input.nextDouble();
		double birinciCemberYaricapi = input.nextDouble();
	
		//Ikinci cemberin bilgileri kullanicidan aliniyor.
		System.out.println("Ikinci cemberin merkezini(x, y) ve yaricapini giriniz... ");
		double ikinciCemberMerkeziX0 = input.nextDouble();
		double ikinciCemberMerkeziY0 = input.nextDouble();
		double ikinciCemberYaricapi = input.nextDouble();
		
		input.close();
		
		//Karar yapisi olusturabilmel icin bazi hesaplamalar yapiliyor.
		double merkezlerinArasindakiMesafe = Math.pow(Math.pow(birinciCemberMerkeziX0 - ikinciCemberMerkeziX0, 2) 
				+ Math.pow(birinciCemberMerkeziY0 - ikinciCemberMerkeziY0, 2), 0.5);
		double yaricaplarinFarki = Math.abs(birinciCemberYaricapi - ikinciCemberYaricapi);
		double yaricapToplamlari = birinciCemberYaricapi + ikinciCemberYaricapi;
		
		String durum = "oops, birseyler ters gitmis olmali..";
		
		//Durum analizi yapilir ve ekrana yazilir.
		if(merkezlerinArasindakiMesafe <= yaricaplarinFarki) {
			if(birinciCemberYaricapi > ikinciCemberYaricapi) {
				durum = "Birinci cember ikinci cemberi kapsamaktadir...";
			}else {
				if(birinciCemberYaricapi < ikinciCemberYaricapi) {
					durum = "Ikinci cember birinci cemberi kapsamaktadir...";
				}else {
					durum = "Cemberler birbirine tamamen esittir...";
				}
			}
		}else {
			if(merkezlerinArasindakiMesafe < yaricapToplamlari) {
				durum = "Cemberler kesismektedir...";
			}else {
				if(merkezlerinArasindakiMesafe == yaricapToplamlari) {
					durum = "Cemberler sadece bir noktada kesismekdedir...";
				}else {
					if(merkezlerinArasindakiMesafe > yaricapToplamlari) {
						durum = "Cemberler hicbir sekilde kesismemekdedir...";
					}
				}
			}
		}
		
		System.out.println(durum);
		
	}
}
