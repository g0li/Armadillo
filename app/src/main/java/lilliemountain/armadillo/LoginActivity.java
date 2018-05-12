package lilliemountain.armadillo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.sign).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signupview();
            }
        });
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signinview();
            }
        });
    }
    void signinview()
    {
        findViewById(R.id.loginview).setVisibility(View.VISIBLE);
        findViewById(R.id.signupview).setVisibility(View.GONE);
    }
    void signupview()
    {
        findViewById(R.id.loginview).setVisibility(View.GONE);
        findViewById(R.id.signupview).setVisibility(View.VISIBLE);
    }
}
