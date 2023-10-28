package com.example.techcareerandroiddeveloperodev2.functions;

public class OdevFonksiyonlar {

    //1
    public double kilometreMil(int kilometre){
        double mil = kilometre * 0.621;
        System.out.println(mil);
        return mil;
    }

    //2
    public double dikdortgen(double kenar1,double kenar2){
        double alan = kenar1*kenar2;
        System.out.println(alan);
        return alan;
    }

    //3
    public double faktoriyel(double sayi){
        double sonuc = sayi;
        for(double i=sayi-1;i>0;i--){
            sonuc = sonuc * i;
        }
        System.out.println(sonuc);
        return sonuc;
    }

    //4
    public int eharfi(String kelime){
        int count = 0;
        char arrayed[] = kelime.toCharArray();
        for(int i=0;i<arrayed.length;i++){
            if(arrayed[i] == 'e'){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    //5
    public int icaci(int kenarsayisi){
        int toplam = ((kenarsayisi-2)*180)/kenarsayisi;
        System.out.println(toplam);
        return toplam;
    }

    public int maas(int gun){
        int toplam = 0;
        int saat = gun*8;
        if(saat>150){
            int mesai = saat-150;
            toplam = 150*40;
            toplam = toplam + mesai*80;
        }else if(saat<150){
            toplam = saat*40;
        }
        System.out.println(toplam);
        return toplam;
    }

    public int otopark(int saat){
        int toplam = 0;
        if(saat>1){
            toplam = 50+(saat-1)*10;
        }else if(saat == 1){
            toplam = 50;
        }
        System.out.println(toplam);
        return toplam;

    }


}
