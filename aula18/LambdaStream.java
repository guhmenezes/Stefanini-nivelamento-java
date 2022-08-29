package com.stefanini.aula18;

import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class LambdaStream {
	
	static int gerarIdade(int min, int max) {
		return new SplittableRandom().nextInt(min,max);
	}

	public static void main(String[] args) {
		// EXPRESSÃO LAMBDA PARECIDA COM ARROW FUNCTION
		List<String> listaNomes = Arrays.asList("João", "Maria", "José", "Pedro", "Gustavo");
		System.out.println("Lista de Nomes\n");
		listaNomes.forEach((n) -> System.out.println(n));
		
		// Stream retorna um stream, cria uma nova "lista"(cópia). Precisa converter para collect e armazenar em outra variavel list
		// MAP sempre retorna uma stream do mesmo tamanho da "original"
		System.out.println("\nLista de Pessoas\n");
		List<Pessoa> listaPessoas = listaNomes.stream().map((n) -> new Pessoa(n, gerarIdade(15,30))).collect(Collectors.toList());
		listaPessoas.forEach((p) -> System.out.println(p.getNome() + ", " + p.getIdade() + " anos"));
		
		// FILTER retorna um stream "lista" filtrada pelos parametros passados
		System.out.println("\nLista de Pessoas Maiores de Idade\n");
		List<Pessoa> listaPessoasMaiores = listaPessoas.stream().filter((p) -> p.getIdade() >= 18).collect(Collectors.toList());
		listaPessoasMaiores.forEach((p) -> System.out.println(p.getNome() + " tem " + p.getIdade() +" anos portanto é Maior de idade"));
		
		// SORTED retorna um stream "lista" ordenada
		System.out.println("\nLista de Pessoas Ordenada Crescente\n");
		List<Pessoa> listaPessoasOrdenada = listaPessoasMaiores.stream().sorted((p1,p2) -> p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
		listaPessoasOrdenada.forEach((p) -> System.out.println(p.getNome() + " - " + p.getIdade()));
		
		System.out.println("\nLista de Pessoas Ordenada Decrescente\n");
		List<Pessoa> listaPessoasOrdenada2 = listaPessoasMaiores.stream().sorted((p1,p2) -> p2.getIdade() - p1.getIdade()).collect(Collectors.toList());
		listaPessoasOrdenada2.forEach((p) -> System.out.println(p.getNome() + " - " + p.getIdade()));
		
		System.out.print("\nSoma das idades: ");
		Integer totalIdade = listaPessoasOrdenada.stream().map((p) -> p.getIdade()).reduce(0, (somaIdade, idade) -> somaIdade += idade);
		System.out.print(totalIdade);
	}

}
