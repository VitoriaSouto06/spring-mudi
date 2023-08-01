package br.com.vitoriastudies.mudi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitoriastudies.mudi.model.Pedido;
import br.com.vitoriastudies.mudi.model.enums.StatusPedido;
import br.com.vitoriastudies.mudi.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;
	
	public List<Pedido> findAll() {
		return pedidoRepository.findAll();
		
	}
	
	public void save(Pedido pedido) {
		pedidoRepository.save(pedido);
	}
	
	public List<Pedido> buscarStatus(StatusPedido status){
		return pedidoRepository.findByStatusPedido(status);
	}
	
}
