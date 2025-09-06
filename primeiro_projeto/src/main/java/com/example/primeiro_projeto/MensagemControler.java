package com.example.primeiro_projeto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class MensagemControler {
  @GetMapping("/hello")
  public String hello() {
    return "Minha primeira mensagem com Spring Boot!";
  }
  
  @GetMapping("/home")
  public String index(){
    return "Pagina Inicial";
  }

  @GetMapping("/mensagem")
  public String mensagem(){
    return "Minha Mensagem";
  }
}
