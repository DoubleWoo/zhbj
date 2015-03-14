package com.itheima.smartbj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;

import com.itheima.smartbj.util.CacheUtils;
import com.itheima.smartbj.util.Constants;


/**
 * @author Administrator
 * Splash����
 */
public class SplashActivity extends Activity {
	private View root;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		initView();
	}
	/**
	 * ��ʼ�� View
	 */
	private void initView() {
		root = findViewById(R.id.rl_splash_root);
		/**
		 * ���䶯��
		 */
		AlphaAnimation aa = new AlphaAnimation(0, 1);
		//���ö���ʱ��
		aa.setDuration(2000);
		//���ֶ���֮���״̬
		aa.setFillAfter(true);
		
		/**
		 * ��ת����
		 */
		RotateAnimation ra = new RotateAnimation(
				0, 360, 
				Animation.RELATIVE_TO_SELF, 0.5f, 
				Animation.RELATIVE_TO_SELF, 0.5f);
		ra.setDuration(1000);
		ra.setFillAfter(true);
		
		/**
		 * ������������ԭ����һ�㵽ȫ��
		 */
		ScaleAnimation sa = new ScaleAnimation(
				0.5f, 1, 
				0.5f, 1, 
				Animation.RELATIVE_TO_SELF, 0.5f, 
				Animation.RELATIVE_TO_SELF, 0.5f);
		sa.setDuration(1000);
		sa.setFillAfter(true);
		/**
		 * ���ö������ϣ��������ж���
		 */
		AnimationSet as = new AnimationSet(false);
		as.addAnimation(ra);
		as.addAnimation(sa);
		as.addAnimation(aa);
		
		/*
		 * ����������״̬
		 */
		as.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			/**
			 * �������
			 */
			@Override
			public void onAnimationEnd(Animation animation) {
				//�ж��Ƿ������򵼽��棬���û�н����򵼣��������������
				//true ��ʾ����������� false û��
				if (CacheUtils.getBoolean(getApplicationContext(), Constants.ISGUIDE, false)){
					//����������
					Intent intent = new Intent(SplashActivity.this,MainActivity.class);
					startActivity(intent);
				} else {
					//����������
					Intent intent = new Intent(SplashActivity.this,GuideActivity.class);
					startActivity(intent);
				}
				finish();//�ر�Splash����
			}
		});
		//��ʼ����
		root.startAnimation(as);
		
		
		
	}


}
