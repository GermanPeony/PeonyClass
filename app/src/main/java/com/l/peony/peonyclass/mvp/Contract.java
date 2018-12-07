package com.l.peony.peonyclass.mvp;


import com.test.lc.wanandroid.mvp.presenter.IPresenter;
import com.test.lc.wanandroid.mvp.view.IView;

/**
 * 爱生活，爱代码
 * 创建于：2018/10/24 14:31
 * 作 者：T
 * 微信：704003376
 */
public interface Contract {

    interface BaseView extends IView {
        // void setPresenter(BasePresenter basePresenter);
    }

    interface BasePresenter extends IPresenter {

    }

    interface RegiseterPresenter extends IPresenter {

        void regiseter(String phone, String password, String password2);

    }

    interface LoginPresenter extends IPresenter {

        void regiseter(String phone, String password);

    }

    interface HomeLoadMore extends IPresenter {

        void LoadMore(int page);

    }

    interface SearchListLoadMore extends IPresenter {

        void LoadMore(int page, String key);

    }

    interface SocietyListPresenter extends IPresenter {

        void MoreData(int id, int page);

    }

}
