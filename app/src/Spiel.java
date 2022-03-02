package de.rwth_aachen.informatik.schuelerlabor.schiffeversenken;

//  Dieser auskommentierte Teil muss in die onCreate-Methode der HauptActivity kopiert werden.
// Neuer Kommentar
/*
        // initialisere Spiel
        spiel = new Spiel();

        // übergebe alle Buttons für Spielfeldanzeige
        spiel.buttons[0][0] = (Button) findViewById(R.id.spiel00);
        spiel.buttons[0][1] = (Button) findViewById(R.id.spiel01);
        spiel.buttons[0][2] = (Button) findViewById(R.id.spiel02);
        spiel.buttons[0][3] = (Button) findViewById(R.id.spiel03);
        spiel.buttons[0][4] = (Button) findViewById(R.id.spiel04);
        spiel.buttons[0][5] = (Button) findViewById(R.id.spiel05);
        spiel.buttons[0][6] = (Button) findViewById(R.id.spiel06);
        spiel.buttons[0][7] = (Button) findViewById(R.id.spiel07);
        spiel.buttons[1][0] = (Button) findViewById(R.id.spiel10);
        spiel.buttons[1][1] = (Button) findViewById(R.id.spiel11);
        spiel.buttons[1][2] = (Button) findViewById(R.id.spiel12);
        spiel.buttons[1][3] = (Button) findViewById(R.id.spiel13);
        spiel.buttons[1][4] = (Button) findViewById(R.id.spiel14);
        spiel.buttons[1][5] = (Button) findViewById(R.id.spiel15);
        spiel.buttons[1][6] = (Button) findViewById(R.id.spiel16);
        spiel.buttons[1][7] = (Button) findViewById(R.id.spiel17);
        spiel.buttons[2][0] = (Button) findViewById(R.id.spiel20);
        spiel.buttons[2][1] = (Button) findViewById(R.id.spiel21);
        spiel.buttons[2][2] = (Button) findViewById(R.id.spiel22);
        spiel.buttons[2][3] = (Button) findViewById(R.id.spiel23);
        spiel.buttons[2][4] = (Button) findViewById(R.id.spiel24);
        spiel.buttons[2][5] = (Button) findViewById(R.id.spiel25);
        spiel.buttons[2][6] = (Button) findViewById(R.id.spiel26);
        spiel.buttons[2][7] = (Button) findViewById(R.id.spiel27);
        spiel.buttons[3][0] = (Button) findViewById(R.id.spiel30);
        spiel.buttons[3][1] = (Button) findViewById(R.id.spiel31);
        spiel.buttons[3][2] = (Button) findViewById(R.id.spiel32);
        spiel.buttons[3][3] = (Button) findViewById(R.id.spiel33);
        spiel.buttons[3][4] = (Button) findViewById(R.id.spiel34);
        spiel.buttons[3][5] = (Button) findViewById(R.id.spiel35);
        spiel.buttons[3][6] = (Button) findViewById(R.id.spiel36);
        spiel.buttons[3][7] = (Button) findViewById(R.id.spiel37);
        spiel.buttons[4][0] = (Button) findViewById(R.id.spiel40);
        spiel.buttons[4][1] = (Button) findViewById(R.id.spiel41);
        spiel.buttons[4][2] = (Button) findViewById(R.id.spiel42);
        spiel.buttons[4][3] = (Button) findViewById(R.id.spiel43);
        spiel.buttons[4][4] = (Button) findViewById(R.id.spiel44);
        spiel.buttons[4][5] = (Button) findViewById(R.id.spiel45);
        spiel.buttons[4][6] = (Button) findViewById(R.id.spiel46);
        spiel.buttons[4][7] = (Button) findViewById(R.id.spiel47);
        spiel.buttons[5][0] = (Button) findViewById(R.id.spiel50);
        spiel.buttons[5][1] = (Button) findViewById(R.id.spiel51);
        spiel.buttons[5][2] = (Button) findViewById(R.id.spiel52);
        spiel.buttons[5][3] = (Button) findViewById(R.id.spiel53);
        spiel.buttons[5][4] = (Button) findViewById(R.id.spiel54);
        spiel.buttons[5][5] = (Button) findViewById(R.id.spiel55);
        spiel.buttons[5][6] = (Button) findViewById(R.id.spiel56);
        spiel.buttons[5][7] = (Button) findViewById(R.id.spiel57);
        spiel.buttons[6][0] = (Button) findViewById(R.id.spiel60);
        spiel.buttons[6][1] = (Button) findViewById(R.id.spiel61);
        spiel.buttons[6][2] = (Button) findViewById(R.id.spiel62);
        spiel.buttons[6][3] = (Button) findViewById(R.id.spiel63);
        spiel.buttons[6][4] = (Button) findViewById(R.id.spiel64);
        spiel.buttons[6][5] = (Button) findViewById(R.id.spiel65);
        spiel.buttons[6][6] = (Button) findViewById(R.id.spiel66);
        spiel.buttons[6][7] = (Button) findViewById(R.id.spiel67);
        spiel.buttons[7][0] = (Button) findViewById(R.id.spiel70);
        spiel.buttons[7][1] = (Button) findViewById(R.id.spiel71);
        spiel.buttons[7][2] = (Button) findViewById(R.id.spiel72);
        spiel.buttons[7][3] = (Button) findViewById(R.id.spiel73);
        spiel.buttons[7][4] = (Button) findViewById(R.id.spiel74);
        spiel.buttons[7][5] = (Button) findViewById(R.id.spiel75);
        spiel.buttons[7][6] = (Button) findViewById(R.id.spiel76);
        spiel.buttons[7][7] = (Button) findViewById(R.id.spiel77);

        // erstelle alle Listener
        initializeListeners();

*/

// Dieser Teil wird an das Ende eurer HauptActivity kopiert. Achtet auf die Klammerung.

/*
    // erstellt Listener für jeden Knopf, der Funktion buttonGedrueckt mit richtigen Koordinaten aufruft.

    public void initializeListeners() {
        for(int x=0; x<spiel.FELDGROESSE; x++){
            for(int y=0; y<spiel.FELDGROESSE; y++){
                final int a=x;
                final int b=y;
                spiel.buttons[x][y].setOnClickListener( new View.OnClickListener(){
                    public void onClick(View v){
                        buttonGedrueckt(a, b);
                    }
                });
            }
        }
    }

    // wird aufgerufen, wenn ein Knopf gedrückt wurde
    public void buttonGedrueckt(int x, int y) {

    }
    */


import android.graphics.Color;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

import javax.security.auth.login.LoginException;

/**
 *
 * Diese Klasse implementiert die Spiellogik.
 *
 * Der Spielablauf soll in der HauptActivity implementiert werden.
 *
 * Created by InfoSphere on 30.08.2017.
 */

public class Spiel {

    // Parameter
    public final int WASSER = 0;
    public final int SCHIFF = 1;
    public final int WASSERTREFFER = 2;
    public final int SCHIFFTREFFER = 3;
    public final int COMPUTER = 1;
    public final int MENSCH = 0;
    public final int FELDGROESSE = 8;


    /* speichert die Spielfelder beider Spieler
     *
     * feld[x][y][spieler]
     */
    private int[][][] feld;

    // alle 64 Knöpfe der App müssen in diesem Array hinterlegt werden
    protected Button[][] buttons = new Button[FELDGROESSE][FELDGROESSE];

    // Zufallsgenerator für Schiffplatzierung und KI
    private Random random;

    // Speichert alle Ziele für die KI
    private int[][] ziele;
    private int zielIterator;

    /*
     * Standardkonstruktor
     *
     * Füllt das Spielfeld-Array und platziert Schiffe.
     */
    public Spiel() {

        // Zufallsgenerator initialisieren
        random = new Random();

        // Arraygröße für Spielfeld festlegen
        feld = new int[FELDGROESSE][FELDGROESSE][2];

        // für jeden Spieler
        for (int spieler = 0; spieler < 2; spieler++) {
            // für jedes Spielfeld
            for (int x = 0; x < FELDGROESSE; x++) {
                for (int y = 0; y < FELDGROESSE; y++) {
                    // setze als Wasserfeld
                    feld[x][y][spieler] = WASSER;
                }
            }
        }

        // für jeden Spieler
        for (int spieler = 0; spieler < 2; spieler++) {
            /*
             *  Platziere 1 Schiff der Länge 4
             *  Platziere 2 Schiffe der Länge 3
             *  Platziere 3 Schiffe der Länge 2
             */
            for (int laenge = 4; laenge > 1; laenge--) {
                for (int anzahl = 1; anzahl <= 5 - laenge; anzahl++) {
                    platziereSchiff(laenge, spieler);
                }
            }

        }

        // initialisiere die Ziele für die KI
        initializeTargets();

    }

    // ******************************** getter & setter ********************************


    /*
     *  Gibt ein einzelnes Feld zurück
     *
     *  @return:
     *  -1: Fehler
     *  sonst: siehe Parameter
     *
     */
    public int getFeld(int x, int y, int spieler) {
        // Wenn nicht OutOfBounds, gebe Feldzustand zurück
        if ((x >= 0) && (x < feld.length))
            if ((y >= 0) && (y < feld[x].length))
                if ((spieler >= 0) && (spieler < feld[x][y].length))
                    return feld[x][y][spieler];

        // sonst, gebe Fehlerwert zurück
        return -1;
    }

    public Button getButton(int x, int y) {

        if (x >= 0 && x < buttons.length)
            if (y >= 0 && y < buttons[x].length)
                return buttons[x][y];

        return null;
    }

    /*
     *  Setzt ein einzelnes Feld
     *
     *  wert entspricht den Parametern.
     *
     */
    public void setFeld(int x, int y, int spieler, int wert) {
        // Wenn nicht OutOfBounds, gebe Feldzustand zurück
        if ((x >= 0) && (x < feld.length))
            if ((y >=0) && (y < feld[x].length))
                if ((spieler >=0) && (spieler < feld[x][y].length))
                    if ((wert >= 0) && (wert < 4))
                        feld[x][y][spieler] = wert;

    }

    // ******************************** public functions ********************************

    /*
     *  überprüft ob ein Spieler gewonnen hat
     *
     *  Wenn das Spielfeld des Gegners noch mindestens 1 Schifffeld hat, hat der Spieler noch nicht
     *  gewonnen.
     */
    public boolean hatGewonnen(int spieler) {

        boolean gewonnen = true;
        int gegner = gegner(spieler);

        // für jedes Spielfeld
        for (int x = 0; x < FELDGROESSE; x++) {
            for (int y = 0; y < FELDGROESSE; y++) {
                // Wenn es ein Schifffeld ist, hat der Spieler nicht gewonnen
                if (getFeld(x,y,gegner) == SCHIFF) {
                    gewonnen = false;
                    break;
                }
            }
            // wenn bereits ein Schifffeld gefunden wurde, breche Suche ab
            if (!gewonnen) break;
        }
        return gewonnen;
    }


    // Schieße auf das übergebene Feld und gebe zurück ob getroffen wurde
    public boolean spielerSchiesst(int x, int y) {

        // Führe einen Schuss als Mensch aus und übernehme Rückgabewert
        return schuss(x,y,MENSCH);
    }

    // Lasse Computer auf ein Feld schießen und gebe zurück ob getroffen wurde
    public boolean computerSchiesst() {
        // Bestimme zufällige Koordinate
        int x = ziele[zielIterator][0];
        int y = ziele[zielIterator][1];

        zielIterator++;

        // Führe einen Schuss als Computer aus und übernheme Rückgabewert
        return schuss(x,y,COMPUTER);
    }
    
    // ******************************** private functions ********************************
    
    // Schießt auf ein Spielfeld und gibt zurück, ob Schuss erfolgreich war
    private boolean schuss(int x,int y, int spieler) {
        // bestimme Gegner des Spielers
        int gegner = gegner(spieler);

        boolean treffer = false;

        // Wenn Schiff, setze einen Schifftreffer und speichere, dass getroffen
        if(feld[x][y][gegner] == SCHIFF) {
            feld[x][y][gegner] = SCHIFFTREFFER;
            treffer = true;
        }

        // Wenn Wasser, setze einen Wassertreffer
        if(feld[x][y][gegner] == WASSER) {
            feld[x][y][gegner] = WASSERTREFFER;
        }

        // sonst behalte alten Wert

        // gebe zurück, ob getroffen wurde
        return treffer;
    }
    
    // Hilfsfunktion, um den Gegner eines Spielers zu bestimmen
    private int gegner(int spieler) {
        return (spieler+1)%2;
    }

    /*
      *  Platziert ein Schiff an einer zufälligen Position in zufälliger Richtung
      *
      *  @return: Gibt zurück, ob das Schiff erfolgreich platziert wurde
      */
    private boolean platziereSchiff(int laenge,int spieler) {

        boolean schiffGesetzt = false;

        // Für maximal 5000 Versuche
        for (int i = 0; i < 5000; i++){
            // Wenn noch nicht gesetzt, versuche ein Schiff zu setzen
            if (!schiffGesetzt) {

                // zufällige Ausrichtung bestimmen
                int horizontal = random.nextInt(2);
                int vertical = (horizontal+1)%2;

                int x;
                int y;

                // zufällige Position bestimmen
                if (horizontal == 1) {
                    x = random.nextInt(FELDGROESSE-laenge);
                    y = random.nextInt(FELDGROESSE);
                } else {
                    x = random.nextInt(FELDGROESSE);
                    y = random.nextInt(FELDGROESSE-laenge);
                }

                boolean blockiert = false;

                // überprüfe, ob andere Schiffe im Weg sind

                // Für die jedes Feld bis zur Länge des Schiffs
                for (int j = 0; j < laenge; j ++) {
                    /*
                     * überprüfe ob es kein Wasserfeld ist
                     *
                     * da horizontal/vertikal auf 1 und 0 gesetzt werden, berechnet
                     * x+horizontal*j bzw. y+vertical*j die j-te Position des Schiffs
                     */
                    if (getFeld(x+horizontal*j, y+vertical*j,spieler) != WASSER) {
                        blockiert = true;
                    }
                }

                // wenn kein Feld blockiert ist
                if (!blockiert) {
                    // für jedes Feld bis zur Länge des Schiffs
                    for (int j = 0; j < laenge; j ++) {
                        /*
                         * setze ein Schifffeld
                         *
                         * da horizontal/vertikal auf 1 und 0 gesetzt werden, berechnet
                         * x+horizontal*j bzw. y+vertical*j die j-te Position des Schiffs
                         */
                        feld[x+horizontal*j][y+vertical*j][spieler] = SCHIFF;
                    }

                    schiffGesetzt = true;
                }
                // Wenn erfolgreich gesetzt wurde, breche for-Schleife ab.
            } else break;

        }

        // gebe zurück, ob erfolgreich
        return schiffGesetzt;
    }

    // Erstellt eine zufällige Reihenfolge von Zielen für die Computerschüsse
    private void initializeTargets(){

        // Setze Zieliterator zurück
        zielIterator = 0;

        // Erstelle ein Array für alle möglichen Ziele
        ziele = new int[FELDGROESSE*FELDGROESSE][2];

        //Schreibe alle Koordinaten in das Array
        for (int x = 0; x < FELDGROESSE; x++) {
            for (int y = 0; y < FELDGROESSE; y++) {
                ziele[x*FELDGROESSE + y][0]=x;
                ziele[x*FELDGROESSE + y][1]=y;
            }
        }

        // Mische die Ziele
        shuffleArray(ziele);
    }


    // Mischt ein Array
    private void shuffleArray(int[][] a) {
        int n = a.length;

        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }

    // Vertauscht zwei Arrayelemente
    private void swap(int[][] a, int i, int change) {
        int[] helper = {a[i][0],a[i][1]};
        a[i][0] = a[change][0];
        a[i][1] = a[change][1];
        a[change][0] = helper[0];
        a[change][1] = helper[1];
    }
}


