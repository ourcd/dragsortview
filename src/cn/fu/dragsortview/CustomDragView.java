package cn.fu.dragsortview;

import cn.fu.dragsortview.lib.BaseView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * custom  view inherit from BaseView
 * Just need to add LayoutParams when view init
 * */ 
public class CustomDragView extends BaseView
{
	private TextView tv;
	private ImageView iv;
	public CustomDragView(Context context)
	{
		super(context);
		init(context);
	}
	public CustomDragView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		init(context);
	}
	private void init(Context context)
	{
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(R.layout.sample_view, null);
		tv = (TextView) view.findViewById(R.id.view_description_tv);
		iv = (ImageView) view.findViewById(R.id.view_head_picture);
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		//display width & height
		lp.width = mScreenW;
		lp.height = 200;
		int paddingLeft = mHeaderPadding - dragViewMarginSide;
		int paddingRight = mHeaderPadding + dragViewMarginSide;
		view.setPadding(paddingLeft, 0, paddingRight, 0);
		view.setLayoutParams(lp);
		setContentView(view);   //setContentView to baseview

	}
	public void setPicAndText(int drawableId, String text)
	{
		iv.setImageResource(drawableId);
		tv.setText(text);
		setTileBar(drawableId, text, -1);
	}
	
	@Override
	public void updateDate()
	{
		// TODO Auto-generated method stub
	}
	
}
