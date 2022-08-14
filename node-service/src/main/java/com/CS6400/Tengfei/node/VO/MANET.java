package com.CS6400.Tengfei.node.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MANET {

    private Long MANETId;
    private int ownerId;
    private String MANETIp;
    private String createTime;
    private String capacity;
    private String MANETRange;
    private String location;
    private int number;
}
