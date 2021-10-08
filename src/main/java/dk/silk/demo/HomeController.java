package dk.silk.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index() {
    return "";
  }

  @GetMapping("/hejhej")
  public String greeting() {
    return "hej";
  }

  @GetMapping("shout")
  public String xxx() {
    return "greet";
  }
}
