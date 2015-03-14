package com.itheima.smartbj.base.impl;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.itheima.smartbj.base.TabBasePage;

public class HomePage extends TabBasePage {

	public HomePage(Context context) {
		super(context);
	}
	
	@Override
	public void initData() {
		System.out.println("initData().............." + tv_title);
		tv_title.setText("�ǻ۱���");
		ib_menu.setVisibility(View.GONE);
		
		TextView tv = new TextView(context);
		tv.setText("��ҳ������");
		tv.setGravity(Gravity.CENTER);
		tv.setTextColor(Color.RED);
		tv.setTextSize(25);
		
		fl_content.addView(tv);
	}

}
