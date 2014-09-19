package br.com.mobicare.mvp.base;

import br.com.mobicare.mvparchitecture.AbstractEventer;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

public abstract class AbstractView extends AbstractEventer {

    private View mView;
    protected Context mContext;

    public AbstractView(Context context) {
	mContext = context;
	mView = LayoutInflater.from(context).inflate(getLayoutResource(), null);

	loadViews(mView);
	setViewListeners();
    }
    
    protected abstract int getLayoutResource();
    
    protected abstract void loadViews(View parentView);

    protected abstract void setViewListeners();
    
    public final View getView() {
	return mView;
    }
}
