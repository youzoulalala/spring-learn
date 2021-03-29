package com.wyd.autowire;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Dept {
    private String dname;

    private List<String> empList;
    private String[] empArray;
    private Map<String, String> empMap;
}
