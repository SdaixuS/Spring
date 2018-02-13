package com.daixu.spring.exceptionHandler;

import com.daixu.spring.response.MyResponse;
import com.daixu.spring.response.MyResponseBuilder;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by DW-Home on 18/1/28.
 */

@ControllerAdvice(basePackages = {"com.daixu.spring.web"})
public class MyGlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(Throwable.class)
  public ResponseEntity defaultErrorHandler(HttpServletRequest request, Throwable t) {
    MyResponse response = MyResponseBuilder.buildErrorResponse(t,
        "Exception happened when " + request.getRequestURI());
    return new ResponseEntity(response, getStatus(request));
  }

  private HttpStatus getStatus(HttpServletRequest request) {
    Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
    if (statusCode == null) {
      return HttpStatus.INTERNAL_SERVER_ERROR;
    }
    return HttpStatus.valueOf(statusCode);
  }

}
