package id.ac.uai.anif.khafiz97.mysunshineindonesia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Khafiz on 04/11/2017.
 */

public class WeitherAdapter extends RecyclerView.Adapter<WeitherAdapter.WeatherViewHolder> {
    List<Weather> weatherList;
    public WeitherAdapter(List<Weather> weatherListData) {
        weatherList = weatherListData;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View viewContent = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item,parent, false);
        return new WeatherViewHolder(viewContent);
    }

    @Override
    public void onBindViewHolder(WeitherAdapter.WeatherViewHolder holder, int position) {
    holder.itemTitle.setText("Cuaca Hari ini tanggal " +position);
    holder.weatherItemImage.setImageResource(weatherList.get(position).getWeatherImage());
    holder.weatherItemDate.setText(weatherList.get(position).getWeatherDate());
    holder.weatherItemDesc.setText(weatherList.get(position).getWeatherDesc());
    holder.weatherItemTemperature.setText(weatherList.get(position).getWeatherTemperature());
    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }

    public class WeatherViewHolder extends  RecyclerView.ViewHolder{
        @BindView(R.id.item_title)
        TextView itemTitle;
        @BindView(R.id.weather_item_images)
        ImageView weatherItemImage;
        @BindView(R.id.weather_item_date)
        TextView weatherItemDate;
        @BindView(R.id.weather_item_desc)
        TextView weatherItemDesc;
        @BindView(R.id.weather_item_temperature)
        TextView weatherItemTemperature;


        public WeatherViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
