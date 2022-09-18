package ru.anddoron.demo_application.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.anddoron.demo_application.dto.PostTweetDto;
import ru.anddoron.demo_application.dto.RegistrationDto;
import ru.anddoron.demo_application.model.Tweets;
import ru.anddoron.demo_application.model.Users;
import ru.anddoron.demo_application.repository.TweetsRepository;
import ru.anddoron.demo_application.repository.UsersRepository;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MainService {
    private final UsersRepository usersRepository;

    private final TweetsRepository tweetsRepository;
    @Transactional
    public Long registration(RegistrationDto dto) {
        Users result = usersRepository.save(Users.builder()
                .name(dto.getName())
                .password(dto.getPassword())
                .build());
        return result.getId();
    }
    @Transactional
    public Long postTweet(Long userId, PostTweetDto dto) {
        Tweets result = tweetsRepository.save(Tweets.builder()
                        .userId(userId)
                        .content(dto.getContent())
                .build());
        return result.getId();
    }

    public List<Tweets> getTweets(Long userId) {
       return tweetsRepository.findAllByUserId(userId);
    }
}
