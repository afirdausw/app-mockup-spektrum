package mockup.spektrum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.layout_signin);

        getWindow().setStatusBarColor(getResources().getColor(R.color.colorAccent));
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    }

    public void onSignin(View view) {
        startActivity(new Intent(getApplicationContext(), Main.class));
    }

    public void onForgot(View view) {
        startActivity(new Intent(getApplicationContext(), Forgot.class));
    }

    public void onCreateAccount(View view) {
        startActivity(new Intent(getApplicationContext(), Signup.class));
    }
}
