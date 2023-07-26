package br.com.vitoriastudies.mudi.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.vitoriastudies.mudi.model.Pedido;
import br.com.vitoriastudies.mudi.repositories.PedidoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	PedidoRepository pedidoRepository;
	public void run(String... args) throws Exception {
	pedidoRepository.deleteAll();
		Pedido p = new Pedido(null,"Echo Dot (3ª Geração): Smart Speaker com Alexa - Cor Preta",new BigDecimal(331.55),LocalDate.now(),"https://www.amazon.com.br/dp/B07PDHSJ1H/ref=ods_gw_nh_fixed23q2_deskatf_node_cr/?_encoding=UTF8&pd_rd_w=VACr8&content-id=amzn1.sym.5ac764a4-eda1-4f37-b297-c36e78602762&pf_rd_p=5ac764a4-eda1-4f37-b297-c36e78602762&pf_rd_r=W67XP9QA0T4H59A6PJ1Z&pd_rd_wg=adx47&pd_rd_r=56df8e83-04aa-4507-9a29-e9df6386187e&ref_=pd_gw_unk",
				"https://m.media-amazon.com/images/I/51+iQTwDsXL._AC_SX425_.jpg","O Echo Dot é o nosso smart speaker de maior sucesso. Controlado por voz com Alexa, ele é perfeito para qualquer ambiente. Você pode pedir músicas, notícias, informações e muito mais. Além de ligar para amigos e familiares e controlar dispositivos compatíveis de casa inteligente com sua voz.");
		
		
		Pedido p1 = new Pedido(null,"Teclado Gamer Mecânico Havit Kb-871l Rgb Rosa Quartz",new BigDecimal(259.00),LocalDate.now(),"https://www.amazon.com.br/Teclado-Gamer-Mec%C3%A2nico-Kb-871l-Quartz/dp/B0B1N8S6TM/ref=pd_ci_mcx_mh_mcx_views_0?pd_rd_w=SdLyu&content-id=amzn1.sym.6244f8fc-d9fe-4f51-896b-cf3e87c7b3b6%3Aamzn1.symc.40e6a10e-cbc4-4fa5-81e3-4435ff64d03b&pf_rd_p=6244f8fc-d9fe-4f51-896b-cf3e87c7b3b6&pf_rd_r=RMJYJ17W3D2HRY5C5EZD&pd_rd_wg=tpHNj&pd_rd_r=8d035e1f-38b9-4b43-9687-b4774c64de98&pd_rd_i=B0B1N8S6TM",
				"https://m.media-amazon.com/images/I/41iMim8fm3L._AC_SX679_.jpg","Jogos");
		
		
		pedidoRepository.saveAll(Arrays.asList(p,p1));
		
	}
}
