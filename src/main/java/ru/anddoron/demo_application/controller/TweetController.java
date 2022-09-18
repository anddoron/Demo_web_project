package ru.anddoron.demo_application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.anddoron.demo_application.dto.PostTweetDto;
import ru.anddoron.demo_application.model.Tweets;
import ru.anddoron.demo_application.service.MainService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TweetController {
    private final MainService service;

    @PostMapping("/users/{userId}/tweets")
    public Long registration(@PathVariable("userId") Long userId,
                             @RequestBody PostTweetDto dto) {
        return service.postTweet(userId, dto);

    }

    @GetMapping("/users/{userId}/tweets")
    public List<Tweets> list(@PathVariable("userId") Long userId) {
        return service.getTweets(userId);
    }
}
