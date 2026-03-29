public abstract class Employee {
    private String firstName;
    private String lastName;
    private String cpf;

    public Employee(String firstName, String lastName, String cpf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
    }

    // Método abstrato
    public abstract double earnings();

    // Getters e Setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s %s\nCPF: %s", firstName, lastName, cpf);
    }
}