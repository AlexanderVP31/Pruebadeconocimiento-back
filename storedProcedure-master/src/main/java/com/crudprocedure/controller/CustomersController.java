package com.crudprocedure.controller;

import com.crudprocedure.entity.Customers;
import com.crudprocedure.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    CustomersService customersService;

    @GetMapping("/lista")
    public ResponseEntity<List<Customers>> lista(){
        List<Customers> lista = customersService.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    }

    @GetMapping("/verid/{id}")
    public ResponseEntity<Customers> verId(@PathVariable("id") String id){
        Optional<Customers> customers = customersService.CustomersGetByID(id);
        return new ResponseEntity(customers, HttpStatus.OK);
    }


    @PostMapping("/nuevo")
    public ResponseEntity<?> save(@RequestBody Customers customers){
        customersService.saveProcedure(customers);
        return new ResponseEntity("customers guardado", HttpStatus.CREATED);
    }


    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrar(@PathVariable("id") String id){
        customersService.borrarProcedure(id);
        return new ResponseEntity("customers eliminado", HttpStatus.OK);
    }
}
