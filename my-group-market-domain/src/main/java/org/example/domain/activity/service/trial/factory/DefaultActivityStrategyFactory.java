package org.example.domain.activity.service.trial.factory;

import lombok.Builder;
import lombok.Data;
import org.example.domain.activity.model.entity.MarketProductEntity;
import org.example.domain.activity.model.entity.TrialBalanceEntity;
import org.example.domain.activity.service.trial.node.RootNode;
import org.example.types.design.framework.tree.StrategyHandler;

public class DefaultActivityStrategyFactory {

    private final RootNode rootNode;

    public DefaultActivityStrategyFactory(RootNode rootNode) {
        this.rootNode = rootNode;
    }

    public StrategyHandler<MarketProductEntity, DynamicContext, TrialBalanceEntity> strategyHandler() {
        return rootNode;
    }

    @Data
    @Builder
    public static class DynamicContext {

        public DynamicContext() {
        }
    }
}
