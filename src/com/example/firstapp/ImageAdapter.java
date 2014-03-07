package com.example.firstapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ImageAdapter extends BaseAdapter {
	
	int[] images = {
			R.drawable.capestone, R.drawable.computer,
			R.drawable.crime, R.drawable.film,
			R.drawable.gavel, R.drawable.pakistan
	};
	private Context context;

	public ImageAdapter(Context applicationContext){
		context=applicationContext;
	}
	
	@Override
	public int getCount() {
		//number of pictures displayed 
		return images.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup group) {
		ImageView iv;
		if(view!=null){
			iv = (ImageView) view;
		}
		else{
			iv = new ImageView(context);
			iv.setLayoutParams(new GridView.LayoutParams(200,200));
		}
		iv.setImageResource(images[position]);
		return iv;
	}

}
