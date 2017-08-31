package gps.mock.com.parallaxscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.poliveira.apps.parallaxlistview.ParallaxScrollView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContainer = (RelativeLayout) findViewById(R.id.container);

        View v = getLayoutInflater().inflate(R.layout.include_scrollview, mContainer, true);
        ParallaxScrollView mScrollView = (ParallaxScrollView) v.findViewById(R.id.view);

        mScrollView.setParallaxView(getLayoutInflater().inflate(R.layout.view_header, mScrollView, false));
    }
}
