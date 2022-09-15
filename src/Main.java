import pont.Kor;
import pont.Pont;

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

    }
}