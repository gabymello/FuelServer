package br.ulbra.fuelserver;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtNome, txtPlaca, txtDistancia, txtConsumo, txtPreco, txtNecessario, txtCusto;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtNome = findViewById(R.id.txtNome);
        txtPlaca = findViewById(R.id.txtConsumo);
        txtDistancia = findViewById(R.id.txtDistancia);
        txtConsumo = findViewById(R.id.txtConsumo);
        txtPreco = findViewById(R.id.txtPreco);
        txtNecessario = findViewById(R.id.txtNecessario);
        txtCusto = findViewById(R.id.txtCusto);
        btnCalcular = findViewById(R.id.btnCalcular);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double consumo, distancia, preco, necessario, custo;
                consumo = Double.parseDouble(txtConsumo.getText().toString());
                distancia = Double.parseDouble(txtDistancia.getText().toString());
                preco = Double.parseDouble(txtPreco.getText().toString());

                necessario = distancia/consumo;
                txtNecessario.setText("Serão necessários " +necessario+ " litros de combustível");

                custo = necessario*preco;
                txtCusto.setText("O custo será de " +custo+ " R$ ");
            }
        });

    }
}