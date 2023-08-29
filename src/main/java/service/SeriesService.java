package service;

import dao.ISeriesDao;
import model.Series;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import to.SeriesTo;

import java.util.List;
import java.util.Optional;

@Service
public class SeriesService {

	private ISeriesDao dao;
	private ModelMapper modelMapper = new ModelMapper();

	@Autowired
	public SeriesService(ISeriesDao dao) {
		this.dao = dao;
	}

	public List<SeriesTo> getSeriesList() {
		List<Series> seriesDaoList = dao.findAll();
		List<SeriesTo> seriesToList = seriesDaoList.stream().map(series -> modelMapper.map(series, SeriesTo.class)).toList();
		return seriesToList;
	}

	public SeriesTo getSeries(Long seriesId) {
		Optional<Series> series = dao.findById(seriesId);
		if (series.isEmpty()) {
			return null;
		}
		SeriesTo seriesTo = modelMapper.map(series.get(), SeriesTo.class);
		return seriesTo;
	}

	public SeriesTo createSeries(SeriesTo seriesTo) {
		Series seriesDao = modelMapper.map(seriesTo, Series.class);
		Series createdSeriesDao = dao.save(seriesDao);
		SeriesTo createdSeriesTo = modelMapper.map(createdSeriesDao, SeriesTo.class);
		return createdSeriesTo;
	}

	public SeriesTo editSeries(SeriesTo seriesTo) {
		Series seriesDao = modelMapper.map(seriesTo, Series.class);
		Series editedSeriesDao = dao.save(seriesDao);
		SeriesTo editedSeriesTo = modelMapper.map(editedSeriesDao, SeriesTo.class);
		return editedSeriesTo;
	}

	public boolean deleteSeries(Long seriesId) {
		dao.deleteById(seriesId);
		return !dao.existsById(seriesId);
	}

}
