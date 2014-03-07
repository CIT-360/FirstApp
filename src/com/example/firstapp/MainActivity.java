package com.example.firstapp;

import java.util.ArrayList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GridView gv = (GridView) findViewById(R.id.gridView);
		gv.setAdapter(new ImageAdapter(getApplicationContext()));
		gv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parentView, View iv, int position,
					long id) {
				Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_LONG).show();
			}
			
		});
	}
}