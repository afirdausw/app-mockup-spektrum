package mockup.spektrum;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.layout_signup);

        getWindow().setStatusBarColor(getResources().getColor(R.color.colorAccent));
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    }

    public void onBack(View view) {
        finish();
    }

    public void onLogin(View view) {
        finish();
    }

    public void onSignup(View view) {

    }
}
