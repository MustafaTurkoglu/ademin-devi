/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ademin.ödevi;

/**
 *
 * @author mustafa
 */
public class AdeminÖdevi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dizi = new int[127];
        char en_kucuk_degerli_eleman = 127;
        char[] cumle = "hhbhbh ghgdfu.".toCharArray();
        //coktan_aza(dizi);
        for (int i = 0; i < cumle.length; i++) {
            dizi[cumle[i]]++;
            //if (dizi[i]<en_kucuk_degerli_eleman) {
            //  en_kucuk_degerli_eleman=cumle[i];
            //}

        }
        //coktan_aza(dizi);
        //char en_buyuk = 0;
        //int en_cok_char_adedi = 0;
        int en_cok_adet = 0;
        for (char i = 0; i < dizi.length; i++) {

            if (dizi[i] > en_cok_adet) {
                en_cok_adet = dizi[i];
            }

            if (dizi[i] != 0 && i != ' ') {

                System.out.print(i);
                System.out.println(dizi[i]);

                //System.out.println(j);
            }//System.out.println(i);
        }
        coktan_aza(dizi, en_cok_adet);

    }

    static void coktan_aza(int[] dizi, int en_cok_adet) {
        int y=0;
        //boolean karar =en_cok_adet == dizi[j];
        while (en_cok_adet > 0) {
            for (char j = 0; j < dizi.length; j++) {
                if (en_cok_adet == dizi[j]) {
                    System.out.print(j);
y=1;
                }

            }
            if (y==1) {
                System.out.print(' ');
                y=0;
            }
//System.out.print(' ');
            en_cok_adet--;

        }

    }
}
