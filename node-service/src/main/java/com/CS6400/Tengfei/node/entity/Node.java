package com.CS6400.Tengfei.node.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long nodeId;
    private String userName;
    private String password;
    private String ipAddress;
    private int status;
    private Long MANETId;
}
