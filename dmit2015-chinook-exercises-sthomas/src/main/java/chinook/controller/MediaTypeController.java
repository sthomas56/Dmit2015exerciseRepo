package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.MediaTypeRepository;
import chinook.model.MediaType;

@Model
public class MediaTypeController {
	
	@Inject
	private MediaTypeRepository mediaTypeRepository;
	
	private List<MediaType> mediaTypes;
	
	@PostConstruct
	void init() {
		mediaTypes = mediaTypeRepository.findAll();
	}
	
	public List<MediaType> getMediaTypes() {
		
		return mediaTypes;
		
	}
	

}
