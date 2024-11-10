public class Principal {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        Observer vendas = new DepartamentoVendas();
        Observer marketing = new DepartamentoMarketing();
        Observer compras = new DepartamentoCompras();

        estoqueProduto.registrarObservador(vendas);
        estoqueProduto.registrarObservador(marketing);
        estoqueProduto.registrarObservador(compras);

        System.out.println("Reabastecendo o produto...");
        estoqueProduto.setEmEstoque(true);
    }
}

