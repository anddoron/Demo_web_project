package ru.anddoron.demo_application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.anddoron.demo_application.dto.RegistrationDto;
import ru.anddoron.demo_application.service.MainService;
@RequiredArgsConstructor
@RestController
public class RegistrationController {

private final MainService service;

    @PostMapping("/registration")
    public Long registration(@RequestBody RegistrationDto dto) {
       return service.registration(dto);

    }
}
