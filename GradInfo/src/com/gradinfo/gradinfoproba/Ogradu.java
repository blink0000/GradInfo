package com.gradinfo.gradinfoproba;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class Ogradu extends Activity {

	TextView inText;
	ListView list;
	String uvod;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		inText = (TextView) findViewById(R.id.ogradu_txtview_uvod);
		inText.setText(uvod);
		uvod = ("Uvod"
				+ "\n"
				+ "Vukovar je grad i najveæa hrvatska rijeèna luka na Dunavu, u hrvatskom dijelu Srijema."
				+ "\n"
				+ "On je i upravno, prosvjetno, gospodarsko i kulturno središte Vukovarsko-srijemske županije. "
				+ "Vukovar je stari barokni grad, poznat po Domovinskom ratu i strašnim razaranjima. "
				+ "Meðu mnoštvom vrlo atraktivnih, ali u ratu teško stradalih graðevina, istièu se dvorac Eltz iz XVIII st., "
				+ "barokne zgrade u središtu grada, franjevaèki samostan, župna crkva sv.Filipa i Jakova, pravoslavna crkva sv. Nikolaja i dr. "
				+ "Izvan grada na obali Dunava prema Iloku nalazi se Vuèedol, bogato arheološko nalazište. "
				+ "Obredna posudica Vuèedolska golubica smatra se svojevrsnim simbolom grada. "
				+ "Vuèedol je i poznato izletište, raj za ribièe s prekrasnom pješèanom plažom na Orlovu otoku.");

		list = (ListView) findViewById(R.id.ogradu_listview_list);

	}
}