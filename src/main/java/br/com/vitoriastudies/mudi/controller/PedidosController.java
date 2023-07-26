package br.com.vitoriastudies.mudi.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.vitoriastudies.mudi.model.Pedido;
import br.com.vitoriastudies.mudi.repositories.PedidoRepository;
import br.com.vitoriastudies.mudi.services.PedidoService;

@Controller

public class PedidosController {
	
	@Autowired
	PedidoService pedidoService;
	
	@GetMapping("/pedidos")
	public String getPedidos(Model model) {
		List<Pedido> listaPedidos = pedidoService.findAll();
		model.addAttribute("listaPedidos", listaPedidos);
		return "pedidos";	
	}
	
}
