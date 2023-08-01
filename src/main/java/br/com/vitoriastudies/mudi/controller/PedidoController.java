package br.com.vitoriastudies.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.vitoriastudies.mudi.dto.PedidoDTO;
import br.com.vitoriastudies.mudi.model.Pedido;
import br.com.vitoriastudies.mudi.model.enums.StatusPedido;
import br.com.vitoriastudies.mudi.services.PedidoService;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	private static final StatusPedido AGUARDANDO = null;
	private static final StatusPedido APROVADO = null;
	@Autowired
	PedidoService pedidoService;
	
	@GetMapping("listapedidos")
	public String getPedidos(Model model) {
		List<Pedido> listaPedidos = pedidoService.findAll();
		model.addAttribute("listaPedidos", listaPedidos);
		return "pedido/pedidos";	
	}
	
	@GetMapping("formulario")
	public String novoPedido(PedidoDTO pedidoDto) {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid PedidoDTO pedidoDto, BindingResult result) {
	try {
		Pedido pedido = pedidoDto.toPedido();
		System.out.println(pedidoDto.getNomeProduto());
		System.out.println(pedidoDto.getUrlImagem());
		System.out.println(pedidoDto.getUrlProduto());
		pedidoService.save(pedido);
		return "pedido/formulario";
	}catch(ConstraintViolationException e) {
		return "pedido/formulario";
	}
	}
	
	@GetMapping("aguardando")
	public String aguardando(Model model) {
		StatusPedido status = StatusPedido.AGUARDANDO;
		List<Pedido> listaPedidos = pedidoService.buscarStatus(status);
		model.addAttribute("listaPedidos", listaPedidos);
		return "pedido/pedidos";

		
	}

}
