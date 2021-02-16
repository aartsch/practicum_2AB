package demo.v1d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {


    // Eis.1
    @Test
    void clubNaamFC () {
        Voetbalclub ajx = new Voetbalclub("");

        assertSame("FC", ajx);
    }

    // Eis.2
    @Test
    void beinvloedenPuntenWin () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('w');

        assertEquals(3, feij.aantalPunten());
    }

    // Eis.2
    @Test
    void beinvloedenPuntenGelijk () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('g');

        assertEquals(1, feij.aantalPunten());
        assertEquals(1, feij.aantalGespeeld());
    }

    // Eis.2
    @Test
    void beinvloedenPuntenVerloren () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('v');

        assertEquals(0, feij.aantalPunten());
    }

    // Eis.2
    @Test
    void TotaalAantalGespeeld () {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('g');

        assertEquals(3, feij.aantalGespeeld());
    }

    // Eis.3
    @Test
    void toStringUitesten() {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('w');

        assertEquals("Feijenoord 4 1 1 2 4", feij.toString());
    }

    // Eis.4
    @Test
    void herhaaldelijkVerwerken() {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        feij.verwerkResultaat('e');
        feij.verwerkResultaat('9');

        assertEquals(8, feij.aantalGespeeld());
        assertEquals(12, feij.aantalPunten());
    }
}