package com.announce.common.notice.marqueeview;

import android.content.Context;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by GongWen on 17/9/15.
 */
public class SimpleMF<E extends CharSequence> extends MarqueeFactory<TextView, E> {
    public SimpleMF(Context mContext) {
        super(mContext);
    }

    @Override
    public TextView generateMarqueeItemView(E data) {
        TextView mView = new TextView(mContext);
        mView.setText(Html.fromHtml(data.toString()));
        return mView;
    }
}