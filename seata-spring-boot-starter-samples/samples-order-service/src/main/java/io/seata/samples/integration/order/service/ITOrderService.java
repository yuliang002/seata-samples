package io.seata.samples.integration.order.service;

import com.baomidou.mybatisplus.service.IService;
import io.seata.samples.integration.common.dto.OrderDTO;
import io.seata.samples.integration.common.response.ObjectResponse;
import io.seata.samples.integration.order.entity.TOrder;

/**
 * <p>
 * 创建订单
 * </p>
 *
 * * @author lidong
 *
 * @since 2019-09-04
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
