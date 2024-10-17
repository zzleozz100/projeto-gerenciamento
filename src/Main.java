import javax.swing.*; // Importa todas as classes do pacote javax.swing, que fornece componentes de interface gráfica.

public class Main { // Declara a classe pública Main.
    public static void main(String[] args) { // Método principal que é o ponto de entrada do programa.
        SwingUtilities.invokeLater(() -> { // Enfileira a tarefa para ser executada na thread de despacho de eventos do Swing.
            MainMenu mainMenu = new MainMenu(); // Cria uma nova instância da classe MainMenu, que representa a tela inicial do aplicativo.
            mainMenu.setVisible(true); // Define a visibilidade da janela MainMenu como verdadeira, exibindo-a na tela.
        });
    }
}