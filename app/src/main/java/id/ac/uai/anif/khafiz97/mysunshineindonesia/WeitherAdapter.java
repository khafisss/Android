package id.ac.uai.anif.khafiz97.mysunshineindonesia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Khafiz on 04/11/2017.
 */

public class WeitherAdapter extends RecyclerView.Adapter<WeitherAdapter.WeatherViewHolder> {
    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View viewContent = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item,parent, false);
        return new WeatherViewHolder(viewContent);
    }

    @Override
    public void onBindViewHolder(WeitherAdapter.WeatherViewHolder holder, int position) {
    holder.itemTitle.setText("Cuaca Hari ini tanggal " +position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class WeatherViewHolder extends  RecyclerView.ViewHolder{
        @BindView(R.id.item_title)
        TextView itemTitle;

        public WeatherViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
