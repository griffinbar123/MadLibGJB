package com.example.midlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        Intent intent = getIntent();

        String adverb1 = intent.getStringExtra(MainActivity.ANNOYING_NOISE);
        String adverb2 = intent.getStringExtra(MainActivity.MALE_NAME);
        String type_of_bird = intent.getStringExtra(MainActivity.RELAXING_ACTIVITY);
        String ing_2 = intent.getStringExtra(MainActivity.VERB);
        String past_tense = intent.getStringExtra(MainActivity.GOAL);
        String room = intent.getStringExtra(MainActivity.ROOM);
        String verb = intent.getStringExtra(MainActivity.ACTIVITY);
        String rel_name = intent.getStringExtra(MainActivity.DISTANCE);
        String noun1 = intent.getStringExtra(MainActivity.UNITS_OF_DISTANCE);
        String liquid = intent.getStringExtra(MainActivity.NUMBER_OF_MINUTES);
        String ing_1 = intent.getStringExtra(MainActivity.OCCUPATION);
        String pob = intent.getStringExtra(MainActivity.NUMBER_OF_TIME);
        String pn = intent.getStringExtra(MainActivity.UNIT_OF_TIME);
        String noun2 = intent.getStringExtra(MainActivity.COLLEGE_MAJOR);


        TextView adverb1_view = findViewById(R.id.annoying_final);
        TextView adverb2_view = findViewById(R.id.adverb2_final);
        TextView top_view = findViewById(R.id.top_final);
        TextView room_view = findViewById(R.id.room_final);
        TextView pt_view = findViewById(R.id.pt_final);
        TextView verb_view = findViewById(R.id.verb_final);
        TextView relative_view = findViewById(R.id.relative_final);
        TextView noun1_view = findViewById(R.id.noun1_final);
        TextView liquid_view = findViewById(R.id.liquid_final);
        TextView ing1_view = findViewById(R.id.ing1_final);
        TextView pob_view = findViewById(R.id.pon_final);
        TextView pn_view = findViewById(R.id.pn_final);
        TextView ing2_view = findViewById(R.id.ing2_final);
        TextView noun2_view = findViewById(R.id.noun2_final);


        adverb1_view.setText(adverb1);
        adverb2_view.setText(adverb2);
        top_view.setText(type_of_bird);
        room_view.setText(room);
        pt_view.setText(past_tense);
        verb_view.setText(verb);
        relative_view.setText(rel_name);
        noun1_view.setText(noun1);
        liquid_view.setText(liquid);
        ing1_view.setText(ing_1);
        pob_view.setText(pob);
        pn_view.setText(pn);
        ing2_view.setText(ing_2);
        noun2_view.setText(noun2);

    }


}