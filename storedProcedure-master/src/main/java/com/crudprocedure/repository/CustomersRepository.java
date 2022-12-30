package com.crudprocedure.repository;

import java.util.List;
import java.util.Optional;

import com.crudprocedure.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {

    @Query(value = "{call CustomersList()}", nativeQuery = true)
    List<Customers> listaProcedure();

    @Query(value = "{call CustomersGetByID(:id)}", nativeQuery = true)
    Optional<Customers> idProcedure(@Param("id") String id);


    @Query(value = "{call CustomersInsert(:id, :Name, :Lastname, :Motherlastname, :Address, :Dateofbirth, :Sex,)}", nativeQuery = true)
    void saveProcedure(
            @Param("id")String id,
            @Param("Name")String Name,
            @Param("Lastname")String Lastname,
            @Param("Motherlastname")String Motherlastname,
            @Param("Address")String Address,
            @Param("Dateofbirth")String Dateofbirth,
            @Param("Sex")String Sex
            );



    @Query(value = "{call CustomersDelete(:id)}", nativeQuery = true)
    void borrarProcedure(@Param("id") String id);
}
