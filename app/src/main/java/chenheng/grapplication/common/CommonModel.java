package chenheng.grapplication.common;

import android.content.Intent;

/**
 * 版权：XXX公司 版权所有
 * 作者：TonyChen
 * 版本：2.0
 * 创建日期：2018/6/1
 * 描述：
 * 修订历史：
 * 参考链接：
 */
public class CommonModel {
    //dome标题
    private String title;

    //domen内容
    private String detail;

    //dome示例图
    private int imgId;

    //跳转的Act
    private Intent intent;


    public CommonModel(String title, String detail, int imgId, Intent intent) {
        this.title = title;
        this.detail = detail;
        this.imgId = imgId;
        this.intent = intent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }
}
