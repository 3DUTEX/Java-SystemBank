import javax.swing.JOptionPane;

public class Principal {
	static ContaCorrente c1 =  new ContaCorrente("George");
    static int op = 0;
	public static void main(String[] args) {
		while(op != 9) {
			montaMenuInicial();
		}
		

	}
	


	private static void montaMenuInicial() {
		String menuInicial = "Escolha uma opção:\n"
				+ "1 - Extrato \n"
				+ "2 - Depositar\n"
				+ "3 - Sacar\n"
				+ "4 - Transeferir\n"
				+ "9 - Sair\n";
		
		op = Integer.parseInt(JOptionPane.showInputDialog(menuInicial));
		
		switch(op) {
		case 1:
			JOptionPane.showMessageDialog(null, c1.extrato());
			break;
		case 2:
			double valorDep = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor a ser transferido?"));
			c1.depositar(valorDep);
			break;
		case 3: 
			double valorSac = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor a ser sacado?"));
			
			if(c1.sacar(valorSac)) {
				JOptionPane.showMessageDialog(null, "Saldo retirado com sucesso!");
			}else {
				JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
			}
			break;
		case 4:
			ContaCorrente contaDestino = new ContaCorrente("Sandra");
			
			double valorTran = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor a ser transferido?"));
			if(c1.transferir(valorTran, contaDestino)) {
				JOptionPane.showMessageDialog(null, "Saldo transferido com sucesso!");
			}else {
				JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
			}
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Encerrando!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida!");
			break;
		}
		
	}

}
