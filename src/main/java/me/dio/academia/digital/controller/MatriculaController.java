package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

  @Autowired
  private MatriculaServiceImpl service;

  @PostMapping
  public ResponseEntity<Matricula> create(@Valid @RequestBody MatriculaForm form) {

      Matricula matricula = service.create(form);

    return ResponseEntity.status(HttpStatus.CREATED).body(matricula);
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
    return service.getAll(bairro);
  }

  @GetMapping("{id}")
  @ResponseStatus(HttpStatus.OK)
  public Matricula get(@RequestParam(value = "id", required = false) Long id) {
    return service.get(id);
  }

  @DeleteMapping("{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@RequestParam(value = "id", required = false) Long id) {
    service.delete(id);
  }

}

