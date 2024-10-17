import javax.swing.*; // Importa todas as classes do pacote javax.swing, que fornece componentes de interface gráfica.
import java.awt.*; // Importa todas as classes do pacote java.awt, que fornece classes para a interface gráfica e layout.
import java.awt.event.ActionEvent; // Importa a classe ActionEvent, que representa eventos de ação (como cliques em botões).
import java.awt.event.ActionListener; // Importa a interface ActionListener, que deve ser implementada para tratar eventos de ação.

public class MainMenu extends JFrame { // Declara a classe pública MainMenu que herda de JFrame.
    public MainMenu() { // Construtor da classe MainMenu.
        setTitle("Menu Principal"); // Define o título da janela como "Menu Principal".
        setSize(300, 150); // Define o tamanho da janela (largura x altura) em pixels.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação padrão ao fechar a janela como sair do aplicativo.
        setLocationRelativeTo(null); // Centraliza a janela na tela.

        JPanel panel = new JPanel(); // Cria um novo painel (JPanel) para organizar os componentes.
        panel.setLayout(new GridLayout(2, 1)); // Define o layout do painel como GridLayout com 2 linhas e 1 coluna.

        JButton adminButton = new JButton("Login como Administrador"); // Cria um botão para login como administrador.
        JButton employeeButton = new JButton("Login como Funcionário"); // Cria um botão para login como funcionário.

        adminButton.addActionListener(new ActionListener() { // Adiciona um ActionListener ao botão de administrador.
            @Override
            public void actionPerformed(ActionEvent e) { // Método chamado quando o botão é clicado.
                LoginFrame loginFrame = new LoginFrame("admin"); // Cria uma nova instância de LoginFrame para administrador.
                loginFrame.setVisible(true); // Torna a tela de login visível.
                dispose(); // Fecha a tela do menu principal.
            }
        });

        employeeButton.addActionListener(new ActionListener() { // Adiciona um ActionListener ao botão de funcionário.
            @Override
            public void actionPerformed(ActionEvent e) { // Método chamado quando o botão é clicado.
                LoginFrame loginFrame = new LoginFrame("funcionario"); // Cria uma nova instância de LoginFrame para funcionário.
                loginFrame.setVisible(true); // Torna a tela de login visível.
                dispose(); // Fecha a tela do menu principal.
            }
        });

        panel.add(adminButton); // Adiciona o botão de administrador ao painel.
        panel.add(employeeButton); // Adiciona o botão de funcionário ao painel.

        add(panel); // Adiciona o painel à janela principal (JFrame).
    }
}