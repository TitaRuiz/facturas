package com.equipo2.facturas.repositorio;

import com.equipo2.facturas.modelo.DetalleFactura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDetalleFacturaRepository extends IGenericoRepositorio<DetalleFactura,Integer>{
    @Query("FROM DetalleFactura df where df.factura.idFactura=:id")
    List<DetalleFactura> detalleFacturaPorCliente(@Param("id") int id);
}
