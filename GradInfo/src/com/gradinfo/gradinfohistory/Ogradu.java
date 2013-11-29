package com.gradinfo.gradinfohistory;

import com.gradinfo.gradinfoproba.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

// Blink-class with list_view to specific part of history and back

public class Ogradu extends Activity implements OnItemClickListener {

	TextView inText;
	ListView list;
	private ArrayAdapter<String> adapter;
	String[] list_items;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.city_list_in_n_past);

		inText = (TextView) findViewById(R.id.ogradu_txtview_uvod);

		list = (ListView) findViewById(R.id.ogradu_listview_list);

		list_items = getResources().getStringArray(R.array.listogradu);

		new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
				R.array.listogradu);
		list.setAdapter(adapter);

	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View view, int position,
			long id) {

		if (position == 0) {

			Intent locations = new Intent(this, Locations.class );
			startActivity(locations);

		} else if (position == 1) {
			
			Intent population = new Intent(this, Population.class);
			startActivity(population);

		} else if (position == 2) {
			
			Intent earlyHistory = new Intent(this, EarlyHistory.class);
			startActivity(earlyHistory);
		
		} else if (position == 3) {
			
			Intent reColonization = new Intent(this, ReColonization.class);
			startActivity(reColonization);
			
		} else if (position == 4) {
			
			Intent scienceCulture = new Intent(this, ScienceCulture.class);
			startActivity(scienceCulture);
			
		} else if (position == 5) {
			
			Intent vukovarYugo = new Intent(this, VukovarYugoslavija.class);
			startActivity(vukovarYugo);
			
		} else if (position == 6) {
			
			Intent vukovarWar = new Intent(this, VukovarWar.class);
			startActivity(vukovarWar);
			
		} else if (position == 7) {
			
			
		}
		
	}

}