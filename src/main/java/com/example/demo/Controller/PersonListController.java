package com.example.demo.Controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.Person;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){
		Flux<Person> flux1 = Flux.just(new Person("Alberto","Piedra", 20)).delayElements(Duration.ofSeconds(1));
		return flux1;
	}
	@GetMapping("/person-list-2")
	public Flux<Person> personList2(){
		Flux<Person> flux1 = Flux.just(new Person("Enrique","Piedra",25)).delayElements(Duration.ofSeconds(2));
		return flux1;
	}
	@GetMapping("/person-list-3")
	public Flux<Person> personList3(){
		Flux<Person> flux1 = Flux.just(new Person("Fran","Lobato",20)).delayElements(Duration.ofSeconds(3));
		return flux1;
	}
	@GetMapping("/person-list-4")
	public Flux<Person> personList4(){
		Flux<Person> flux1 = Flux.just(new Person("Luis","Delgado",63)).delayElements(Duration.ofSeconds(4));
		return flux1;
	}

}
