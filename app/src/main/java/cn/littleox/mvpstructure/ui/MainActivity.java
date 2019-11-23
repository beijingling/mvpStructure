package cn.littleox.mvpstructure.ui;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import cn.littleox.mvpstructure.MVPApplication;
import cn.littleox.mvpstructure.R;
import cn.littleox.mvpstructure.di.componet.ActivityComponent;
import cn.littleox.mvpstructure.di.componet.DaggerActivityComponent;
import cn.littleox.mvpstructure.di.module.ActivityModule;
import cn.littleox.mvpstructure.ui.home.BlogFragment;

public class MainActivity extends AppCompatActivity {

    private static final int TAB_COUNT = 4;

    private ViewPager view_pager;
    private BottomNavigationView navigation_view;
    private ActivityComponent mComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view_pager = findViewById(R.id.pages);
        navigation_view = findViewById(R.id.navigation_view);
        mComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((MVPApplication) getApplication()).getAppComponent())
                .build();
        mComponent.inject(this);
        initViewPager();
        initNavigationView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void initViewPager() {
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new BlogFragment();

                    case 1:
                        return TestFragment.getInstance("新闻");
                    case 2:
                        return TestFragment.getInstance("发现");

                    case 3:
                        return TestFragment.getInstance("我的");

                    default:
                        throw new IndexOutOfBoundsException("total: " + TAB_COUNT + ", position: " + position);
                }
            }

            @Override
            public int getCount() {
                return TAB_COUNT;
            }

        };
        view_pager.setAdapter(adapter);
    }

    private void initNavigationView() {
        //disableShiftMode(navigation_view);
        navigation_view.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.tab_clip:
                    view_pager.setCurrentItem(0);
                    break;

                case R.id.tab_template:
                    view_pager.setCurrentItem(1);
                    break;

                case R.id.tab_discovery:
                    view_pager.setCurrentItem(2);
                    break;

                case R.id.tab_mine:
                    view_pager.setCurrentItem(3);
                    break;

                default:
                    break;
            }
            return true;
        });
    }

}
