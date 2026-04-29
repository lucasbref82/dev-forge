package objetos.introducao.medio.entidades;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Funcionario {

    private String nome;
    private String cargo;
    private BigDecimal salario;


    public Funcionario() {

    }

    public Funcionario(String nome, String cargo, BigDecimal salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Funcionario that)) return false;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getCargo(), that.getCargo()) && Objects.equals(getSalario(), that.getSalario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCargo(), getSalario());
    }


    @Override
    public String toString() {
        return nome + " - " + cargo + " - R$ " + salario.setScale(2, RoundingMode.HALF_EVEN);
    }
}
