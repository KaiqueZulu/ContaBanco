import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.criarConta();
        conta.saudacao();
    }
    static class ContaBanco{
        private Integer numero;
        private String agencia, nomeCliente;
        private Float saldo;

        private Integer getNumero() {
            return numero;
        }

        private void setNumero(Integer numero) {
            this.numero = numero;
        }

        private String getAgencia() {
            return agencia;
        }

        private void setAgencia(String agencia) {
            this.agencia = agencia;
        }

        private String getNomeCliente() {
            return nomeCliente;
        }

        private void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }

        private Float getSaldo() {
            return saldo;
        }

        private void setSaldo(Float saldo) {
            this.saldo = saldo;
        }

        public void criarConta(){
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

          System.out.println("Digite a conta: ");
            this.setNumero(scanner.nextInt());
            System.out.println("Digite a agência: ");
            this.setAgencia(scanner.next());
            System.out.println("Digite o nome do cliente: ");
            this.setNomeCliente(scanner.next());

            scanner.nextLine();

            System.out.println("Digite o saldo do cliente: ");
            this.setSaldo(scanner.nextFloat());
        }

        public void saudacao(){
            System.out.println("Olá " + this.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.getAgencia() + ", conta " + this.getNumero() + " e seu saldo " + this.getSaldo() + " já está disponível para saque.");
        }
    }
}
