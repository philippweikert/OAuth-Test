package de.neuefische.oauthtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/output")
public class OutputController {

    @GetMapping("/{input}")
    private String getOutInput (@PathVariable String input) {
        return "Sanfte Grüße, " + input;
    }
}
