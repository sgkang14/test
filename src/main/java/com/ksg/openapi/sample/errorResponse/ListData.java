package com.ksg.openapi.sample.errorResponse;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.transform.Result;
import java.util.List;

/**
 * Created by 강성근
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListData<T> {

    //@JsonSerialize(using = CustomSerializer.class)
    private List<T> data;

    @JsonUnwrapped
    private Paging paging;

    private int count;
}
