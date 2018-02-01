package com.github.yt.mybatis.result;

import com.fasterxml.jackson.annotation.JsonView;
import com.github.yt.mybatis.annotations.BaseResult;

import java.util.List;


public class QueryResult<T> {

    /**
     * 结果集
     */
    private List<T> data;

    /**
     * 总数
     */
    private long recordsTotal;

    public QueryResult() {
    }

    public QueryResult(List<T> data) {
        this.data = data;
        if(null!=data){
            this.recordsTotal = data.size();
        }
    }

    @JsonView(BaseResult.class)
    public List<T> getData() {
        return data;
    }

    public QueryResult<T> setData(List<T> data) {
        this.data = data;
        return this;
    }

    @JsonView(BaseResult.class)
    public long getRecordsTotal() {
        return recordsTotal;
    }

    public QueryResult<T> setRecordsTotal(long recordsTotal) {
        this.recordsTotal = recordsTotal;
        return this;
    }
}
