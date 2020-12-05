package com.example.pas_11rpl_daffa;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

public class DetailTeamsFavourite extends AppCompatActivity {

    Bundle extras;
    String title;
    String date;
    String deskripsi;
    String path;
    String id;

    TextView tvjudul;
    ImageView ivposter;
    TextView tvdesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_teams_favourite);
        extras = getIntent().getExtras();
        tvjudul = (TextView)findViewById(R.id.tvjudul_favourite);
        tvdesc = (TextView)findViewById(R.id.txtdeskripsi_favourite);
        ivposter = (ImageView) findViewById(R.id.ivposter_favourite);

        if (extras != null) {
            title = extras.getString("judul");
            id = extras.getString("id");
            date = extras.getString("date");
            deskripsi = extras.getString("deskripsi");
            path = extras.getString("path");

            tvjudul.setText(title);
            tvdesc.setText(deskripsi);
            Glide.with(com.example.pas_11rpl_daffa.DetailTeamsFavourite.this)
                    .load(path)
                    .override(Target.SIZE_ORIGINAL)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(ivposter);
            // and get whatever type user account id is
        }
    }
}