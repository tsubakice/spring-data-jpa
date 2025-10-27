package org.qiaice.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.qiaice.model.Video;
import org.qiaice.repository.VideoRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class MainRunner implements ApplicationRunner {
    private final VideoRepository videoRepository;

    @Override
    public void run(ApplicationArguments args) {
        videoRepository.saveAll(List.of(new Video(), new Video()))
                .forEach(video -> log.info("video info: {}", video));
    }
}
