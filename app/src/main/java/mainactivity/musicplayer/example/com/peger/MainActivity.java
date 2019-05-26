package mainactivity.musicplayer.example.com.peger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.peger);
        ViewPegerAdaptor viewPegerAdaptor = new ViewPegerAdaptor(getSupportFragmentManager());
        viewPager.setAdapter(viewPegerAdaptor);

        List<Fragment> list = new ArrayList<>();
        list.add(new SampleFragment());
        list.add(new SampleFragment());
        list.add(new SampleFragment());
        viewPegerAdaptor.setList(list);

        viewPager.setAdapter(viewPegerAdaptor);
    }
}
