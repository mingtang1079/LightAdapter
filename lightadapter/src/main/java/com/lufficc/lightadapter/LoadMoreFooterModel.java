package com.lufficc.lightadapter;

import android.support.annotation.DrawableRes;

/**
 * Created by lufficc on 2016/8/31.
 */

public class LoadMoreFooterModel {
    private String noMoreMsg = "Loading finished";
    private String loadingMsg = "Loading";
    private String errorMsg = "Oops,error occurred";
    private boolean fullSpan = false;
    @DrawableRes
    private int noMoreIcon = R.mipmap.ic_success;
    @DrawableRes
    private int errorIcon = R.mipmap.ic_error;
    private LoadMoreFooterViewHolderProvider.FooterViewHolder footerViewHolder;

    private LoadMoreListener loadMoreListener;

    public OnFooterClickListener getOnFooterClickListener() {
        return onFooterClickListener;
    }

    public void setOnFooterClickListener(OnFooterClickListener onFooterClickListener) {
        this.onFooterClickListener = onFooterClickListener;
    }

    private OnFooterClickListener onFooterClickListener;

    @DrawableRes
    public int getErrorIcon() {
        return errorIcon;
    }

    public void setErrorIcon(@DrawableRes int errorIcon) {
        this.errorIcon = errorIcon;
    }

    @DrawableRes
    public int getNoMoreIcon() {
        return noMoreIcon;
    }

    public void setNoMoreIcon(@DrawableRes int noMoreIcon) {
        this.noMoreIcon = noMoreIcon;
    }

    public void setLoadMoreListener(LoadMoreListener listener) {
        this.loadMoreListener = listener;
    }

    public LoadMoreListener getLoadMoreListener() {
        return loadMoreListener;
    }

    LoadMoreFooterViewHolderProvider.FooterViewHolder getFooterViewHolder() {
        return footerViewHolder;
    }

    void setFooterViewHolder(LoadMoreFooterViewHolderProvider.FooterViewHolder footerViewHolder) {
        this.footerViewHolder = footerViewHolder;
    }

    public String getLoadingMsg() {
        return loadingMsg;
    }

    public void setLoadingMsg(String loadingMsg) {
        this.loadingMsg = loadingMsg;
    }

    public String getNoMoreMsg() {
        return noMoreMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setNoMoreMsg(String noMoreMsg) {
        this.noMoreMsg = noMoreMsg;
    }

    public void noMoreData() {
        if (footerViewHolder != null) {
            footerViewHolder.noMoreData(noMoreMsg, noMoreIcon);
        }
    }
    public void noMoreData(String noMoreMsg) {
        if (footerViewHolder != null) {
            footerViewHolder.noMoreData(noMoreMsg, noMoreIcon);
        }
    }

    public void errorOccur() {
        if (footerViewHolder != null) {
            footerViewHolder.errorOccur(errorMsg, errorIcon);
        }
    }
    public void errorOccur(String errorMsg) {
        if (footerViewHolder != null) {
            footerViewHolder.errorOccur(errorMsg, errorIcon);
        }
    }
    public boolean isFullSpan() {
        return fullSpan;
    }

    public void setFullSpan(boolean fullSpan) {
        this.fullSpan = fullSpan;
    }

    /**
     * tell the adapter there will be more data ,so the progress will show,and the load more callback will be invoked.
     */
    public void canLoadMore() {
        if (footerViewHolder != null) {
            footerViewHolder.canLoadMore(loadingMsg);
        }
    }
    public void canLoadMore(String loadingMsg) {
        if (footerViewHolder != null) {
            footerViewHolder.canLoadMore(loadingMsg);
        }
    }
    /**
     * set visibility gone
     */
    public void hideFooter() {
        if (footerViewHolder != null) {
            footerViewHolder.hideFooter();
        }
    }

    public interface LoadMoreListener {
        void onLoadMore();
    }

    public interface OnFooterClickListener {
        void onFooterClick(int state);
    }
}
