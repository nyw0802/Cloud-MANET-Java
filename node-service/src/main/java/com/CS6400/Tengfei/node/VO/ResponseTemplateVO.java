package com.CS6400.Tengfei.node.VO;

import com.CS6400.Tengfei.node.entity.Node;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Node node;
    private MANET manet;
}
