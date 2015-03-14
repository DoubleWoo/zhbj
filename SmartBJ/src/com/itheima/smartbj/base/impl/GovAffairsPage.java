package com.itheima.smartbj.base.impl;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.itheima.smartbj.base.TabBasePage;

public class GovAffairsPage extends TabBasePage {

	public GovAffairsPage(Context context) {
		super(context);
	}
	@Override
	public void initData() {
		tv_title.setText("�˿ڹ���");
		ib_menu.setVisibility(View.VISIBLE);
		
		TextView tv = new TextView(context);
		tv.setText("���������");
		tv.setGravity(Gravity.CENTER);
		tv.setTextColor(Color.RED);
		tv.setTextSize(25);
		
		fl_content.addView(tv);
	}

}
