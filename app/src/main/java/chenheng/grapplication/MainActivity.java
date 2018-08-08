package chenheng.grapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import chenheng.grapplication.cardFlipping.cardFlippingAct;
import chenheng.grapplication.common.CommonAdapter;
import chenheng.grapplication.common.CommonModel;
import chenheng.grapplication.number.NumAct;
import chenheng.grapplication.shake.ShakeAct;
import chenheng.grapplication.webview.GrWebViewAct;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private CommonAdapter adapter;

    private Context context;

    private ArrayList<CommonModel> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        datas.add(new CommonModel("TxWebView", "为公司的H5提供更好的webview", 1, new Intent(this, GrWebViewAct.class)));
        datas.add(new CommonModel("ShakeAct", "摇一摇", 1, new Intent(this, ShakeAct.class)));
        datas.add(new CommonModel("NumAct", "动态数字", 1, new Intent(this, NumAct.class)));
        datas.add(new CommonModel("cardFlippingAct", "卡片切换", 1, new Intent(this, cardFlippingAct.class)));

        listView = (ListView) findViewById(R.id.common_list);
        adapter = new CommonAdapter(datas, context);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = ((CommonModel) adapter.getItem(i)).getIntent();
                startActivity(intent);
            }
        });

    }


}
