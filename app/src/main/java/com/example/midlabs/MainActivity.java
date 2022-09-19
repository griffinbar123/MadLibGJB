package com.example.midlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String ANNOYING_NOISE = "com.example.MyApplication.ANNOYINGNOISE";
    public static final String RELAXING_ACTIVITY = "com.example.MyApplication.RELAXINGACTIVITY";
    public static final String MALE_NAME = "com.example.MyApplication.MALENAME";
    public static final String GOAL = "com.example.MyApplication.GOAL";
    public static final String ACTIVITY = "com.example.MyApplication.ACTIVITY";
    public static final String DISTANCE = "com.example.MyApplication.DISTANCCE";
    public static final String UNITS_OF_DISTANCE = "com.example.MyApplication.UNITSOFDISTANCE";
    public static final String NUMBER_OF_MINUTES = "com.example.MyApplication.NUMBEROFMINUTES";
    public static final String OCCUPATION = "com.example.MyApplication.OCCUPAITON";
    public static final String NUMBER_OF_TIME = "com.example.MyApplication.NUMBEROFTIME";
    public static final String UNIT_OF_TIME = "com.example.MyApplication.UNITOFTIME";
    public static final String COLLEGE_MAJOR = "com.example.MyApplication.COLLEGEMAJOR";
    public static final String VERB = "com.example.MyApplication.VERB";
    public static final String ROOM = "com.example.MyApplication.ROOM";

    public static final int time = 150;
    public String annoying_noise;
    public String male;
    public String relaxing_activity;
    public String goal;
    public String activity;
    public String distance;
    public String units_of_distance;
    public String number_of_minutes;
    public String occupation;
    public String number_of_time;
    public String unit_of_time;
    public String college_major;
    public String verb;
    public String room;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String animate_entry(int s1, int s2, int s3, int s4, int s5, int s6, boolean flag, boolean check) {
        TextView editText = findViewById(s2);
        Button but = findViewById(s3);
        TextView ti = findViewById(s1);


        ti.animate().alpha(0f).setDuration(time);
        but.animate().alpha(0f).setDuration(time);
        editText.animate().alpha(0f).setDuration(time);

        if (flag) {
            ti.setVisibility(View.GONE);
            but.setVisibility(View.GONE);
            editText.setVisibility(View.GONE);
        } else {
            ti.setVisibility(View.INVISIBLE);
            but.setVisibility(View.INVISIBLE);
            editText.setVisibility(View.INVISIBLE);
        }
        TextView Rti = findViewById(s4);
        TextView Ri = findViewById(s5);
        Button Rb = findViewById(s6);

        Rti.setAlpha(0f);
        Ri.setAlpha(0f);
        Rb.setAlpha(0f);

        Rti.setVisibility(View.VISIBLE);
        Ri.setVisibility(View.VISIBLE);
        Rb.setVisibility(View.VISIBLE);


        Rti.animate().alpha(1f).setDuration(time);
        Ri.animate().alpha(1f).setDuration(time);
        Rb.animate().alpha(1f).setDuration(time);
        if (check) {
            return editText.getText().toString().toLowerCase();
        }   return editText.getText().toString();
    }

    public String animate_entry(int s1, int s2, int s3){
        TextView editText = findViewById(s2);
        Button but = findViewById(s3);
        TextView ti = findViewById(s1);

        ti.animate().alpha(0f).setDuration(time);
        but.animate().alpha(0f).setDuration(time);
        editText.animate().alpha(0f).setDuration(time);
        return editText.getText().toString();
    }


    public void getAnnoyingNoise(View view){
        annoying_noise = animate_entry(R.id.annoying_title, R.id.annoying_text , R.id.annoying_button, R.id.annoying_title, R.id.male, R.id.malebutton, false, true)+",";
    }

    public void getName(View view) {
        male = animate_entry(R.id.annoying_title, R.id.male , R.id.malebutton, R.id.Relaxing, R.id.RelaxingInput, R.id.RelaxingButton, true, true);
    }

    public void getRelaxingActivity(View view) {
        relaxing_activity = animate_entry(R.id.Relaxing, R.id.RelaxingInput , R.id.RelaxingButton, R.id.room_title, R.id.room_input, R.id.room_button, true, true);
    }

    public void getRoom(View view) {
        room = animate_entry(R.id.room_title, R.id.room_input, R.id.room_button, R.id.goal_title, R.id.goal_input , R.id.goal_button, true, true);
    }

    public void getGoal(View view) {
        goal = animate_entry(R.id.goal_title, R.id.goal_input , R.id.goal_button, R.id.verb_title, R.id.activity_input, R.id.activity_button, true, true);
    }

    public void getActivity(View view) {
        activity = animate_entry(R.id.verb_title, R.id.activity_input, R.id.activity_button, R.id.distance_title, R.id.distance_input, R.id.distance_button, true, true);
    }

    public void getDistance(View view) {
        distance = animate_entry(R.id.distance_title, R.id.distance_input, R.id.distance_button, R.id.uod_title, R.id.uod_input, R.id.uod_button, true, false);
    }

    public void getUnitsOfDistance(View view) {
        units_of_distance = animate_entry(R.id.uod_title, R.id.uod_input, R.id.uod_button, R.id.occupation_title, R.id.nom_input, R.id.nom_button, true, true)+".\"";
    }

    public void getNumberOfMinutes(View view) {
        number_of_minutes = animate_entry(R.id.occupation_title, R.id.nom_input, R.id.nom_button, R.id.uot_title, R.id.occupation_input, R.id.occupation_button, true, true);
    }

    public void getOccupation(View view) {
        occupation = animate_entry(R.id.uot_title, R.id.occupation_input, R.id.occupation_button, R.id.major_title, R.id.not_input, R.id.not_button, true, true);
    }

    public void getNumberOfTime(View view) {
        number_of_time = animate_entry(R.id.major_title, R.id.not_input, R.id.not_button, R.id.verbs_title, R.id.uot_input, R.id.uot_button, true, true)+"!";
    }

    public void getUnitOfTime(View view) {
        unit_of_time = animate_entry(R.id.verbs_title, R.id.uot_input, R.id.uot_button, R.id.uot_title, R.id.verb_input, R.id.verb_button, true, true);
    }
    public void getVerb(View view){
        verb = animate_entry(R.id.uot_title, R.id.verb_input, R.id.verb_button, R.id.uod_title, R.id.major_input, R.id.major_button, true,true);
    }

    public void getCollegeMajor(View view) {
        college_major = animate_entry(R.id.uod_title, R.id.major_input, R.id.major_button)+"!";
        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra(ANNOYING_NOISE, annoying_noise);
        intent.putExtra(RELAXING_ACTIVITY, relaxing_activity);
        intent.putExtra(MALE_NAME, male);
        intent.putExtra(GOAL, goal);
        intent.putExtra(ACTIVITY, activity);
        intent.putExtra(DISTANCE, distance);
        intent.putExtra(UNITS_OF_DISTANCE, units_of_distance);
        intent.putExtra(NUMBER_OF_MINUTES, number_of_minutes);
        intent.putExtra(OCCUPATION, occupation);
        intent.putExtra(NUMBER_OF_TIME, number_of_time);
        intent.putExtra(UNIT_OF_TIME, unit_of_time);
        intent.putExtra(COLLEGE_MAJOR, college_major);
        intent.putExtra(VERB, verb);
        intent.putExtra(ROOM, room);
        startActivity(intent);


    }


}