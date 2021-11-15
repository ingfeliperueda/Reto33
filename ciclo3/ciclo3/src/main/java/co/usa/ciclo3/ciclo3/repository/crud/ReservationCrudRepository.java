/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.usa.ciclo3.ciclo3.repository.crud;

import co.usa.ciclo3.ciclo3.model.ReservationModel;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Felipe Rueda
 */
public interface ReservationCrudRepository extends CrudRepository<ReservationModel, Integer> {
    
}
