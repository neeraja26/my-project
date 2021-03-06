package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.niit.dao.SupplierDAO;
import com.niit.models.Supplier;

@Controller
public class AdminSupplierController {



	@Autowired
	private SupplierDAO supplierDAO;

	@RequestMapping(value = { "supplier", "editsupplier/supplier" , "editcategory/supplier"})
	public String SupplierPage(Model model) {
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("supplierList", supplierDAO.list());
		model.addAttribute("SupplierPageClicked", "true");
		return "AdminHome";
	}

	@RequestMapping(value = { "addsupplier", "editsupplier/addsupplier" }, method = RequestMethod.POST)
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier) {
		supplierDAO.saveOrUpdate(supplier);
		return "redirect:/supplier";
	}

	@RequestMapping("editsupplier/{id}")
	public String editSupplier(@PathVariable("id") String id, Model model) {
		System.out.println("editSupplier");
		model.addAttribute("supplier", this.supplierDAO.get(id));
		model.addAttribute("supplierList", supplierDAO.list());
		model.addAttribute("SupplierPageClicked", "true");
		return "AdminHome";
	}

	@RequestMapping(value = { "removesupplier/{id}", "editsupplier/removesupplier/{id}" })
	public String removeSupplier(@PathVariable("id") String id, Model model) throws Exception {
		supplierDAO.delete(id);
		model.addAttribute("message", "Successfully Deleted");
		return "redirect:/supplier";
	}



}
