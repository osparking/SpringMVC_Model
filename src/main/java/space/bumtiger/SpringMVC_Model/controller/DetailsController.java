package space.bumtiger.SpringMVC_Model.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import space.bumtiger.SpringMVC_Model.domain.Details;

@Controller
public class DetailsController {

	@RequestMapping(value = "/")
	public String viewPage(Model model) throws IOException {
		Details detail = new Details();
		model.addAttribute("detail", detail);
		List<String> ideNames = new ArrayList<String>();
		ideNames.addAll(Arrays.asList("STS 4", "IntelliJ", "NetBeans"));
		model.addAttribute("ideNames", ideNames);
		return "details";
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String submit(@ModelAttribute("detail") Details detail) {
		return "detailsSummary";
	}

}
