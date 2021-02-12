package demo.v1d;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }
    public Zwembad()    {

    }

    public double getBreedte() {return breedte;   }
    public void setBreedte(double brdte)    { breedte = brdte; }
    public double getLengte()  {return lengte;    }
    public void setLengte(double lngte)    { lengte = lngte; }
    public double getDiepte()  {return diepte;    }
    public void setDiepte(double dpte)    { diepte = dpte; }

    public double inhoud() {
        return breedte * lengte * diepte;
    }

    public String toString()    {
        String s = "Dit zwembad is" + " " + breedte +  " " + "meter breed," +  " " + lengte + " " + "meter lang, en" + " " +  diepte + " " + "meter diep";
        return s;
    }

}
