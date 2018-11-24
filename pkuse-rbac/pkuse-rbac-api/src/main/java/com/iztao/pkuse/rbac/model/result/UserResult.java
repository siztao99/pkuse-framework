package com.iztao.pkuse.rbac.model.result;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class UserResult implements Serializable {
    private Set<Long> friends;
}
