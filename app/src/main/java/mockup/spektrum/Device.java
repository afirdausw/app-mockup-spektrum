package mockup.spektrum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Device extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.layout_device);

        getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    }

    public void onBack(View view) {
        finish();
    }

    public void onAdd(View view) {
        startActivity(new Intent(getApplicationContext(), DeviceAdd.class));
    }
}
