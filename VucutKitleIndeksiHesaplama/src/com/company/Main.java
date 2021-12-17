package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
	"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
	 */
        double boy,kilo,vki;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        kilo=input.nextDouble();
        vki=kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz:  "+vki);


    }
}
