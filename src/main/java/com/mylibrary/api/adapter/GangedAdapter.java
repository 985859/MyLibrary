package com.mylibrary.api.adapter;

import android.widget.TextView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mylibrary.api.R;
import com.mylibrary.api.interfaces.IGangedData;

import java.util.List;

public class GangedAdapter extends BaseQuickAdapter<IGangedData, BaseViewHolder> {
    int selectTextColor;
    int textColor;
    int textSize = 14;
    int selcetPosition = -1;

    public void setSelectTextColor(int selectTextColor) {
        this.selectTextColor = selectTextColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public void setSelectPosition(int selcetPosition) {
        int i = this.selcetPosition;
        this.selcetPosition = selcetPosition;
        notifyItemChanged(selcetPosition);
        notifyItemChanged(i);


    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public GangedAdapter(@Nullable List<IGangedData> data) {
        super(R.layout.itm_granged, data);

    }

    @Override
    protected void convert(BaseViewHolder helper, IGangedData item) {
        TextView textView = helper.getView(R.id.itmGranged_Text);
        TextView textT = helper.getView(R.id.itmGranged_T);
        textView.setText(item.getName());
        textView.setTextSize(textSize);
        textView.setTextColor(textColor);
        textT.setTextColor(selectTextColor);
        if (selcetPosition == helper.getAdapterPosition()) {
            textView.setTextColor(selectTextColor);
            helper.setVisible(R.id.itmGranged_T, true);
        } else {
            helper.setVisible(R.id.itmGranged_T, false);
        }
    }
}
