package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private AlunoServiceImpl service;

  @PostMapping
  public ResponseEntity<Aluno> create(@Valid @RequestBody AlunoForm form) {

    Aluno aluno = service.create(form);

    return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
  }

  @GetMapping("/avaliacoes/{id}")
  public ResponseEntity<List<AvaliacaoFisica>> getAllAvaliacaoFisicaId(@PathVariable Long id) {

    List<AvaliacaoFisica> avaliacoes = service.getAllAvaliacaoFisicaId(id);

    return ResponseEntity.ok(avaliacoes);
  }

  @GetMapping
  public ResponseEntity<List<Aluno>> getAllDataNascimento(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNacimento){

    List<Aluno> alunos = service.getAll(dataDeNacimento);

    return ResponseEntity.ok(alunos);
  }

  @GetMapping("{id}")
  public ResponseEntity<Aluno> get(@PathVariable Long id){

    Aluno aluno = service.get(id);

    return ResponseEntity.ok(aluno);
  }

  @PutMapping("{id}")
  public ResponseEntity<Aluno> update(@PathVariable Long id, @RequestBody AlunoUpdateForm form){

    Aluno aluno = service.update(id, form);

    return ResponseEntity.ok(aluno);
  }

  @DeleteMapping("{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deletar(@PathVariable Long id){
      service.get(id);
  }
}
