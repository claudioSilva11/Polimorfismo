package funcionarios;

public class App {
    public static void main(String[] args) {
       Funcionario funcionario1 = new Funcionario("Eduardo", "88526545", "28/06/2000", "10/08/2019", 1700);
       Funcionario funcionario2 = new Funcionario("Maria", "88534545", "28/06/2003", "25/08/2019", 1700);
       ChefeDeDepartamento chefe = new ChefeDeDepartamento(funcionario1, "Departamento de TI", "10/04/2020");
       PacienteClinica paciente = new PacienteClinica("Jos�", "3454", "01/03/1990", "Sua Sa�de");

       System.out.println(funcionario1.toString()+"\nEmpr�stimo: "+ calculaEmprestimo(funcionario1));
       System.out.println(funcionario2.toString()+"\nEmpr�stimo: "+ calculaEmprestimo(funcionario2));
       System.out.println(chefe.toString()+"\nEmpr�stimo: "+ calculaEmprestimo(chefe));
       System.out.println(paciente.toString()+"\nEmpr�stimo: "+ calculaEmprestimo(paciente));
    }
    
    public static double calculaEmprestimo(Pessoa p) {
    	return 1000;
    }
    
    public static double calculaEmprestimo(Funcionario f) {
    	double emprestimo = 0;
    	if (f instanceof ChefeDeDepartamento) {
    		emprestimo = 4*(f.qualSalario());
    	}
    	if (f instanceof Funcionario) {
    		emprestimo = 2*(f.qualSalario());
    	}
    	
    	return emprestimo;
    }
}
