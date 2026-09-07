package org.example.domain.activity.service.trial;

import org.example.domain.activity.model.entity.MarketProductEntity;
import org.example.domain.activity.model.entity.TrialBalanceEntity;
import org.example.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import org.example.types.design.framework.tree.AbstractMultiThreadStrategyRouter;
import org.example.types.design.framework.tree.AbstractStrategyRouter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * 功能服务支撑类 用于明确指定入参与出参的定义
 * @param <MarketProductEntity>
 * @param <DynamicContext>
 * @param <TrialBalanceEntity>
 */
public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity, DynamicContext, TrialBalanceEntity>
        extends AbstractMultiThreadStrategyRouter<org.example.domain.activity.model.entity.MarketProductEntity,
                DefaultActivityStrategyFactory.DynamicContext,
                org.example.domain.activity.model.entity.TrialBalanceEntity> {

    @Override
    protected void multiThread(org.example.domain.activity.model.entity.MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws ExecutionException, InterruptedException, TimeoutException {

    }
}
