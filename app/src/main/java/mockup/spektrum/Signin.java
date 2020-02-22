package mockup.spektrum;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Signin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.layout_signin);

        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
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
