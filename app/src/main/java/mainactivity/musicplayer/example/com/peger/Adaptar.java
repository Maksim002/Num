package mainactivity.musicplayer.example.com.peger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Adaptar extends ArrayAdapter<String> {

    public Adaptar(Context context, List<String> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_sample, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.text_l);
        textView.setText(getItem(position));

        return convertView;
    }
}
