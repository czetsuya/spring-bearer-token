package com.czetsuyatech.springbearertoken.controller;

import com.czetsuyatech.springbearertoken.interceptor.BearerTokenWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

  private BearerTokenWrapper tokenWrapper;

  public BookController(BearerTokenWrapper tokenWrapper) {
    this.tokenWrapper = tokenWrapper;
  }

  @GetMapping
  public String getBooks() {

    System.out.println("token=" + tokenWrapper.getToken());

    return "books";
  }
}
