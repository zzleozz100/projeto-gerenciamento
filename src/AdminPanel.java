import javax.swing.*; // Importa todas as classes do pacote javax.swing, que fornece componentes de interface gráfica.
import java.awt.*; // Importa todas as classes do pacote java.awt, que fornece classes para a interface gráfica e layout.

public class AdminPanel extends JFrame { // Declara a classe pública AdminPanel que herda de JFrame.
    public AdminPanel() { // Construtor da classe AdminPanel.
        setTitle("Painel do Administrador"); // Define o título da janela como "Painel do Administrador".
        setSize(400, 300); // Define o tamanho da janela (largura x altura) em pixels.

        JTextArea textArea = new JTextArea("Bem-vindo ao Painel do Administrador.\n\nFuncionários:\n"); // Cria uma área de texto com uma mensagem de boas-vindas e um cabeçalho para funcionários.
        textArea.setEditable(false); // Define a área de texto como não editável, ou seja, o usuário não pode modificar o texto.

        // Adicionando alguns funcionários fictícios
        textArea.append("1. Funcionário A - Salário: R$ 3000\n"); // Adiciona um funcionário fictício à área de texto.
        textArea.append("2. Funcionário B - Salário: R$ 3500\n"); // Adiciona outro funcionário fictício à área de texto.

        JButton backToLoginButton = new JButton("Voltar ao Login"); // Botão para voltar ao login
        backToLoginButton.setPreferredSize(new Dimension(150, 30)); // Define um tamanho preferido para o botão
        backToLoginButton.addActionListener(e -> {
            MainMenu mainMenu = new MainMenu(); // Cria uma nova instância de MainMenu
            mainMenu.setVisible(true); // Torna a tela principal visível
            dispose(); // Fecha o painel do administrador
        });

        JButton addEmployeeButton = new JButton("Adicionar Funcionário"); // Cria um botão com o texto "Adicionar Funcionário".
        addEmployeeButton.addActionListener(e -> { // Adiciona um ActionListener ao botão.
            JOptionPane.showMessageDialog(this, "Funcionalidade ainda não implementada."); // Exibe uma mensagem informando que a funcionalidade ainda não foi implementada.
        });

        JPanel panel = new JPanel(); // Cria um novo painel (JPanel) para organizar os componentes.
        panel.setLayout(new BorderLayout()); // Define o layout do painel como BorderLayout.

        panel.add(new JScrollPane(textArea), BorderLayout.CENTER); // Adiciona a área de texto (dentro de um JScrollPane) ao centro do painel.
        panel.add(addEmployeeButton, BorderLayout.SOUTH); // Adiciona o botão "Adicionar Funcionário" na parte inferior do painel.

        JPanel buttonPanel = new JPanel(); // Cria um novo painel para os botões
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Define o layout como FlowLayout centralizado
        buttonPanel.add(backToLoginButton); // Adiciona o botão "Voltar ao Login" ao novo painel

        panel.add(buttonPanel, BorderLayout.NORTH); // Adiciona o painel dos botões na parte superior do painel principal

        add(panel); // Adiciona o painel à janela principal (JFrame).
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação padrão ao fechar a janela como sair do aplicativo.
    }
}