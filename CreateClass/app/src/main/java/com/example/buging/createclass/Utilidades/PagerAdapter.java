package com.example.buging.createclass.Utilidades;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.buging.createclass.Vistas.VistaCrear;
import com.example.buging.createclass.Vistas.VistaFotos;
import com.example.buging.createclass.Vistas.VistaGrabar;
import com.example.buging.createclass.Vistas.VistaNotas;

/**
 * Created by Buging on 23-01-2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                VistaGrabar tab1 = new VistaGrabar();
                return tab1;
            case 1:
                VistaFotos tab2 = new VistaFotos();
                return tab2;
            case 2:
                VistaNotas tab3 = new VistaNotas();
                return tab3;
            case 3:
                VistaCrear tab4 = new VistaCrear();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
