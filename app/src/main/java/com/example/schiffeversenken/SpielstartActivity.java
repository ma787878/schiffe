package com.example.schiffeversenken;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpielstartActivity extends AppCompatActivity {
    int spielzustand=0;
    Spiel spiel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spielstart);
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
    }
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
        if(spielzustand==1) {
            spiel.spielerSchiesst(x, y);
            zeichneSpielfeld(spiel.COMPUTER);
            spielzustand = 2;
        }
    }
    public void weiter(View view) {
        if(spielzustand==0){
            zeichneSpielfeld(spiel.COMPUTER);
            spielzustand=1;
        }
        if(spielzustand==2){
            zeichneSpielfeld(spiel.MENSCH);
            spiel.computerSchiesst();
            zeichneSpielfeld(spiel.MENSCH);
            spielzustand=0;
        }
    }

    public void zeichneSpielfeld (int spieler){
        for (int x=0; x<8; x++){
            for (int y=0; y<8; y++){
             int z= spiel.getFeld(x,y,spieler);
             Button button=spiel.buttons[x][y];
                if(z==spiel.WASSER){
                 button.setBackgroundColor(Color.BLUE);
                }
                if(z==spiel.SCHIFF){
                 button.setBackgroundColor(Color.BLACK);
                }
                if(z==spiel.WASSERTREFFER){
                 button.setBackgroundColor(Color.LTGRAY);
                }
                if(z==spiel.SCHIFFTREFFER){
                 button.setBackgroundColor(Color.DKGRAY);
                }

            }
        }
    }


}
