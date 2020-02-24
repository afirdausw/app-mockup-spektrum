package mockup.spektrum;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    TextView name, gender, date, address, phone, username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.layout_profile);

        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        name = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        date = findViewById(R.id.date);
        address = findViewById(R.id.address);
        phone = findViewById(R.id.phone);
        username = findViewById(R.id.username);

        name.setText("Afif Firdaus Wipayana");
        gender.setText("Male");
        date.setText("09-09-1999");
        address.setText("Jl. Kenanga Indah 1 No.12D, Jatimulyo, Lowokwaru, Malang");
        phone.setText("0812-4040-0042");
        username.setText("Firwyna");
    }

    public void onNotification(View view) {

    }

    public void onEdit(View view) {

    }

    public void onLogout(View view) {

    }
}
