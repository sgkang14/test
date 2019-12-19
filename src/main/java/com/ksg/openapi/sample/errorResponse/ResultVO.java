package com.ksg.openapi.sample.errorResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO {

    private Integer num;

    private String city;

    private Date birth;

    private SexType sex;

    private List<HobbyType> hobbys;

    private List<Family> Familys;

    public ResultVO(SampleRequestDTO request) {
        this.num = request.getNum();
        this.city = request.getCity();
        this.birth = request.getBirth();
        this.sex = request.getSex();
        this.hobbys = request.getHobbys();
        this.Familys = request.getFamilys();
    }

    public ResultVO() {
        this.num = 1;
        this.city = "seoul";
        //this.birth = '2019';
        this.sex = SexType.WOMAN;
        this.hobbys = new ArrayList<HobbyType>();
        this.hobbys.add(HobbyType.GAME);
        this.hobbys.add(HobbyType.NOVEL);
        this.Familys = new ArrayList<Family>();
        this.Familys.add(new Family("aaa", 20));
        this.Familys.add(new Family("bbb", 30));
    }

}
