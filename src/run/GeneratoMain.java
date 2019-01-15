package run;

import cn.org.rapid_framework.generator.GeneratorFacade;

public class GeneratoMain {

	public static void main(String[] args) throws Exception {
		GeneratorFacade g = new GeneratorFacade();
		g.deleteOutRootDir();
		// g.generateByTable("fina_order_take_payables", "template/01");
//		g.generateByTable("department1","template/oms");
//		g.generateByTable("employee1","template/oms");
		g.generateByTable("business","template/oms");
//		g.generateByTable("tb_payment","template/oms");
//		g.generateByTable("tb_payment_method","template/oms");
//		g.generateByTable("tb_payment_shipping_method","template/oms");
	}
}
