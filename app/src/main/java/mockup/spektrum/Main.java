package mockup.spektrum;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class Main extends AppCompatActivity {

    CarouselView carousel;

    int[] slideImages = { R.drawable.slide_1, R.drawable.slide_2, R.drawable.slide_3 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.layout_main);

        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        carousel = findViewById(R.id.carouselView);
        carousel.setPageCount(slideImages.length);
        carousel.setImageListener(listener);
    }

    ImageListener listener = new  ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(slideImages[position]);
        }
    };
}
