package com.equipo2.facturas.controlador;

import com.equipo2.facturas.excepciones.ExcepcionNoEncontrado;
import com.equipo2.facturas.modelo.DetalleFactura;
import com.equipo2.facturas.servicio.IDetalleFacturaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallesfactura")
@CrossOrigin(origins ="http://localhost:4200")
public class ControladorDetalleFactura {
    @Autowired
    private IDetalleFacturaServicio servicio;
    @GetMapping("/{id}")
    public ResponseEntity<DetalleFactura> consultarUno(@PathVariable int id){
        DetalleFactura detalleFacturaBBDD = servicio.consultaUno(id);
        if(detalleFacturaBBDD==null){
            throw new ExcepcionNoEncontrado("Id no encontrado " + id);
        }
        return new ResponseEntity<>(detalleFacturaBBDD, HttpStatus.OK);
    }
    @GetMapping("/porcliente/{id}")
    public ResponseEntity<List<DetalleFactura>> consultaPorCliente(@PathVariable int id){
        return new ResponseEntity<>(servicio.detalleFacturaPorCliente(id),HttpStatus.OK);
    }
}
