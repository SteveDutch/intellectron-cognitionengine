package com.stevedutch.intellectron.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.stevedutch.intellectron.service.TagService;

@Controller
public class SearchController {
	
	private static final Logger LOG = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private TagService tagService;

	@GetMapping("/search")
	public String showSearchPage() {
		return "/search";
	}
	
	@PostMapping("/search/tag/{tagText}")
	public String searchByTag(@PathVariable String tagText) {
		LOG.info("\n  got tagText = " + tagText);
		tagService.findTagByText(tagText);
		return "/search";
	}
}
