package eci.arsw.covidanalyzer;

import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;
import eci.arsw.covidanalyzer.service.ICovidAggregateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/covid/result")
public class CovidAggregateController {
	
	@Autowired
    ICovidAggregateService covidAggregateService;

	
	@RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
	public ResponseEntity<?> true_positive() {
	        try{
	            return new ResponseEntity<>(covidAggregateService.getResult(TRUE_POSITIVE), HttpStatus.ACCEPTED);
	        }catch (Exception e){
	            return new ResponseEntity<>("ERROR 500",HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	
	@RequestMapping(value = "/covid/result/true-negative", method = RequestMethod.GET)
	public ResponseEntity<?> true_negative() {
	        try{
	            return new ResponseEntity<>(covidAggregateService.getResult(TRUE_NEGATIVE), HttpStatus.ACCEPTED);
	        }catch (Exception e){
	            return new ResponseEntity<>("ERROR 500",HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	@RequestMapping(value = "/covid/result/false-positive", method = RequestMethod.GET)
	public ResponseEntity<?> false_positive() {
	        try{
	            return new ResponseEntity<>(covidAggregateService.getResult(FALSE_POSITIVE), HttpStatus.ACCEPTED);
	        }catch (Exception e){
	            return new ResponseEntity<>("ERROR 500",HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	@RequestMapping(value = "/covid/result/false-negative", method = RequestMethod.GET)
	public ResponseEntity<?> false_negative() {
	        try{
	            return new ResponseEntity<>(covidAggregateService.getResult(FALSE_NEGATIVE), HttpStatus.ACCEPTED);
	        }catch (Exception e){
	            return new ResponseEntity<>("ERROR 500",HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	
	@RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.POST)
    public ResponseEntity addTruePositiveResult(Result result) {
        //TODO
        covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
        return null;
    }
	@RequestMapping(value = "/covid/result/true-negative", method = RequestMethod.POST)
    public ResponseEntity addTruenegative(Result result) {
        //TODO
        covidAggregateService.aggregateResult(result, ResultType.TRUE_NEGATIVE);
        return null;
    }
	@RequestMapping(value = "/covid/result/false-positive", method = RequestMethod.POST)
    public ResponseEntity addfalsepositive(Result result) {
        //TODO
        covidAggregateService.aggregateResult(result, ResultType.FALSE_POSITIVE);
        return null;
    }
	@RequestMapping(value = "/covid/result/false-negative", method = RequestMethod.POST)
    public ResponseEntity addfalsenegative(Result result) {
        //TODO
        covidAggregateService.aggregateResult(result, ResultType.FALSE_NEGATIVE);
        return null;
    }
	@RequestMapping(value = "/covid/result/persona/{id}", method = RequestMethod.PUT)
    public ResponseEntity savePersonaWithMultipleTests() {
        //TODO
        covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return null;
    }
	
    
}