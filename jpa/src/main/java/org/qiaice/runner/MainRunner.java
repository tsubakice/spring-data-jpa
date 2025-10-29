package org.qiaice.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.qiaice.repository.AuthorRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MainRunner implements ApplicationRunner {
    private final AuthorRepository authorRepository;

    @Override
    public void run(ApplicationArguments args) {
        authorRepository.findAllByEmailContaining("life")
                .forEach(author -> log.info(author.getEmail()));
        authorRepository.findAll();
    }
}
