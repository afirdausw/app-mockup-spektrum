package mockup.spektrum;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DeviceAdd extends AppCompatActivity {

    Window window;
    Button btnDismiss, btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.layout_device_add);

        getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    }

    public void onBack(View view) {
        finish();
    }

    public void onScan(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final View layout = getLayoutInflater().inflate(R.layout.dialog_scan, null);
        builder.setView(layout);

        final AlertDialog dialog = builder.create();
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.show();

        window = dialog.getWindow();
        window.setGravity(Gravity.BOTTOM);

        btnDismiss = layout.findViewById(R.id.dialog_button_1);
        btnAdd = layout.findViewById(R.id.dialog_button_2);

        btnDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void onSave(View view) {

    }
}
