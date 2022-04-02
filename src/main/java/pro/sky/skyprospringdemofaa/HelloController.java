package pro.sky.skyprospringdemofaa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController (HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String hello() {
        return "<b>hello</b>";
    }

    @GetMapping(path="Hello") // в анатацию пишем то, что собираемся передавать в адресную строку.
    public String answerHello(@RequestParam("name") String userName) {   // чтобы принять! Пишем анатицию и имя параметра, тип переменной с название переменной.
                                                                        // ВАЖНО Название параметра и имя в командной строке браузера должны СОВПАДАТЬ!
                                                                        // Имя параметра и название переменной не должны совпадать - ВАЖНО!

        return helloService.answerHello(userName);               // добавляем название переменной, чтобы передать браузеру доп.параметр
    }
}
