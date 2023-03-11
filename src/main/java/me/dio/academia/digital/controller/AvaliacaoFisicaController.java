package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  @Autowired
  private AvaliacaoFisicaServiceImpl service;

  @PostMapping
  public ResponseEntity<AvaliacaoFisica> create(@RequestBody AvaliacaoFisicaForm form) {

      AvaliacaoFisica avaliacao = service.create(form);

      return ResponseEntity.status(HttpStatus.CREATED).body(avaliacao);
  }

  @GetMapping
  public ResponseEntity<List<AvaliacaoFisica>> getAll(){

       List<AvaliacaoFisica> avaliacoes = service.getAll();

    return ResponseEntity.ok(avaliacoes);
  }

  @GetMapping("{id}")
  public ResponseEntity<AvaliacaoFisica> get(@PathVariable Long id){

        AvaliacaoFisica avaliacao = service.get(id);

      return ResponseEntity.ok(avaliacao);
  }

  @PutMapping("{id}")
  public ResponseEntity<AvaliacaoFisica> update(@PathVariable Long id, @RequestBody AvaliacaoFisicaUpdateForm form){

    AvaliacaoFisica avaliacao = service.update(id, form);

    return ResponseEntity.ok(avaliacao);
  }

  @DeleteMapping("{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id){

    service.delete(id);

  }
}
