package com.ksg.openapi.sample.errorResponse;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@Setter
@AllArgsConstructor
public class SampleResponseData {

    private List<ResultVO> users;

    @JsonUnwrapped
    private Paging page;

    public SampleResponseData() {
        this.page = new Paging();
    }
}
