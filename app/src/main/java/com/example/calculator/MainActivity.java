package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn;
    public int valor = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
         btn = findViewById(R.id.button);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v){
                 EditText input_1 = findViewById(R.id.id_input_1);
                 EditText input_sinal = findViewById(R.id.id_input_sinal);
                 EditText input_2 = findViewById(R.id.id_input_2);
                 TextView text_resultado = findViewById(R.id.id_text_repos);
                 switch (input_sinal.getText().toString()){
                     case "+":
                         valor = Integer.parseInt(input_1.getText().toString()) + Integer.parseInt(input_2.getText().toString());
                         break;
                     case "-":
                         valor = Integer.parseInt(input_1.getText().toString()) - Integer.parseInt(input_2.getText().toString());
                         break;
                     case "*":
                         valor = Integer.parseInt(input_1.getText().toString()) * Integer.parseInt(input_2.getText().toString());
                         break;
                     case "/":
                         valor = Integer.parseInt(input_1.getText().toString()) / Integer.parseInt(input_2.getText().toString());
                         break;
                 }
                 text_resultado.setText("reposta: " + String.valueOf( valor));
                 System.out.println("reposta: " + String.valueOf( valor));
             }
         });

    }

//    public void Calcular(View view){
//        EditText input_1 = findViewById(R.id.id_input_1);
//        EditText input_sinal = findViewById(R.id.id_input_sinal);
//        EditText input_2 = findViewById(R.id.id_input_2);
//        TextView text_resultado = findViewById(R.id.id_text_repos);
//        switch (input_sinal.getText().toString()){
//            case "+":
//                valor = Integer.parseInt(input_1.getText().toString()) + Integer.parseInt(input_2.getText().toString());
//                break;
//            case "-":
//                valor = Integer.parseInt(input_1.getText().toString()) - Integer.parseInt(input_2.getText().toString());
//                break;
//            case "*":
//                valor = Integer.parseInt(input_1.getText().toString()) * Integer.parseInt(input_2.getText().toString());
//                break;
//            case "/":
//                valor = Integer.parseInt(input_1.getText().toString()) / Integer.parseInt(input_2.getText().toString());
//                break;
//        }
//        text_resultado.setText(valor);
//    }
    // android:onClick="Calcular"
    // ou
//        miBoton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Código al hacer clic
//            }
//        });
}
