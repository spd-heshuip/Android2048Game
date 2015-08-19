package com.shuip.android2048game;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

	private int num;
	private TextView lable;
	
	public Card(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		lable = new TextView(getContext());
		lable.setTextSize(32);
		lable.setBackgroundColor(0x33ffffff);
		lable.setGravity(Gravity.CENTER);
		
		LayoutParams lp = new LayoutParams(-1,-1);
		lp.setMargins(10, 10, 0, 0);
		addView(lable, lp);
	}
	public int getNum() {
		return this.num;
	}
	public void setNum(int num) {
		this.num = num;
		
		if (num <= 0) {
			lable.setText("");
		}else {
			lable.setText(num + "");
		}
		
	}
	
	public boolean equals(Card card) {
		// TODO Auto-generated method stub
		return getNum() == card.getNum();
	}

	
	
}
