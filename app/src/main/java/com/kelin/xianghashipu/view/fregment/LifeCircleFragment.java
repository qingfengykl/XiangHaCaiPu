package com.kelin.xianghashipu.view.fregment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kelin.xianghashipu.R;
import com.kelin.xianghashipu.adapter.MyLifeCircleAdapter;
import com.kelin.xianghashipu.baen.LifeCircle;
import com.kelin.xianghashipu.presenter.LifeCirclePresenter;
import com.kelin.xianghashipu.view.IMvpViewLifeCircle;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LifeCircleFragment extends BaseFragment<LifeCirclePresenter, LifeCircleFragment>
        implements IMvpViewLifeCircle<LifeCircle> {

    private ListView mListView;
    private MyLifeCircleAdapter mMyLifeCircleAdapter;

    public LifeCircleFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mBasePresenter.loadData(1);

    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_life_circle, container, false);
        mListView = ((ListView) layout.findViewById(R.id.fragment_study_cook_list));
        mMyLifeCircleAdapter = new MyLifeCircleAdapter();
        mListView.setAdapter(mMyLifeCircleAdapter);


        return layout;
    }

    @Override
    LifeCirclePresenter getBasePresenter() {
        return new LifeCirclePresenter();
    }

    @Override
    public void showData(LifeCircle lifeCircle) {

        List<LifeCircle.DataBean> data = lifeCircle.getData();
        if (mMyLifeCircleAdapter != null) {
            mMyLifeCircleAdapter.addAll(data);
        }
    }
}
