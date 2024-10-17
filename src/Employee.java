public class Employee { // Declara a classe pública Employee.
    private String name; // Variável que armazena o nome do funcionário.
    private double salary; // Variável que armazena o salário do funcionário.
    private int hoursWorked; // Variável que armazena as horas trabalhadas pelo funcionário.

    public Employee(String name, double salary) { // Construtor da classe Employee que recebe o nome e o salário como parâmetros.
        this.name = name; // Atribui o nome recebido ao atributo name da classe.
        this.salary = salary; // Atribui o salário recebido ao atributo salary da classe.
        this.hoursWorked = 0; // Inicializa horas trabalhadas como 0.
    }

    // Getters
    public String getName() { // Método getter para obter o nome do funcionário.
        return name; // Retorna o nome do funcionário.
    }

    public double getSalary() { // Método getter para obter o salário do funcionário.
        return salary; // Retorna o salário do funcionário.
    }

    public int getHoursWorked() { // Método getter para obter as horas trabalhadas pelo funcionário.
        return hoursWorked; // Retorna as horas trabalhadas pelo funcionário.
    }

    // Setters
    public void setSalary(double salary) { // Método setter para definir o salário do funcionário.
        this.salary = salary; // Atribui o novo salário ao atributo salary da classe.
    }

    public void setHoursWorked(int hours) { // Método setter para definir as horas trabalhadas pelo funcionário.
        this.hoursWorked = hours; // Atribui as novas horas trabalhadas ao atributo hoursWorked da classe.
    }

    // Método para exibir informações do funcionário
    public String displayInfo() { // Método que retorna uma string com as informações do funcionário formatadas.
        return "Nome: " + name + "\nSalário: R$ " + salary + "\nHoras Trabalhadas: " + hoursWorked; 
        // Retorna uma string contendo o nome, salário e horas trabalhadas do funcionário.
    }
}