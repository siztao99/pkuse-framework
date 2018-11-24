package com.iztao.pkuse.core.model.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseModel<ID> implements Serializable {

    private ID  id;
    private Long createTime;
    private Long updateTime;
}
