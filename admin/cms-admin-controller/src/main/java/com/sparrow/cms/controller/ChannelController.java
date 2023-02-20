package com.sparrow.cms.controller;

import com.sparrow.cms.converter.ChannelConverter;
import com.sparrow.cms.dao.ChannelDAO;
import com.sparrow.cms.po.ContentMainType;
import com.sparrow.cms.protocol.channel.ChannelQuery;
import com.sparrow.cms.protocol.channel.ChannelSaveParam;
import com.sparrow.cms.vo.ChannelItemVO;
import com.sparrow.cms.vo.DetailChannelVO;
import com.sparrow.protocol.BusinessException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("channel")
@Component
@Api(value = "频道管理API", tags = "频道")
public class ChannelController {

    @Autowired
    private ChannelConverter channelConverter;

    @Inject
    private ChannelDAO channelDao;

    @PostMapping("save")
    @ApiOperation("频道保存")
    public Long saveChannel(@RequestBody ChannelSaveParam channelSaveParam) {
        ContentMainType channel = this.channelConverter.param2Po(channelSaveParam);
        return channelDao.insert(channel);
    }

    @GetMapping("manage")
    @ApiOperation("全部频道管理")
    public List<ChannelItemVO> loadAllChannels() {
        List<ContentMainType> channelList = this.channelDao.getList();
        return this.channelConverter.poList2ItemVoList(channelList);
    }

    private ModelAndView queryChannels(ChannelQuery channelQuery) {
        return null;
    }

    @PostMapping("search.do")
    @ApiOperation("查询频道")
    public List<ChannelItemVO> search(ChannelQuery channelQuery) {
        //this.channelDao.getList(channelQuery);
        return this.channelConverter.poList2ItemVoList(null);
    }

    @ApiOperation("编辑")
    @GetMapping("edit")
    public DetailChannelVO getChannel(Long channelId) throws BusinessException {
        ContentMainType channel = this.channelDao.getEntity(channelId);
        return this.channelConverter.po2Vo(channel);
    }

    @PostMapping("delete")
    @ApiOperation("删除频道")
    public Integer delChannel(String ids) throws BusinessException {
        return this.channelDao.batchDelete(ids);
    }

    @PostMapping("enable")
    @ApiOperation("启用频道")
    public Integer enableChannel(String ids) throws BusinessException {
        return this.channelDao.enableChannel(ids);
    }

    @PostMapping("disable")
    @ApiOperation("禁用频道")
    public Integer disableApp(String ids) throws BusinessException {
        return this.channelDao.disableChannel(ids);
    }
}
