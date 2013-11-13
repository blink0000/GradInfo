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
				+ "Vukovar je grad i najve�a hrvatska rije�na luka na Dunavu, u hrvatskom dijelu Srijema."
				+ "\n"
				+ "On je i upravno, prosvjetno, gospodarsko i kulturno sredi�te Vukovarsko-srijemske �upanije. "
				+ "Vukovar je stari barokni grad, poznat po Domovinskom ratu i stra�nim razaranjima. "
				+ "Me�u mno�tvom vrlo atraktivnih, ali u ratu te�ko stradalih gra�evina, isti�u se dvorac Eltz iz XVIII st., "
				+ "barokne zgrade u sredi�tu grada, franjeva�ki samostan, �upna crkva sv.Filipa i Jakova, pravoslavna crkva sv. Nikolaja i dr. "
				+ "Izvan grada na obali Dunava prema Iloku nalazi se Vu�edol, bogato arheolo�ko nalazi�te. "
				+ "Obredna posudica Vu�edolska golubica smatra se svojevrsnim simbolom grada. "
				+ "Vu�edol je i poznato izleti�te, raj za ribi�e s prekrasnom pje��anom pla�om na Orlovu otoku.");

		list = (ListView) findViewById(R.id.ogradu_listview_list);

	}
}