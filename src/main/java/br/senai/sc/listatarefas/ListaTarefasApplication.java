package br.senai.sc.listatarefas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.listatarefas.domain.Tarefa;
import br.senai.sc.listatarefas.repositories.TarefaRepository;

@SpringBootApplication
public class ListaTarefasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ListaTarefasApplication.class, args);
	}

	@Autowired
	private TarefaRepository tarefaRepository;

	@Override
	public void run(String... args) throws Exception {

		Tarefa t1 = new Tarefa(null, "Fazer chamada", false);
		Tarefa t2 = new Tarefa(null, "Cozinhar", false);
		Tarefa t3 = new Tarefa(null, "Comprar Café", false);
		Tarefa t4 = new Tarefa(null, "Comprar CD", false);
		tarefaRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}

}
