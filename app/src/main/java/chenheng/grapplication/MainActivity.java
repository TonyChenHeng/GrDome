package chenheng.grapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import chenheng.grapplication.common.CommonAdapter;
import chenheng.grapplication.common.CommonModel;

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

        datas.add(new CommonModel("测试1", "测试2", 1));

        listView = (ListView) findViewById(R.id.common_list);
        adapter = new CommonAdapter(datas, context);
        listView.setAdapter(adapter);
    }


}
