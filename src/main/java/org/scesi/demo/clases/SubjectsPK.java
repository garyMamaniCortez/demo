package org.scesi.demo.clases;

import lombok.Data;

@Data
public class SubjectsPK{
    private String cod_cls;
    private String group_of;
    public StudentPK(String cod_cls,String group_of){
        super();
        this.cod_cls=cod_cls;
        this.group_of=group_of;
    }
}