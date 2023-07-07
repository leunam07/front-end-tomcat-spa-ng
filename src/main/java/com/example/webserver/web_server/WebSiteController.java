package com.example.webserver.web_server;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebSiteController implements ErrorController {

  private static final String ERROR_PATH = "/error";

  @RequestMapping(value = ERROR_PATH)
  public String handleError() {
    return "/index.html";
  }
}
