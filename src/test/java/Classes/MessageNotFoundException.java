package Classes;

class MessageNotFoundException extends RuntimeException {

  MessageNotFoundException(Long id) {
    super("Could not find message " + id);
  }
}