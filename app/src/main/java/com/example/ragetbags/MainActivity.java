package com.example.ragetbags;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.ragetbags.menubawah.Katalog;
import com.example.ragetbags.menubawah.Notifikasi;
import com.example.ragetbags.menubawah.Profil;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.navigasi_bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.katalog){
                    buka_fragment(new Katalog());
                    return true;
                }
                if(item.getItemId()==R.id.notifikasi) {
                    buka_fragment(new Notifikasi());
                    return true;
                }
                if(item.getItemId()==R.id.profil) {
                    buka_fragment(new Profil());
                    return true;
                }
                return false;
            }
        });

    }
        boolean buka_fragment(Fragment fragment)
        {
            if(fragment!=null)
            {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.navigasi_bottom, fragment).commit();
                return true;
            }
            return false;
        }

}