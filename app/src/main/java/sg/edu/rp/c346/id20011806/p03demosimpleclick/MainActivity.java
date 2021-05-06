package sg.edu.rp.c346.id20011806.p03demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDisplay;
        EditText etInput;
        TextView tvDisplay;
        ToggleButton togglebtn;
        RadioGroup rgGender;

        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textDisplay);
        togglebtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"My First Toast", Toast.LENGTH_SHORT).show();

                String textInput = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale){
                    textInput = "He says " + textInput;
                } else {
                    textInput = "She says " + textInput;
                }
                tvDisplay.setText(textInput);

            }
        });

        togglebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (togglebtn.isChecked()) {
                    etInput.setEnabled(true);
                    etInput.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    etInput.setEnabled(false);
                    etInput.setBackgroundColor(Color.rgb(255, 192, 203));
                }

            }
        });



        }
    }