package com.springai.demo.controller;

import com.springai.demo.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/openai/api")
public class OpenAIChatController {


    private final OpenAIChatService openAIChatService;

    public OpenAIChatController(OpenAIChatService openAIChatService) {
        this.openAIChatService = openAIChatService;
    }


    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        return openAIChatService.chatWithOpenAILLM(message);
    }
}
