package com.example.checkpathlist;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView txt1, txt2, txt3, txt4, txt5, txt6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txt1 = (TextView)findViewById(R.id.text1);
		txt2 = (TextView)findViewById(R.id.text2);
		txt3 = (TextView)findViewById(R.id.text3);
		txt4 = (TextView)findViewById(R.id.text4);
		txt5 = (TextView)findViewById(R.id.text5);
		txt6 = (TextView)findViewById(R.id.text6);
				
		String sdcardState = android.os.Environment.getExternalStorageState();
		if (sdcardState.contentEquals(android.os.Environment.MEDIA_MOUNTED)) {
			System.out.println("::::::::::mount = " + sdcardState);
			txt1.setText("마운트상태 = " + sdcardState);
		} else {
			System.out.println("::::::::::mount = " + null);
			txt1.setText("마운트상태 = " + null);
		}
		
		txt2.setText("내장메모리(Environment.getDataDirectory().getAbsolutePath()) = " + Environment.getDataDirectory().getAbsolutePath());
		txt3.setText("외장메모리(Environment.getExternalStorageDirectory().getAbsolutePath()) = " + Environment.getExternalStorageDirectory().getAbsolutePath());
		txt4.setText("내부메모리에 할당된 SD카드경로(Environment.getExternalStorageDirectory()) = " + Environment.getExternalStorageDirectory());
		txt5.setText("SDCARD의 최상위 경로(Environment.getExternalStorageDirectory()) = " + Environment.getExternalStorageDirectory());
		
//		String path = "/storage/extSdCard/halfstudy/halfdata/" + "halfstudy";
		String path = "/storage/901C-0C1F/halfstudy/halfdata/" + "halfstudy";
		File file = new File(path);
		if (file.exists() == true) {
			txt6.setText(path);
		} else {
			txt6.setText(null);
		}
		
	}
}
