package id.sch.smktelkom_mlg.tugas01.xiirpl3025.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etKTP, etPhone;
    Button butOK;
    RadioButton rbM, rbF;
    TextView tvHasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextName);
        etKTP = (EditText) findViewById(R.id.editTextKTP);
        etPhone = (EditText) findViewById(R.id.editTextPhone);
        rbM = (RadioButton) findViewById(R.id.radioButtonM);
        rbF = (RadioButton) findViewById(R.id.radioButtonF);
        butOK = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);



        butOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String KTP = etKTP.getText().toString();
                String phone = etPhone.getText().toString();

                String hasil = null;
                if (rbM.isChecked()) {
                    hasil = rbM.getText().toString();
                } else if (rbF.isChecked()) {
                    hasil = rbF.getText().toString();
                }



                if (hasil == null) {
                    tvHasil.setText("You have not fill the forms gender and Language");
                } else {
                    tvHasil.setText("Your Name: " + nama + "."+"\n"+"KTP: " + KTP + "."+"\n"+"Phone number: " + phone + "."+"\n"+"Gender: " + hasil+".");
                }

            }
        });

    }
}
