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

        Cliente cliente02 = new Cliente();
        cliente02.setNome("Flávia Dias");
        cliente02.setTelefone("(18)98888-8745");
        cliente02.setCpf("321.654.987-00");

        Agencia agencia01 = new Agencia();
        agencia01.setNumero("123-04");
        agencia01.setEndereco("Av. Brasil, 500 - Jandira/SP");
        agencia01.setGerente("Silvio Santos");

        Conta conta01 = new Conta();
        conta01.setCliente(cliente01);
        conta01.setAgencia(agencia01);
        conta01.setNumero("456-01");
        conta01.depositar(30);
        conta01.setTipoConta(TipoConta.CORRENTE);

        Conta conta02 = new Conta();
        conta02.setCliente(cliente02);
        conta02.setAgencia(agencia01);
        conta02.setNumero("999-01");
        conta02.depositar(50);
        conta02.setTipoConta(TipoConta.POUPANCA);



        //SACAR 100 reais da CONTA01
        conta01.sacar(10);

        //MOSTRAR SALDO DA CONTA01
        //System.out.println(conta01.getSaldo());

        conta01.depositar(50);

        //Transferir 10 REAIS PARA CONTA DA FLÁVIA
        conta01.transferir(100,conta02);

    }
}
