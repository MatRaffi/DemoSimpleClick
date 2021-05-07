package sg.edu.rp.c346.s19024292.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgBtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.button);
        etInput = findViewById(R.id.editTextInput);
        tgBtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.rgGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.rbMale){
                    // Write the code when male selected
                    tvDisplay.append("He says ");
                }
                else{
                    // Write the code when female selected
                    tvDisplay.append("She says ");
                }
                tvDisplay.setText(stringResponse);
            }
        });


        tgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action

                if (tgBtn.isChecked() == false) {
                    etInput.setFocusable(false);
                } else {
                    etInput.setFocusable(true);
                }

            }

            // Code for the action
            String stringResponse = etInput.getText().toString();
            int checkedRadioId = rgGender.getCheckedRadioButtonId();
        });
    }
}
