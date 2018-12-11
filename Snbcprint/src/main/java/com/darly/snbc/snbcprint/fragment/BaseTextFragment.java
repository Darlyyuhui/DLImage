package com.darly.snbc.snbcprint.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.darly.snbc.snbcprint.bean.AlignmentThickness;
import com.darly.snbc.snbcprint.bean.FontRecover;
import com.darly.snbc.snbcprint.bean.FontSizeSpacing;
import com.darly.snbc.snbcprint.listener.TextAlignListener;
import com.darly.snbc.snbcprint.listener.TextBackgroundListener;
import com.darly.snbc.snbcprint.listener.TextFontListener;
import com.darly.snbc.snbcprint.listener.TextSpacingListener;

import java.util.List;

/**
 * 基础Fragment类，定义操作接口方法
 * 包名称：com.darly.snbc.snbcprint.fragment
 * 作者：zhangyuhui 项目名称：CompanyModule
 * 日期：2018/12/7 16:16
 * 公司：山东新北洋信息技术股份有限公司西安分公司
 * 邮箱：zhangyuhui@newbeiyang.com
 */
public abstract class BaseTextFragment extends Fragment {

    public View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(root(), container, false);
        return rootView;
    }

    protected abstract int root();

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        initGlobe();
        initView(savedInstanceState);

        loadData();

        initListener();

    }

    /**
     * 下午4:06:44
     *
     * @author zhangyh2 TODO
     */
    private void initGlobe() {
        // TODO Auto-generated method stub
    }

    /**
     * @param savedInstanceState
     *            下午2:34:08
     * @author zhangyh2 BaseActivity.java TODO 初始化控件
     */
    protected abstract void initView(Bundle savedInstanceState);

    /**
     *
     * 下午2:34:10
     *
     * @author zhangyh2 BaseActivity.java TODO 加载数据
     */
    protected abstract void loadData();

    /**
     *
     * 下午2:42:02
     *
     * @author zhangyh2 BaseFragment.java TODO 初始化坚挺事件
     */
    protected abstract void initListener();


    //字体
    public void setFontData(List<FontRecover> data) {
    }

    public void setFontListener(TextFontListener listener) {
    }

    //背景
    public void setBgData(List<Integer> data) {
    }

    public void setBgListener(TextBackgroundListener listener) {
    }

    //对齐
    public void setAlignData(List<AlignmentThickness> data) {
    }

    public void setAlignListener(TextAlignListener listener) {
    }

    //样式
    public void setSpacingData(List<FontSizeSpacing> data) {
    }

    public void setSpacingListener(TextSpacingListener listener) {
    }
}
