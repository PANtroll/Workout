package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.SeriesService;
import to.SeriesTo;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController {

	private SeriesService service;

	@Autowired
	public SeriesController(SeriesService service) {
		this.service = service;
	}

	@GetMapping("/list")
	public List<SeriesTo> getSeriesList() {
		return service.getSeriesList();
	}

	@GetMapping("/{seriesId}")
	public SeriesTo getSeries(@PathVariable Long seriesId) {
		return service.getSeries(seriesId);
	}

	@PostMapping("/add")
	public SeriesTo createSeries(@RequestBody SeriesTo seriesTo) {
		return service.createSeries(seriesTo);
	}

	@PutMapping("/edit")
	public SeriesTo editSeries(@RequestBody SeriesTo seriesTo) {
		return service.editSeries(seriesTo);
	}

	@DeleteMapping("/delete/{seriesId}")
	public boolean deleteSeries(@PathVariable Long seriesId) {
		return service.deleteSeries(seriesId);
	}
}
