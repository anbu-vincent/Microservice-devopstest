package com.devopstest.venue.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by demo on 10/18/16.
 */
@Data
public class Response {
    int totalPages;
    long totalRecords;

    List<Object> result = new ArrayList<Object>();
}
