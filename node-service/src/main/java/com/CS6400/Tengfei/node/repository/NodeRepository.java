package com.CS6400.Tengfei.node.repository;

import com.CS6400.Tengfei.node.entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepository extends JpaRepository<Node, Long> {
    Node findByNodeId(Long nodeId);
}
