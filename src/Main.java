import pont.Kor;
import pont.Pont;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        /*Pont p1 = new Pont();
        Pont p2 = new Pont(0, 0);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);

        System.out.println(p4);

        Pont[] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(10);
        }
        for (Pont p: pontok){
            System.out.println(p);
        }


        int furthestIndex = 0;
        for (int i = 0; i < pontok.length; i++) {

            if(pontok[furthestIndex] . getOrigoDistance() < pontok[i].getOrigoDistance()){
                furthestIndex = i;
            }

        }
        System.out.println(pontok[furthestIndex].getOrigoDistance());

        System.out.printf("Az egyik pont: %s a másik pont: %s a kettő távolsága: %.3f \n", p3, p4, p3.length(p4));

        System.out.printf("Ez a pont a " + p4.siknegyed() + " síknegyedben van");*/

        Kor k1 = new Kor(5, 3, 5);
        Kor k2 = new Kor(5);
        Kor k3 = new Kor((Math.random()*100)+ 1);

        System.out.println(k3);

        System.out.printf("Ennek a körnek a kerülete: %f \n", k3.kerulet());

        System.out.printf("Ennek a körnek a területe: %f \n", k3.terulet());

        Scanner sc = new Scanner(in);
        System.out.println("Adjon meg egy számot:");
        int szam = Integer.parseInt(sc.nextLine());
        k3.setSugar(szam);
        System.out.printf("Az új kör mérete: %d", szam);

        System.out.printf("A kör adatai: %s", k3.toString());

        double legnagyobb = 0;
        Kor[] korok = new Kor[10];
        for (int i = 0; i < korok.length; i++) {
            korok[i] = new Kor((Math.random()*100)+ 1);
        }
        for (Kor p: korok){
            System.out.println(p);
        }

        for (int i = 0; i < korok.length; i++) {
            if (korok[i].terulet() > legnagyobb){
                legnagyobb = korok[i].terulet();
            }
        }

        System.out.printf("A legnagyobb terület: %f ", legnagyobb );

    }
}