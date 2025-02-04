package academy.devdojo.semanaum.Kenum.teste;

import academy.devdojo.semanaum.Kenum.dominio.Cliente;
import academy.devdojo.semanaum.Kenum.dominio.TipoCliente;
import academy.devdojo.semanaum.Kenum.dominio.TipoPagamento;

public class TipoClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Clodoaldo", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Nicole", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        String csm = "Brahma e Codigo";
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente.getNomeRelatorio());
        System.out.println(tipoCliente2);
    }
}
