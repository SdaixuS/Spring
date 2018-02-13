package com.daixu.spring.response;

/**
 * Created by DW-Home on 18/1/29.
 */
public class MyResponseBuilder {

  public static MyResponse buildOKResponse(Object data) {
    MyResponse response = new MyResponse();
    response.setStaus(MyResponse.STATS_OK);
    response.setData(data);
    return response;
  }

  public static MyResponse buildErrorResponse(Throwable t, Object data) {
    MyResponse response = new MyResponse();
    response.setStaus(MyResponse.STATS_ERROR);
    response.setMsg(t.getMessage());
    response.setData(data);
    return response;
  }

}
