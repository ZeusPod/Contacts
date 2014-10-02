package app.com.zeusdev.contacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import app.com.zeusdev.contacts.app.com.zeusdev.contacts.util.TextChangedListener;

public class MyActivity extends Activity {

    private EditText textNombre, textTelefono, textEmail, textDireccion;
    private Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        inicializarComponentesUI();



    }

    private void inicializarComponentesUI() {

        textNombre = (EditText) findViewById(R.id.cmpNombre);
        textTelefono = (EditText) findViewById(R.id.cmpTelefono);
        textEmail = (EditText) findViewById(R.id.cmpEmail);
        textDireccion = (EditText) findViewById(R.id.cmpDireccion);


        textNombre.addTextChangedListener(new TextChangedListener() {
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                btnAgregar = (Button) findViewById(R.id.btnAgregar);
                btnAgregar.setEnabled(charSequence.toString().trim().isEmpty());

            }
        });

    }


    public void onClick(View view) {

        String msg = String.format("%s A sido agregado a la lista!", textNombre.getText());
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        btnAgregar.setEnabled(false);
        limpiarCampos();
    }

    private void limpiarCampos() {

        textNombre.getText().clear();
        textTelefono.getText().clear();
        textEmail.getText().clear();
        textDireccion.getText().clear();
        textNombre.requestFocus();
    }
}
