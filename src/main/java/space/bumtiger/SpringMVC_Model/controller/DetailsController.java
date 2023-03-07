package space.bumtiger.SpringMVC_Model.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import space.bumtiger.SpringMVC_Model.domain.Details;

@Controller
public class DetailsController {

	@RequestMapping(value = "/")
	public String viewPage(@ModelAttribute("detail") Details detail,
			@ModelAttribute("ideNames") ArrayList<String> ideNames)
			throws IOException {
		ideNames.addAll(Arrays.asList("Eclipse", "IntelliJ", "NetBeans"));
		return "details";
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String submit(@ModelAttribute("detail") Details detail) {
		return "detailsSummary";
	}

}
