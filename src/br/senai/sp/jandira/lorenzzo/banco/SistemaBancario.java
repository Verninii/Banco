package br.senai.sp.jandira.lorenzzo.banco;
import br.senai.sp.jandira.lorenzzo.banco.model.Agencia;
import br.senai.sp.jandira.lorenzzo.banco.model.Cliente;
import br.senai.sp.jandira.lorenzzo.banco.model.Conta;
import br.senai.sp.jandira.lorenzzo.banco.model.TipoConta;

public class SistemaBancario {

    public static void main(String[] args) {


        Cliente cliente01 = new Cliente();
        cliente01.setNome("Carlos Alberto");
        cliente01.setTelefone("(11)98654-5555");
        cliente01.setCpf("123.456.789-99");

        Agencia agencia01 = new Agencia();
        agencia01.setNumero("123-4");
        agencia01.setEndereco("Av. Brasil, 500 - Jandira/SP");
        agencia01.setGerente("Silvio Santos");

        Conta conta01 = new Conta();
        conta01.setCliente(cliente01);
        conta01.setAgencia(agencia01);
        conta01.setNumero("456-01");
        conta01.depositar(100);
        conta01.setTipoConta(TipoConta.CORRENTE);

        //SACAR 100 reais da CONTA01
        conta01.sacar(80);

        //MOSTRAR SALDO DA CONTA01
        System.out.println(conta01.getSaldo());

        conta01.depositar(50);

        System.out.println(conta01.getSaldo());
    }
}
