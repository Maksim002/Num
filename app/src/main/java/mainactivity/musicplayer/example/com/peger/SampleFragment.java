package mainactivity.musicplayer.example.com.peger;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SampleFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_infleter, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listView = view.findViewById(R.id.lestV);
        listView.setAdapter(new Adaptar(getContext(), getSamole()));
    }

    private List<String> getSamole() {
        List<String> list = new ArrayList<>();
        list.add("Я тебя сьем");
        list.add("Я тебя сьем1");
        list.add("Я тебя сьем2");
        list.add("Я тебя сьем3");
        list.add("Я тебя сьем4");
        list.add("Я тебя сьем5");
        list.add("Я тебя сьем6");
        return list;
    }
}
