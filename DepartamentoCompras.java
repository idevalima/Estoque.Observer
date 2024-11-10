public class DepartamentoCompras implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("Compras: " + mensagem + " Monitorar estoque e planejar novos pedidos.");
    }
}