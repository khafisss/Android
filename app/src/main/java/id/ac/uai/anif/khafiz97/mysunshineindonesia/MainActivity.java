package id.ac.uai.anif.khafiz97.mysunshineindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.weather_day_title)
    TextView weatherDayTitle;
    @BindView(R.id.weather_desc)
    TextView weatherDesc;
    @BindView(R.id.weather_temperature)
    TextView weatherTemperature;
    @BindView(R.id.img_weather)
    ImageView imgWeather;
    @BindView(R.id.weither_recycler)
    RecyclerView weatherList;

    private WeitherAdapter weitherAdapter;
    private List<Weather> weatherListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        weatherDayTitle.setText("Hari Minggu");
        weatherDesc.setText("Hari Terang Benderang");
        weatherTemperature.setText("30 Derajat DOANG");

        imgWeather.setImageResource(R.drawable.cloud);
        weatherList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        weatherListData = new ArrayList<Weather>();
        weatherListData.add(new Weather(R.drawable.cloud, "11 November 2017", "Cerah", "17"));
        weatherListData.add(new Weather(R.drawable.cloud, "12 November 2017",  "Cerah Banget", "20"));
        weatherListData.add(new Weather(R.drawable.rainy, "13 November 2017",  "Hujan", "30"));
        weatherListData.add(new Weather(R.drawable.rainy, "14 November 2017",  "Rintik Banget", "34"));
        weatherListData.add(new Weather(R.drawable.cloud, "15 November 2017",  "Cerah Lagi", "38"));
        weatherListData.add(new Weather(R.drawable.cloud, "16 November 2017",  "Lumayan Cerah", "19"));
        weatherListData.add(new Weather(R.drawable.cloud, "17 November 2017", "Cerah Merona", "48"));

        weitherAdapter = new WeitherAdapter(weatherListData);

        weatherList.setAdapter(weitherAdapter);

    }
}
