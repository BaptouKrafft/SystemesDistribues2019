package Classes;

import lombok.Data;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Message {

  private @Id @GeneratedValue Long id;
  private Timestamp timestamp;
  private String contenu;

  Message() {}

  Message(Timestamp timestamp, String contenu) {
    this.timestamp = timestamp;
    this.contenu = contenu;
  }
}