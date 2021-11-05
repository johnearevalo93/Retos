/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclo3_Reto3.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author john
 */
@Repository
public class RepositorioCabin {
    
    @Autowired
    private InterfaceCabin crud;

    public List<Cabin> getAll(){
        return (List<Cabin>) crud.findAll();
    }

    public Optional<Cabin> getBike(int id){
        return crud.findById(id);
    }

    public Cabin save(Cabin cabin){
        return crud.save(cabin);
    }
    public void delete(Cabin cabin){
        crud.delete(cabin);
    }

    Optional<Cabin> getCabin(int cabinId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
