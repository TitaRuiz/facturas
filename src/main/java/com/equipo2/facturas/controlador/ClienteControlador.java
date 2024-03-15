package com.equipo2.facturas.controlador;

import com.equipo2.facturas.excepciones.ExcepcionNoEncontrado;
import com.equipo2.facturas.modelo.Cliente;
import com.equipo2.facturas.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins ="http://localhost:4200")
public class ClienteControlador {
    @Autowired
    private IClienteServicio servicio;

    @GetMapping
    public ResponseEntity<List<Cliente>>consultarTodas(){
        return new ResponseEntity<>(servicio.consultaTodos(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> consultarUno(@PathVariable("id") int id){
        Cliente c = servicio.consultaUno(id);
        if(c==null){
            throw new ExcepcionNoEncontrado("recurso no encontrado " + id);
        }
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cliente> crear(@RequestBody Cliente c){

        Cliente pBBDD = servicio.crear(c);
        return new ResponseEntity<>(pBBDD, HttpStatus.CREATED);
    }


}
