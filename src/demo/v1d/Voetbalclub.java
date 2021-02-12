package demo.v1d;

public class Voetbalclub {
    private String club;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String club) {
        this.club = club;
    }
    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }
    //public String toString()    {
        //String s = aantalGespeeld() + aantalGewonnen + aantalGelijk + aantalVerloren + aantalPunten();
        //return s;
   // }
}

