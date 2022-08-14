package com.CS6400.Tengfei.node.service;

import com.CS6400.Tengfei.node.VO.MANET;
import com.CS6400.Tengfei.node.VO.ResponseTemplateVO;
import com.CS6400.Tengfei.node.entity.Node;
import com.CS6400.Tengfei.node.repository.NodeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class NodeService {
    @Autowired
    private NodeRepository nodeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Node saveNode(Node node) {
        log.info("inside saveNode of NodeService");
        return nodeRepository.save(node);
    }

    public Node findNodeById(Long nodeId) {
        log.info("inside findNodeById of NodeService");
        return nodeRepository.findByNodeId(nodeId);
    }

    public ResponseTemplateVO getNodeWithMANET(Long nodeId) {
        log.info("inside getNodeWithMANET of NodeService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Node node = nodeRepository.findByNodeId(nodeId);

        MANET manet =
                restTemplate.getForObject("http://MANET-SERVICE/manet/" + node.getMANETId()
                        , MANET.class);

        vo.setNode(node);
        vo.setManet(manet);

        return vo;
    }
}
