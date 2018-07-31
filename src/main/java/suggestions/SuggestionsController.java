package suggestions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuggestionsController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
