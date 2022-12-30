package com.crudprocedure.service;

import java.util.List;
import java.util.Optional;

import com.crudprocedure.entity.Customers;
import com.crudprocedure.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {

    @Autowired
    CustomersRepository customersRepository;

    public List<Customers> lista(){
        return customersRepository.listaProcedure();
    }

    public Optional<Customers> CustomersGetByID(String id){
        return customersRepository.idProcedure(id);
    }

    public void saveProcedure(Customers customers){
        customersRepository.saveProcedure(customers.getId(), customers.getName(), customers.getLastname(),
                customers.getMotherlastname(), customers.getAddress(), customers.getDateofbirth(), customers.getSex());
    }

    public void borrarProcedure(String id){
        customersRepository.borrarProcedure(id);
    }
}
