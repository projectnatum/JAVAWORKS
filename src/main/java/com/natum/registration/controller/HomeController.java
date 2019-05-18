package com.natum.registration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HomeController {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public void displayHome(HttpServletResponse httpServletResponse) throws IOException {
    httpServletResponse.sendRedirect("/info");
  }
}
