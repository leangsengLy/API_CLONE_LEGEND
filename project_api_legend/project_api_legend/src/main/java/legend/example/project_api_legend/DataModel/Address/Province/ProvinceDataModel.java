package legend.example.project_api_legend.DataModel.Address.Province;

import legend.example.project_api_legend.DataModel.BaseDataModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceDataModel extends BaseDataModel{
    private Long Id;
    private String EnglishName; 
    private Long CountryId; 
    private String Name;
}
