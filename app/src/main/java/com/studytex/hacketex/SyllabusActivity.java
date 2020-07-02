package com.studytex.hacketex;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ScrollView;

public class SyllabusActivity extends AppCompatActivity {
	
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private LinearLayout linear2;
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear18;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear4;
	private ImageView imageview3;
	private ImageView imageview4;
	private LinearLayout page_1;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private ScrollView vscroll1;
	private LinearLayout horizontal_line_page;
	private LinearLayout vertical_page1_final;
	private LinearLayout linear26;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private LinearLayout linear51;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private TextView textview17;
	private ImageView imageview5;
	private ImageView imageview6;
	private ImageView imageview7;
	private ImageView imageview8;
	private ImageView imageview9;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.syllabus);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		page_1 = (LinearLayout) findViewById(R.id.page_1);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		horizontal_line_page = (LinearLayout) findViewById(R.id.horizontal_line_page);
		vertical_page1_final = (LinearLayout) findViewById(R.id.vertical_page1_final);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
