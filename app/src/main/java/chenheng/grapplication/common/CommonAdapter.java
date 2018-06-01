package chenheng.grapplication.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import chenheng.grapplication.R;

/**
 * 版权：XXX公司 版权所有
 * 作者：TonyChen
 * 版本：2.0
 * 创建日期：2018/6/1
 * 描述：(重构)
 * 修订历史：
 * 参考链接：
 */
public class CommonAdapter extends BaseAdapter {
    private ArrayList<CommonModel> datas = new ArrayList<>();
    private Context context;
    private LayoutInflater inflater;
    private ListChange listChange;


    public CommonAdapter(ArrayList<CommonModel> datas, Context context) {
        this.context = context;
        this.datas = datas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    //列表更新
    public void notifyDataSetChanged(ArrayList<CommonModel> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    public interface ListChange {
        void listC();
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_common_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return null;
    }

    public class ViewHolder {
        public final ImageView ivimage;
        public final TextView title;
        public final TextView detail;
        public final View root;

        public ViewHolder(View root) {
            ivimage = (ImageView) root.findViewById(R.id.img);
            title = (TextView) root.findViewById(R.id.title);
            detail = (TextView) root.findViewById(R.id.detail);
            this.root = root;
        }
    }
}
