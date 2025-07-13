package legend.example.project_api_legend.Interface.Address;

import java.util.List;


import legend.example.project_api_legend.DataModel.Address.Country.CountryDataModel;
import legend.example.project_api_legend.DataModel.Address.Country.CountryFilterDataModel;
import legend.example.project_api_legend.Dto.Address.CountryDto;
public interface CountryService {
    List<CountryDto> List(CountryFilterDataModel filter);
    CountryDto Create(CountryDataModel filter);
    CountryDto Update(CountryDataModel filter);
    Boolean Delete(Long Id);
    Boolean RemoveImage(Long Id);
    boolean CheckCode(String code,Long Id,String database);
}
