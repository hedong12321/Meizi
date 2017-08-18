package com.spark.meizi.about;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.spark.meizi.R;
import com.spark.meizi.base.BaseActivity;

import butterknife.BindView;

public class AboutActivity extends BaseActivity {

    @BindView(R.id.tb_about)
    Toolbar tbAbout;

    @Override
    public void initSubViews(View view) {
        super.initSubViews(view);
        setSupportActionBar(tbAbout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);

        // 对android中ActionBar中setDisplayHomeAsUpEnabled和setHomeButtonEnabled和setDisplayShowHomeEnabled方法的理解

        /*
        setHomeButtonEnabled这个小于4.0版本的默认值为true的。
        但是在4.0及其以上是false，该方法的作用：决定左上角的图标是否可以点击。没有向左的小图标。 true 图标可以点击  false 不可以点击。

        actionBar.setDisplayHomeAsUpEnabled(true)
        // 给左上角图标的左边加上一个返回的图标 。对应ActionBar.DISPLAY_HOME_AS_UP

        actionBar.setDisplayShowHomeEnabled(true)
        //使左上角图标是否显示，如果设成false，则没有程序图标，仅仅就个标题，否则，显示应用程序图标，对应id为 android.R.id.home，对应ActionBar.DISPLAY_SHOW_HOME

        actionBar.setDisplayShowCustomEnabled(true)
        // 使自定义的普通View能在title栏显示，即actionBar.setCustomView能起作用，对应 ActionBar.DISPLAY_SHOW_CUSTOM

        actionBar.setDisplayShowTitleEnabled(true)
        //对应ActionBar.DISPLAY_SHOW_TITLE。

        其中setHomeButtonEnabled和setDisplayShowHomeEnabled共同起作用，
        如果setHomeButtonEnabled设成false，
        即使setDisplayShowHomeEnabled设成true，图标也不能点击
         */
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_about;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
