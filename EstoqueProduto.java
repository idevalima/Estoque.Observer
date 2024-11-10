import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque {
    private List<Observer> observers = new ArrayList<>();
    public void setEmEstoque(boolean emEstoque) {
        if (emEstoque) {
            notificarObservadores("Produto em estoque!");
        }
    }

    @Override
    public void registrarObservador(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }
}

