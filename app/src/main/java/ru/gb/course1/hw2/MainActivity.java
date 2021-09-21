
package ru.gb.course1.hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Buttons buttons = new Buttons();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);
        TextView inputTextView = findViewById(R.id.input_field_text_view);

        if (savedInstanceState != null && savedInstanceState.containsKey("stringInputTextView_key")
                && savedInstanceState.containsKey("symbolOperation_key") && savedInstanceState.containsKey("valueFirst_key")
                && savedInstanceState.containsKey("valueSecond_key") && savedInstanceState.containsKey("temp_key")) {
            buttons.stringInputTextView = savedInstanceState.getString("stringInputTextView_key");
            buttons.symbolOperation = savedInstanceState.getString("symbolOperation_key");
            buttons.valueFirst = savedInstanceState.getDouble("valueFirst_key");
            buttons.valueSecond = savedInstanceState.getDouble("valueSecond_key");
            buttons.temp = savedInstanceState.getDouble("temp_key");
        }

        Button deleteAllValue = findViewById(R.id.button_del);
        deleteAllValue.setOnClickListener(view -> {
            buttons.clearAllCount();
            inputTextView.setText("");
        });

        Button divide = findViewById(R.id.button_div);
        divide.setOnClickListener(view -> {
            if (buttons.divideButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button multiply = findViewById(R.id.button_mult);
        multiply.setOnClickListener(view -> {
            if (buttons.multiplyButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button subtract = findViewById(R.id.button_sub);
        subtract.setOnClickListener(view -> {
            if (buttons.subtractButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button fold = findViewById(R.id.button_add);
        fold.setOnClickListener(view -> {
            if (buttons.foldButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button comma = findViewById(R.id.button_point);
        comma.setOnClickListener(view -> {
            if (buttons.buttonComma())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button equals = findViewById(R.id.button_eq);
        equals.setOnClickListener(view -> {
            buttons.equalsCount();
            inputTextView.setText(Double.toString(buttons.temp));
            buttons.clearAllCount();
        });

        Button nullB = findViewById(R.id.button_0);
        nullB.setOnClickListener(view -> {
            if (buttons.buttonNull())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button one = findViewById(R.id.button_1);
        one.setOnClickListener(view -> {
            if (buttons.buttonOne())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button two = findViewById(R.id.button_2);
        two.setOnClickListener(view -> {
            if (buttons.buttonTwo())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button three = findViewById(R.id.button_3);
        three.setOnClickListener(view -> {
            if (buttons.buttonThree())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button four = findViewById(R.id.button_4);
        four.setOnClickListener(view -> {
            if (buttons.buttonFour())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button five = findViewById(R.id.button_5);
        five.setOnClickListener(view -> {
            if (buttons.buttonFive())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button six = findViewById(R.id.button_6);
        six.setOnClickListener(view -> {
            if (buttons.buttonSix())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button seven = findViewById(R.id.button_7);
        seven.setOnClickListener(view -> {
            if (buttons.buttonSeven())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button eight = findViewById(R.id.button_8);
        eight.setOnClickListener(view -> {
            if (buttons.buttonEight())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button nine = findViewById(R.id.button_9);
        nine.setOnClickListener(view -> {
            if (buttons.buttonNine())
                inputTextView.setText(buttons.stringInputTextView);
        });
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("stringInputTextView_key", buttons.stringInputTextView);
        outState.putString("symbolOperation_key", buttons.symbolOperation);
        outState.putDouble("valueFirst_key", buttons.valueFirst);
        outState.putDouble("valueSecond_key", buttons.valueSecond);
        outState.putDouble("temp_key", buttons.temp);
    }
}