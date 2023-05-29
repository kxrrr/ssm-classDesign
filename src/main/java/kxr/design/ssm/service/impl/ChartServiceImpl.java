package kxr.design.ssm.service.impl;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.mapper.OrderDetailsMapper;
import kxr.design.ssm.mapper.OrderMapper;
import kxr.design.ssm.service.IChartService;
import kxr.design.ssm.vo.EmpChart;
import kxr.design.ssm.vo.IndexSales;
import kxr.design.ssm.vo.SalesChart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ChartServiceImpl implements IChartService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailsMapper detailsMapper;

    @Override
    public ServerResponse getEmpChart(String date) {
        List <EmpChart> chartData = orderMapper.selectChartByDate(date);
        if (chartData != null) {
            return ServerResponse.createBySuccess(chartData);
        }
        return ServerResponse.createByErrorMessage("木有数据哦");
    }

    @Override
    public ServerResponse getIndexChart() {
        List <EmpChart> chartData = orderMapper.selectYesterdayChart();
        if (chartData != null) {
            return ServerResponse.createBySuccess(chartData);
        }
        return ServerResponse.createByErrorMessage("木有数据哦");
    }

    @Override
    public ServerResponse getSaleNum() {
        int num = detailsMapper.selectYesterdayNum();
        return ServerResponse.createBySuccess(num);
    }

    @Override
    public ServerResponse getSalesChart(String start, String end) {
        List<SalesChart> salesCharts =  detailsMapper.selectSalesChart(start, end);
        if (salesCharts != null) {
            return ServerResponse.createBySuccess(salesCharts);
        }
        return ServerResponse.createByErrorMessage("木有数据哦");
    }

    @Override
    public ServerResponse getIndexSales(Integer id) {
        IndexSales indexSales = detailsMapper.selectIndexSales(id);
        if (indexSales != null) {
            return ServerResponse.createBySuccess(indexSales);
        }
        return ServerResponse.createByErrorMessage("木有数据哦");
    }

    @Override
    public ServerResponse getEmpSalesChart(Integer id, String date) {
        List <EmpChart> chartData = detailsMapper.selectEmpChart(id, date);
        if (chartData != null) {
            return ServerResponse.createBySuccess(chartData);
        }
        return ServerResponse.createByErrorMessage("木有数据哦");
    }
}
