package com.example.arif.datepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends Activity {

    private TextView textView;
    private Button dateButton;
    private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.TextViewID);
        dateButton = (Button) findViewById(R.id.DateButtonID);
        datePicker = (DatePicker) findViewById(R.id.datePickerID);


        textView.setText(currentDate());

        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(currentDate());
            }
        });


    }

    private String currentDate() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Current date:");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append(datePicker.getMonth()+1+"/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();
    }
}
