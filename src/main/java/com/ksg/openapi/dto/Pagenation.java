package com.ksg.openapi.dto;

/**
 * Created by 강성근
 */
public interface Pagenation {

    void setOffset(Integer offset);

    void setLimit(Integer limit);

    void setTotalCount(Integer totalCount);
}
