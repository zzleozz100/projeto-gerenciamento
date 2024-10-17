import javax.swing.*; // Importa todas as classes do pacote javax.swing, que fornece componentes de interface gráfica.
import java.awt.*; // Importa todas as classes do pacote java.awt, que fornece classes para a interface gráfica e layout.

public class EmployeePanel extends JFrame { // Declara a classe pública EmployeePanel que herda de JFrame.
    public EmployeePanel() { // Construtor da classe EmployeePanel.
        setTitle("Painel do Funcionário"); // Define o título da janela como "Painel do Funcionário".
        setSize(400, 300); // Define o tamanho da janela (largura x altura) em pixels.

        JTextArea textArea = new JTextArea("Bem-vindo ao Painel do Funcionário.\n\n"); // Cria uma área de texto com uma mensagem de boas-vindas.
        textArea.setEditable(false); // Define a área de texto como não editável, ou seja, o usuário não pode modificar o texto.

        // Informações fictícias do funcionário
        textArea.append("Nome: Funcionário Exemplo\n"); // Adiciona o nome fictício do funcionário à área de texto.
        textArea.append("Salário: R$ 3000\n"); // Adiciona o salário fictício do funcionário à área de texto.
        textArea.append("Horas Trabalhadas: 160\n"); // Adiciona as horas trabalhadas fictícias do funcionário à área de texto.

        JButton backToLoginButton = new JButton("Voltar ao Login"); // Botão para voltar ao login
        backToLoginButton.addActionListener(e -> {
            MainMenu mainMenu = new MainMenu(); // Cria uma nova instância de MainMenu
            mainMenu.setVisible(true); // Torna a tela principal visível
            dispose(); // Fecha o painel do funcionário
        });

        JPanel panel = new JPanel(); // Cria um novo painel (JPanel) para organizar os componentes.
        panel.setLayout(new BorderLayout()); // Define o layout do painel como BorderLayout.

        panel.add(new JScrollPane(textArea), BorderLayout.CENTER); // Adiciona a área de texto (dentro de um JScrollPane) ao centro do painel.
        panel.add(backToLoginButton, BorderLayout.SOUTH); // Adiciona o botão "Voltar ao Login" na parte inferior do painel.

        add(panel); // Adiciona o painel à janela principal (JFrame).
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação padrão ao fechar a janela como sair do aplicativo.
    }
}