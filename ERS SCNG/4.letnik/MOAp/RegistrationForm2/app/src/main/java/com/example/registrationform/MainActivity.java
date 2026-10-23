package com.example.registrationform;

import android.os.Bundle;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etUsername;
    EditText etFullName;
    EditText etCountry;
    EditText etEmail;
    EditText etPhone;
    EditText etPassword;

    RadioGroup radioGroup;
    RadioButton rbMale;
    RadioButton rbFemale;

    CheckBox cbTerms;

    Button btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // povezava Java - activity_main.xml
        setContentView(R.layout.activity_main);

        // et - editText
        etUsername = findViewById(R.id.etUsername);
        etFullName = findViewById(R.id.etFullName);
        etCountry = findViewById(R.id.etCountry);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);

        radioGroup = findViewById(R.id.radioGroup);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);

        cbTerms = findViewById(R.id.cbTerms);

        btnCreateAccount = findViewById(R.id.btnCreateAccount);

        btnCreateAccount.setOnClickListener(v -> {

            // Preberemo podatke iz vnosnih polj
            String username = etUsername.getText().toString();
            String fullName = etFullName.getText().toString();
            String country = etCountry.getText().toString();
            String email = etEmail.getText().toString();
            String phone = etPhone.getText().toString();
            String password = etPassword.getText().toString();

            String gender;

            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == R.id.rbMale) {
                gender = "Male";
            } else if (selectedId == R.id.rbFemale) {
                gender = "Female";
            } else {
                gender = "Not selected";
            }

            String termsAccepted;

            if (cbTerms.isChecked()) {
                termsAccepted = "Yes";
            } else {
                termsAccepted = "No";
            }

            String details =
                    "Username: " + username + "\n" +
                            "Full name: " + fullName + "\n" +
                            "Country: " + country + "\n" +
                            "Email: " + email + "\n" +
                            "Phone number: " + phone + "\n" +
                            "Password: " + password + "\n" +
                            "Gender: " + gender + "\n" +
                            "Terms Accepted: " + termsAccepted;

            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Registration Details")
                    .setMessage(details)
                    .setPositiveButton("OK", null)
                    .show();
        });
    }
}