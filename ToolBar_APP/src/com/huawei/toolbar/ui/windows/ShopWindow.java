package com.huawei.toolbar.ui.windows;

import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.huawei.toolbar.GlobleConstants;
import com.huawei.toolbar.R;

public class ShopWindow extends BaseWindow
{
    private Button mBackBtn;
    
    private Button mCloseBtn;
    
    private Button mBuyBtn1, mBuyBtn2, mBuyBtn3;
    
    private Button mPullUpBtn;
    
    public ShopWindow(Handler handler)
    {
        super(handler);
        
        mBackBtn = (Button) mWindow.findViewById(R.id.back_btn);
        mBackBtn.setOnClickListener(this);
        mCloseBtn = (Button) mWindow.findViewById(R.id.close_btn);
        mCloseBtn.setOnClickListener(this);
        mBuyBtn1 = (Button) mWindow.findViewById(R.id.btn_shop1);
        mBuyBtn1.setOnClickListener(this);
        mBuyBtn2 = (Button) mWindow.findViewById(R.id.btn_shop2);
        mBuyBtn2.setOnClickListener(this);
        mBuyBtn3 = (Button) mWindow.findViewById(R.id.btn_shop3);
        mBuyBtn3.setOnClickListener(this);
        mPullUpBtn = (Button) mWindow.findViewById(R.id.pull_btn);
        mPullUpBtn.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v)
    {
        if (mBackBtn == v)
        {
            AnimationUp(GlobleConstants.OprationType.BACK);
        }
        if (mCloseBtn == v)
        {
            AnimationUp(GlobleConstants.OprationType.CLOSE);
        }
        if (mBuyBtn1 == v)
        {
            AnimationUp(GlobleConstants.WindowType.BUY);
        }
        if (mBuyBtn2 == v)
        {
            AnimationUp(GlobleConstants.WindowType.BUY);
        }
        if (mBuyBtn3 == v)
        {
            AnimationUp(GlobleConstants.WindowType.BUY);
        }
        if (mPullUpBtn == v)
        {
            AnimationUp(GlobleConstants.OprationType.BACK);
        }
    }
    
    @Override
    protected int windowLayout()
    {
        return R.layout.shop_view;
    }
    
    @Override
    public void create()
    {
        super.create();
        AnimationDown();
    }
    
    @Override
    protected int paramsType()
    {
        return WINDOW_FILL;
    }
    
    @Override
    protected int animationLayoutId()
    {
        return R.id.layout_back;
    }
}
