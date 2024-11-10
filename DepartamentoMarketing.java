public class DepartamentoMarketing implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("Marketing: " + mensagem + " Produto disponivel divulgar nas redes sociais.");
    }
}