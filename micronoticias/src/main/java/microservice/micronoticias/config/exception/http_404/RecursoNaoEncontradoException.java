package microservice.micronoticias.config.exception.http_404;

import java.io.Serial;

public abstract sealed class RecursoNaoEncontradoException extends RuntimeException
  permits EditoriaNaoEncontradaException {

  @Serial
  private static final long serialVersionUID = 1L;

  protected RecursoNaoEncontradoException(String mensagem) {
    super(mensagem);
  }
}

