package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Var
    private Button button;
    private TextView textView4;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // My Code
        button = findViewById(R.id.button);
        textView4 = findViewById(R.id.textView4);
        editText = findViewById(R.id.editText);
        //onClickListener is a interface
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Toast kinda msg from bottom in black color
////                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                textView4.setText("The value in pound is "+Math.round(pound*100.0)/100.0);
//            }
//        });
    }


    // This is alternate of onclicklistener, here we have to give the name of this function as onclick attribute to button first.
    public void calculate(View view){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        textView4.setText("The value in pound is "+Math.round(pound*100.0)/100.0);
    }
}