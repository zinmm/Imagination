package com.unicorn.imagination;

import android.widget.LinearLayout;

import com.unicorn.brain.BaseActivity;
import com.unicorn.brain.BaseTopBarView;
import com.unicorn.brain.ShowTabBarListener;

public class MainActivity extends BaseActivity implements ShowTabBarListener {


    @Override
    protected int getRootLayoutId() {
        return 0;
    }

    @Override
    protected void init() {

    }

    @Override
    protected ShowTabBarListener getShowTabBarListener() {
        return this;
    }

    @Override
    public void setTopBarViewContent(LinearLayout leftLinearLayout, LinearLayout centerLinearLayout, LinearLayout rightLinearLayout) {
        BaseTopBarView.backImageView(mContext, leftLinearLayout);
        BaseTopBarView.contentTextView(mContext, "Unicorn", centerLinearLayout);
        BaseTopBarView.imageView(mContext, R.mipmap.ic_launcher, rightLinearLayout);
    }
}
