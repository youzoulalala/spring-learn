package com.wyd.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
public class Dept {
    private String dname;
    private List<String> empList;
    private String[] empArray;
    private Map<String, String> empMap;
}
