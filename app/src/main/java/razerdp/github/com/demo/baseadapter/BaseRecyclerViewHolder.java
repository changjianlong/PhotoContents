package razerdp.github.com.demo.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by 大灯泡 on 2016/11/1.
 * <p>
 * 对viewholder的封装
 */

public abstract class BaseRecyclerViewHolder<T> extends RecyclerView.ViewHolder {

    private int viewType;

    public BaseRecyclerViewHolder(Context context, ViewGroup viewGroup, int layoutResId) {
        super(LayoutInflater.from(context).inflate(layoutResId, viewGroup, false));
    }

    public BaseRecyclerViewHolder(View itemView, int viewType) {
        super(itemView);
        this.viewType = viewType;
    }

    public abstract void onBindData(T data, int position);

    protected int getViewType() {
        return viewType;
    }

    protected Context getContext() {
        return itemView.getContext();
    }
}
