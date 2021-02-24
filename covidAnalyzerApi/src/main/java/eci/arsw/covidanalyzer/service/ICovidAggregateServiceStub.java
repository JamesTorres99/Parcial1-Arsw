package eci.arsw.covidanalyzer.service;

import eci.arsw.covidanalyzer.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service("ICovidAggregateServiceStub")
public class ICovidAggregateServiceStub implements ICovidAggregateService {
    private List<ResultType> resultados;
    private final HashMap<UUID,Integer> resul;

    public ICovidAggregateServiceStub ( ){
        resultados = new ArrayList <ResultType>();
        resul=new HashMap<UUID,Integer>();

        }

    @Override
    public boolean aggregateResult(Result result, ResultType type){
      
        return true ;
    }

    @Override
    public  List<Result> getResult(ResultType type){
        List<Result> resultado= new ArrayList <Result>();
        for (ResultType resul: resultados){
            if (resul.resultType(type)){
                resultado.add(resul);
            }
        }
        return resultado;
    }

    @Override
    public void upsertPersonWithMultipleTests(UUID id, ResultType type){}




}
