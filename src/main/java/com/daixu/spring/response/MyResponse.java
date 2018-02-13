package com.daixu.spring.response;

/**
 * Created by DW-Home on 18/1/29.
 */
public class MyResponse<T> {

  final static String STATS_OK = "OK";
  final static String STATS_ERROR = "ERROR";

  private String staus;
  private String msg;
  private T data;

  public String getStaus() {
    return staus;
  }

  public void setStaus(String staus) {
    this.staus = staus;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
