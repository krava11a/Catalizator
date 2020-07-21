package kan.catalizator.controller;

import kan.catalizator.domain.Message;
import kan.catalizator.service.MessageService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/controller")
public class MainController {

    private final MessageService service;

    public MainController(MessageService service) {
        this.service = service;
    }


    @GetMapping
    public Flux<Message> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count
    ){
        return service.list();
    }

    @PostMapping
    public Mono<Message> add(@RequestBody Message message){
        return service.addOne(message);
    }
}
