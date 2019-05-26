package mainactivity.musicplayer.example.com.peger;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPegerAdaptor extends FragmentPagerAdapter {

    List<Fragment> list = new ArrayList<>();

    public ViewPegerAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    public void setList(List<Fragment> list) {
        this.list = list;
        notifyDataSetChanged();

    }
}
