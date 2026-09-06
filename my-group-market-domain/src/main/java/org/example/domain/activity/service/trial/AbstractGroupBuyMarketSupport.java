package org.example.domain.activity.service.trial;

import org.example.domain.activity.model.entity.MarketProductEntity;
import org.example.domain.activity.model.entity.TrialBalanceEntity;
import org.example.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import org.example.types.design.framework.tree.AbstractStrategyRouter;

/**
 * 功能服务支撑类 用于明确指定入参与出参的定义
 * @param <MarketProductEntity>
 * @param <DynamicContext>
 * @param <TrialBalanceEntity>
 */
public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity, DynamicContext, TrialBalanceEntity>
        extends AbstractStrategyRouter<org.example.domain.activity.model.entity.MarketProductEntity,
        DefaultActivityStrategyFactory.DynamicContext,
        org.example.domain.activity.model.entity.TrialBalanceEntity> {

}
