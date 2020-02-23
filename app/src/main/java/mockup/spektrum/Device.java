package mockup.spektrum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.suke.widget.SwitchButton;

public class Device extends AppCompatActivity {

    SwitchButton switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.layout_device);

        getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        switchButton = findViewById(R.id.device_switch);

        /*
        switchButton.setChecked(true);
        switchButton.isChecked();
        switchButton.toggle();                  // switch state
        switchButton.toggle(false);             // switch without animation
        switchButton.setShadowEffect(true);     // disable shadow effect
        switchButton.setEnabled(false);         // disable button
        switchButton.setEnableEffect(false);    // disable the switch animation
        */
        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                if (switchButton.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Switching ON device...", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Switching OFF device...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onBack(View view) {
        finish();
    }

    public void onAdd(View view) {
        startActivity(new Intent(getApplicationContext(), DeviceAdd.class));
    }
}
