package escola;

public class CriarAluno {

	public static void main(String[] args) {
		Aluno Aluno1 = new Aluno();
		Aluno1.nome = "William";
		Aluno1.idade = 21;
		Aluno1.nota1 = 10;
		Aluno1.nota2 = 9.5;
		double media1 = (Aluno1.nota1 + Aluno1.nota2) /2 ;
		
		Aluno Aluno2 = new Aluno();
		Aluno2.nome = "vitor";
		Aluno2.idade = 21;
		Aluno2.nota1 = 3.4;
		Aluno2.nota2 = 9.5; 
		double media2 = (Aluno2.nota1 + Aluno2.nota2) /2 ;
		
		System.out.println(" PRIMEIRO ALUNO : "  );
		System.out.println(" Nome:"  + Aluno1.nome);
		System.out.println(" idade " + Aluno1.idade);
		System.out.println(" nota 1" + Aluno1.nota1);
		System.out.println(" nota 2 " + Aluno1.nota2);
		System.out.println( " media " + media1);
		
		System.out.println();
	

		System.out.println(" SEGUNDO  ALUNO : "  );
		System.out.println(" Nome:"  + Aluno2.nome);
		System.out.println(" idade " + Aluno2.idade);
		System.out.println(" nota 1" + Aluno2.nota1);
		System.out.println(" nota 2 " + Aluno2.nota2);
		System.out.println( " media " + media2);
		
		
		
	
	
	
	}
}
