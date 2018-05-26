package io.cursor.lecture22;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DEV")
@Slf4j
@Service
public class DevService {
    public void toDo() {
        for (int i = 0; i < 10; i++)
            log.info("DEV...");
    }
}
