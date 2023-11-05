package in.chandan.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import in.chandan.request.SearchRequest;
import in.chandan.response.SearchResponse;

public interface ReportService {

	public List<String> getUniquePlanNames();

	public List<String> getUniquePlanStatuses();

	public List<SearchResponse> search(SearchRequest request);

	public void generateExcel(HttpServletResponse response)throws Exception;

	public void generatePdf(HttpServletResponse response) throws Exception;

}