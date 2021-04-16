package com.announce.common.notice.api;

public interface DataCallBack {
    void success(String msg, String result);

    void fail(String msg, int errorCode);
}
