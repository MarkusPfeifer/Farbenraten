package at.pfeifer.farbenspiel;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> colors = new ArrayList<>();
    ArrayList<Button> buttons = new ArrayList<>();

    private Button buttonVorgabe;

    private TextView Versuche;
    private TextView Treffer;

    private  Random rnd = new Random();

    private int counterVers = 0;
    private int counterTref = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonVorgabe = ((Button) findViewById(R.id.buttonVorgabe));
        buttons.add((Button) findViewById(R.id.button1));
        buttons.add((Button) findViewById(R.id.button2));
        buttons.add((Button) findViewById(R.id.button3));
        buttons.add((Button) findViewById(R.id.button4));
        buttons.add((Button) findViewById(R.id.button5));
        buttons.add((Button) findViewById(R.id.button6));
        buttons.add((Button) findViewById(R.id.button7));
        buttons.add((Button) findViewById(R.id.button8));
        buttons.add((Button) findViewById(R.id.button9));
        buttons.add((Button) findViewById(R.id.button10));
        buttons.add((Button) findViewById(R.id.button11));
        buttons.add((Button) findViewById(R.id.button12));
        buttons.add((Button) findViewById(R.id.button13));
        buttons.add((Button) findViewById(R.id.button14));
        buttons.add((Button) findViewById(R.id.button15));
        buttons.add((Button) findViewById(R.id.button16));
        buttons.add((Button) findViewById(R.id.button17));
        buttons.add((Button) findViewById(R.id.button18));
        buttons.add((Button) findViewById(R.id.button19));
        buttons.add((Button) findViewById(R.id.button20));
        buttons.add((Button) findViewById(R.id.button21));
        buttons.add((Button) findViewById(R.id.button22));
        buttons.add((Button) findViewById(R.id.button23));
        buttons.add((Button) findViewById(R.id.button24));
        buttons.add((Button) findViewById(R.id.button25));
        buttons.add((Button) findViewById(R.id.button26));
        buttons.add((Button) findViewById(R.id.button27));
        buttons.add((Button) findViewById(R.id.button28));

        Versuche = (TextView) findViewById(R.id.textViewVersuche);
        Treffer = (TextView) findViewById(R.id.textViewTreffer);

        int rndNumber = rnd.nextInt(buttons.size());

        for(int i = 0; i < buttons.size(); i++){

            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

            colors.add(color);

            buttons.get(i).setBackgroundColor(colors.get(i));
        }

        buttonVorgabe.setBackgroundColor(colors.get(rndNumber));

    }

    public void onClick(View v){

        counterVers++;

        Versuche.setText("Versuche: " + counterVers);

        Button buttonGedrückt = (Button) v;

        Drawable buttonBackgroundVorgabe = buttonVorgabe.getBackground();
        Drawable buttonBackground = buttonGedrückt.getBackground();

        ColorDrawable buttonColorVorgabe = (ColorDrawable) buttonVorgabe.getBackground();
        ColorDrawable buttonColor = (ColorDrawable) buttonGedrückt.getBackground();

        int colorIDVorgabe = buttonColorVorgabe.getColor();
        int colorID = buttonColor.getColor();


        if(colorIDVorgabe == colorID){

            counterTref++;

            Treffer.setText("Treffer: " + counterTref);

            int rndNumber = rnd.nextInt(buttons.size());

            colors.clear();

            for(int i = 0; i <buttons.size(); i++){

                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

                colors.add(color);

                buttons.get(i).setBackgroundColor(colors.get(i));
            }

            buttonVorgabe.setBackgroundColor(colors.get(rndNumber));

        }
        else{

            int rndNumber = rnd.nextInt(buttons.size());

            colors.clear();

            for(int i = 0; i < buttons.size(); i++){

                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

                colors.add(color);

                buttons.get(i).setBackgroundColor(colors.get(i));
            }

            buttonVorgabe.setBackgroundColor(colors.get(rndNumber));
        }
    }
}
