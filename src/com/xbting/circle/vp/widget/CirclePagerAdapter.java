package com.xbting.circle.vp.widget;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 *
 * @author xbting
 *
 */
public class CirclePagerAdapter extends PagerAdapter{

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		if(getRealCount()>1){
				return Integer.MAX_VALUE;
		}else{
			 getRealCount()
		}
	
	}
	
	/**
	 * 获取真实数目
	 * @return
	 * int
	 */
	public int getRealCount(){
		return 0;
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
