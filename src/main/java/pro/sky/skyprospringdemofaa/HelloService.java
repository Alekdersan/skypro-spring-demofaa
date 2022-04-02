package pro.sky.skyprospringdemofaa;

import org.springframework.web.bind.annotation.RequestParam;

public interface HelloService {
    String hello(); // копируем сигнатуры
    String answerHello(String userName);
}
