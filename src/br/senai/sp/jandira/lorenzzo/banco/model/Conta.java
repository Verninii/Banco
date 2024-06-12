package br.senai.sp.jandira.lorenzzo.banco.model;

public class Conta {
    private Agencia agencia;
    private String numero;
    private double saldo;
    private Cliente cliente;
    private TipoConta tipoConta;

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean sacar(double valor) {
        if (saldo > valor && valor > 0) {
            saldo -= valor;
            System.out.printf("\nSacando R$ %s da conta %s.\n",valor,cliente.getNome());
            System.out.printf("Saldo atual: R$ %s\n",saldo);
            return true;
        } else {
            System.out.println("SALDO INSUFICIENTE!");
            return false;
        }
    }
    public void depositar(double valor) {
        if (valor > 0 ) {
            this.saldo += valor;
            System.out.printf("\nDepositando R$ %s na conta %s.\n",valor,cliente.getNome());
            System.out.printf("Saldo atual: R$ %s\n",saldo);
        } else {
            System.out.println("DEPOSITO INVÁLIDO");

        }
    }
    public void transferir(double valor,Conta contaDestino){
        System.out.printf("\nTransferindo R$ %s da conta %s para a conta %s.\n",valor,cliente.getNome(),contaDestino.getCliente().getNome());
        if (sacar(valor))
        {
            contaDestino.depositar(valor);
        } else{
            System.out.printf("\nA transferência não ocorreu por falta de saldo na conta");
        }
    }
}