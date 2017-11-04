package id.ac.uai.anif.khafiz97.mysunshineindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView weatherDayTitle, weatherDesc, weatherTemperature;
    ImageView imgWeather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherDayTitle = (TextView) findViewById(R.id.weather_day_title);
        imgWeather = (ImageView)findViewById(R.id.img_weather);
        weatherDesc = (TextView) findViewById(R.id.weather_desc);
        weatherTemperature = (TextView) findViewById(R.id.weather_temperature);

        weatherDayTitle.setText("Hari Minggu");
        weatherDesc.setText("Hari Terang Benderang");
        weatherTemperature.setText("30 Derajat DOANG");

        imgWeather.setImageResource(R.drawable.cloud);

    }
}
