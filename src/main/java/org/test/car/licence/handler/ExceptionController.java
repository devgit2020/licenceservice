package org.test.car.licence.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
   @ExceptionHandler(value = Exception.class)
   public ResponseEntity<Object> exception(Exception exception) {
      return new ResponseEntity<>("\"Sorry, we can't tell you if this car is ready to sell, please call us at 033 123 45 67", HttpStatus.NOT_FOUND);
   }
}
