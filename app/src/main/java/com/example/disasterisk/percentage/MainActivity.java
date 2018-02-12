package com.example.disasterisk.percentage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private SeekBar percentSeek;
    private TextView percentDisplay;
    private EditText numberEntry;
    private TextView calcDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        percentSeek = findViewById(R.id.percentSeek);
        percentDisplay = findViewById(R.id.percentDisplay);
        numberEntry = findViewById(R.id.numberEntry);
        calcDisplay = findViewById(R.id.calcDisplay);

        percentSeek.setMax(98);
        percentSeek.setProgress(9);
        percentSeek.setOnSeekBarChangeListener(this);
    }
    public void  onStartTrackingTouch(SeekBar percentSeek){}
    public void onProgressChanged(SeekBar percentSeek, int progress, boolean fromUser) {
        int percent = progress + 1;
        percentDisplay.setText(percent);
    }
    public void onStopTrackingTouch(SeekBar percentSeek) {
        int progress = percentSeek.getProgress();
        int percent = progress + 1;
        percentDisplay.setText(percent);
        int num = Integer.parseInt(numberEntry.getText().toString());
        int result = num * percent / 100;
        calcDisplay.setText(result);


    }

}
