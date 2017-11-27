package com.quoctrongnguyen.qlsp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.quoctrongnguyen.qlsp.R;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity
{

    EditText txtUserName, txtPassWord;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        addControls();
        addEvents();
    }

    private void addEvents()
    {
        btnLogin.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                /*sao khong thu viet như vậy xem*/
                if (txtUserName.getText().toString().equals("admin") && "123".compareTo(txtPassWord.getText().toString()) == 0)
                {
                    Intent intent = new Intent(LoginActivity.this, ListSP_Activity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "Đăng Nhập Thành Công", Toast.LENGTH_LONG).show();

                }
                else
                {
                    Toast.makeText(LoginActivity.this, "UserName hoặc Pass không đúng !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void addControls()
    {
        txtUserName = findViewById(R.id.txtUserName);
        txtPassWord = findViewById(R.id.txtPassWord);
        btnLogin = findViewById(R.id.btnLogin);

    }
}

