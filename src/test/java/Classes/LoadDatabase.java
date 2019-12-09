package Classes;

import java.util.Date;
import java.sql.Timestamp;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(MessageRepository repository) {
    return args -> {
      log.info("Preloading " + repository.save(new Message(new Timestamp((new Date()).getTime()), "Salut Mec ça fait plaisir")));
      log.info("Preloading " + repository.save(new Message(new Timestamp((new Date()).getTime()), "Ouais yo le rap")));
    };
  }
}