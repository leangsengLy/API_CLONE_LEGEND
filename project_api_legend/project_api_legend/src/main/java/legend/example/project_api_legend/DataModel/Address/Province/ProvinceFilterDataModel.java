package legend.example.project_api_legend.DataModel.Address.Province;

import legend.example.project_api_legend.DataModel.BaseFilterDataModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceFilterDataModel extends BaseFilterDataModel {
    public Long Id;
    public Long CountryId;
}
