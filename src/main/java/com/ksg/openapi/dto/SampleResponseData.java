package com.ksg.openapi.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SampleResponseData {

    private List<User> users;

    @JsonUnwrapped
    private Paging page;
}
