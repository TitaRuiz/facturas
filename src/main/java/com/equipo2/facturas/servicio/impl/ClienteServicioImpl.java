package com.equipo2.facturas.servicio.impl;

import com.equipo2.facturas.modelo.Cliente;
import com.equipo2.facturas.repositorio.IClienteRepository;
import com.equipo2.facturas.repositorio.IGenericoRepositorio;
import com.equipo2.facturas.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicioImpl extends CRUDImpl<Cliente,Integer> implements IClienteServicio {
    @Autowired
    private IClienteRepository repo;
    @Override
    protected IGenericoRepositorio<Cliente, Integer> getRepo() {
        return repo;
    }
}
