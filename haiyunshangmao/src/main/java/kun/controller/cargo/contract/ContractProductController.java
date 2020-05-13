package kun.controller.cargo.contract;



import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kun.controller.BaseController;
import kun.domain.ContractProduct;
import kun.service.ContractProductService;
import kun.service.FactoryService;
import util.Arith;
@Controller
public class ContractProductController extends BaseController {
	@Autowired
	ContractProductService contractProductService;
	@Autowired
	FactoryService factoryService;
	//转向新增页面
	@RequestMapping("/cargo/contractproduct/tocreate.action")
	public String tocreate(ContractProduct contractProduct,Model model) {
		model.addAttribute("contractId",contractProduct.getContractId());
		model.addAttribute("factoryList",factoryService.combo());
		List<ContractProduct> dataList = contractProductService.find(contractProduct);
		model.addAttribute("dataList", dataList);
		return "cargo/contractproduct/jContractProductCreate.jsp";
	}
	//新增保存
	@RequestMapping("/cargo/contractproduct/insert.action")
	public String insert(ContractProduct contractProduct) {
		contractProduct.setId(UUID.randomUUID().toString());
		if(contractProduct.getCnumber()!=null && contractProduct.getPrice()!=null){
			Arith arith = new Arith();										//java精度 工具类
			contractProduct.setAmount(arith.mul(contractProduct.getCnumber(), contractProduct.getPrice()));			//总金额
		}
		contractProductService.insert(contractProduct);
		return "redirect:/cargo/contractproduct/tocreate.action?contractId=" + contractProduct.getContractId();	
	}
	//转向修改页面
	@RequestMapping("/cargo/contractproduct/toupdate.action")
	public String toupdate(String id,Model model){
		//准备厂家下拉框
		model.addAttribute("factoryList", factoryService.combo());
		
		ContractProduct obj = contractProductService.get(id);
		model.addAttribute("obj", obj);
		
		return "cargo/contractproduct/jContractProductUpdate.jsp";
	}
	//保存修改
	@RequestMapping("/cargo/contractproduct/update.action")
	public String update(ContractProduct contractProduct){
		if(contractProduct.getCnumber()!=null && contractProduct.getPrice()!=null){
			Arith arith = new Arith();										//java精度 工具类
			contractProduct.setAmount(arith.mul(contractProduct.getCnumber(), contractProduct.getPrice()));			//总金额
		}		
		contractProductService.update(contractProduct);
		
		return "redirect:/cargo/contractproduct/tocreate.action?contractId="+contractProduct.getContractId();			//修改保存后返回列表（新增）页面
	}
	//删除
	@RequestMapping("/cargo/contractproduct/delete.action")
	public String delete(String id, String contractId){
		contractProductService.delete(id);
		
		return "redirect:/cargo/contractproduct/tocreate.action?contractId="+contractId;
	}
}
