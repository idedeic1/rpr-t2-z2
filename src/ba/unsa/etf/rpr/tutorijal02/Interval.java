
public class Interval {

    double pocetna_tacka;
    double krajnja_tacka;
    boolean da_li_pripada_pocetna;
    boolean da_li_pripada_krajnja;


    public Interval(double pocetna_tacka, double krajnja_tacka, boolean da_li_pripada_pocetna, boolean isDa_li_pripada_krajnja) {
        if(pocetna_tacka > krajnja_tacka) throw new IllegalArgumentException();
        this.pocetna_tacka = pocetna_tacka;
        this.krajnja_tacka = krajnja_tacka;
        this.da_li_pripada_pocetna = da_li_pripada_pocetna;
        this.da_li_pripada_krajnja = isDa_li_pripada_krajnja;
    }

    public Interval() {
        this.pocetna_tacka=0;
        this.krajnja_tacka=0;
        this.da_li_pripada_pocetna = false;
        this.da_li_pripada_krajnja = false;
    }

    boolean isNull(){
        if(pocetna_tacka == 0 && krajnja_tacka == 0) return true;
        else return false;
    }
    boolean isIn(double a){
        if(a >= pocetna_tacka && a <= krajnja_tacka) return true;
        else return false;
    }

    public Interval intersect(Interval int1){
        return int1;
    }

    public static Interval intersect(Interval int1, Interval int2){
        return int1;
    }
    public boolean equals(Interval int1, Interval int2){
        if(int1.krajnja_tacka == int2.krajnja_tacka && int1.pocetna_tacka == int2.pocetna_tacka) return true;
        else return false;
    }
    public String toString(Interval i){
        if(i.isNull() == true) return "()";
        String s= "[" + i.pocetna_tacka + "," + i.krajnja_tacka + ")";


        return s;
    }

}
