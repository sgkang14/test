package com.ksg.openapi.sample.errorResponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@Setter
@ToString
@Alias("SampleRequestDTO")
public class SampleRequestDTO {

    private Integer num;

    private List<String> citys;

    private Date birth;

    private SexType sex;

   private List<HobbyType> hobbys;

 //   private List<Family> Familys;

    //@Pattern(regexp = "name|sex|hobby")
    private String sort;

    //@Pattern(regexp = "desc|asc")
    private String order;
}
