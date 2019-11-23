package cn.littleox.mvpstructure.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.littleox.mvpstructure.R;

public class TestFragment extends Fragment {

    private TextView textTag;
    private String Tag;

    public static TestFragment getInstance(String tag){
        Bundle b = new Bundle();
        b.putString("tag" ,tag);
        TestFragment f = new TestFragment();
        f.setArguments(b);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getArguments();
        Tag = b.getString("tag");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test_fragment,null);
        textTag = view.findViewById(R.id.test_tag);
        textTag.setText(Tag);
        return view;
    }
}

