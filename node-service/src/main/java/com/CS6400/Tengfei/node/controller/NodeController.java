package com.CS6400.Tengfei.node.controller;

import com.CS6400.Tengfei.node.VO.ResponseTemplateVO;
import com.CS6400.Tengfei.node.entity.Node;
import com.CS6400.Tengfei.node.service.NodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/node")
@Slf4j
public class NodeController {

    @Autowired
    private NodeService nodeService;

    @PostMapping("/")
    public Node saveNode(@RequestBody Node node){
        log.info("inside saveNode method of NodeController");
        return nodeService.saveNode(node);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getNodeWithMANET(@PathVariable("id") Long nodeId){
        log.info("inside getNodeWithMANET method of NodeController");
        return nodeService.getNodeWithMANET(nodeId);
    }

}
