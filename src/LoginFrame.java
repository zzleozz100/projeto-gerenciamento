import javax.swing.*; // Importa todas as classes do pacote javax.swing, que fornece componentes de interface gráfica.
import java.awt.event.ActionEvent; // Importa a classe ActionEvent, que representa eventos de ação (como cliques em botões).
import java.awt.event.ActionListener; // Importa a interface ActionListener, que deve ser implementada para tratar eventos de ação.

public class LoginFrame extends JFrame { // Declara a classe pública LoginFrame que herda de JFrame.
    private JTextField txtUsername; // Campo de texto para entrada do nome de usuário.
    private JPasswordField txtPassword; // Campo de texto para entrada da senha.
    private String userType; // Variável que armazena o tipo de usuário ("admin" ou "funcionario").
    private JButton backButton; // Botão de voltar.

    public LoginFrame(String userType) { // Construtor da classe LoginFrame que recebe o tipo de usuário como parâmetro.
        this.userType = userType; // Define o tipo de usuário.
        setTitle("Login - " + (userType.equals("admin") ? "Administrador" : "Funcionário")); // Define o título da janela com base no tipo de usuário.
        setSize(300, 200); // Define o tamanho da janela (largura x altura) em pixels.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação padrão ao fechar a janela como sair do aplicativo.
        setLocationRelativeTo(null); // Centraliza a janela na tela.
        
        JPanel panel = new JPanel(); // Cria um novo painel (JPanel) para organizar os componentes.
        add(panel); // Adiciona o painel à janela principal (JFrame).
        placeComponents(panel); // Chama o método para colocar os componentes no painel.
    }

    private void placeComponents(JPanel panel) { // Método para definir e organizar os componentes dentro do painel.
        panel.setLayout(null); // Define o layout do painel como nulo, permitindo posicionamento absoluto dos componentes.

        JLabel userLabel = new JLabel("Usuário:"); // Cria um rótulo (label) para o campo de usuário.
        userLabel.setBounds(10, 20, 80, 25); // Define a posição e tamanho do rótulo (x, y, largura, altura).
        panel.add(userLabel); // Adiciona o rótulo ao painel.

        txtUsername = new JTextField(20); // Cria um campo de texto para entrada do nome de usuário com capacidade para 20 caracteres.
        txtUsername.setBounds(100, 20, 165, 25); // Define a posição e tamanho do campo de texto.
        panel.add(txtUsername); // Adiciona o campo de texto ao painel.

        JLabel passwordLabel = new JLabel("Senha:"); // Cria um rótulo (label) para o campo de senha.
        passwordLabel.setBounds(10, 50, 80, 25); // Define a posição e tamanho do rótulo.
        panel.add(passwordLabel); // Adiciona o rótulo ao painel.

        txtPassword = new JPasswordField(); // Cria um campo de senha que oculta a entrada do usuário.
        txtPassword.setBounds(100, 50, 165, 25); // Define a posição e tamanho do campo de senha.
        panel.add(txtPassword); // Adiciona o campo de senha ao painel.

        JButton loginButton = new JButton("Entrar"); // Cria um botão com o texto "Entrar".
        loginButton.setBounds(10, 80, 80, 25); // Define a posição e tamanho do botão.
        panel.add(loginButton); // Adiciona o botão ao painel.

        backButton = new JButton("Voltar"); // Cria um botão com o texto "Voltar".
        backButton.setBounds(100, 80, 80, 25); // Define a posição e tamanho do botão de voltar.
        backButton.setVisible(true); // O botão é visível por padrão.
        panel.add(backButton); // Adiciona o botão ao painel.

        loginButton.addActionListener(new ActionListener() { // Adiciona um ActionListener ao botão "Entrar".
            @Override
            public void actionPerformed(ActionEvent e) { // Método chamado quando o botão é clicado.
                authenticate(txtUsername.getText(), String.valueOf(txtPassword.getPassword())); // Chama o método authenticate com os dados inseridos pelo usuário.
            }
        });

        backButton.addActionListener(new ActionListener() { // Adiciona um ActionListener ao botão "Voltar".
            @Override
            public void actionPerformed(ActionEvent e) { // Método chamado quando o botão é clicado.
                MainMenu mainMenu = new MainMenu(); // Cria uma nova instância de MainMenu para voltar à tela principal.
                mainMenu.setVisible(true); // Torna a tela principal visível.
                dispose(); // Fecha a tela de login atual.
            }
        });
    }

    private void authenticate(String username, String password) { // Método que autentica as credenciais fornecidas pelo usuário.
        if ("admin".equals(username) && "admin".equals(password) && "admin".equals(userType)) { 
            AdminPanel adminPanel = new AdminPanel(); // Cria uma nova instância da tela do administrador se as credenciais estiverem corretas.
            adminPanel.setVisible(true); 
            this.dispose(); // Fecha a tela de login.
        } else if ("func".equals(username) && "func".equals(password) && "funcionario".equals(userType)) {
            EmployeePanel employeePanel = new EmployeePanel(); // Cria uma nova instância da tela do funcionário se as credenciais estiverem corretas.
            employeePanel.setVisible(true);
            this.dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE); 
            // Exibe uma mensagem de erro se as credenciais estiverem incorretas. 
        }
    }
}