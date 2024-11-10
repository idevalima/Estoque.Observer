public interface Estoque {
    void registrarObservador (Observer Observer);
    void removerObservador (Observer Observer);
    void notificarObservadores (String mensagem);
}
