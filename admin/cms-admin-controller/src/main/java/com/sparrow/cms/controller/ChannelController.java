package com.sparrow.cms.controller;

import com.sparrow.cms.converter.ChannelConverter;
import com.sparrow.cms.dao.ChannelDAO;
import com.sparrow.cms.po.Channel;
import com.sparrow.cms.protocol.channel.ChannelQuery;
import com.sparrow.cms.protocol.channel.ChannelSaveParam;
import com.sparrow.cms.vo.ChannelVO;
import com.sparrow.protocol.BusinessException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
        Channel channel = this.channelConverter.param2Po(channelSaveParam);
        return channelDao.insert(channel);
    }

    @GetMapping("manage")
    public ModelAndView loadAllChannels() {
        return null;
    }

    private ModelAndView queryChannels(ChannelQuery channelQuery) {
        return null;
    }

    @PostMapping("search.do")
    public ModelAndView search(ChannelQuery channelQuery) {
        return null;
    }

    @GetMapping("new")
    public ChannelVO getChannel(Long channelId) throws BusinessException {
        return null;
    }

    @PostMapping("delete")
    public ModelAndView delChannel(String ids) throws BusinessException {
        return null;
    }

    @PostMapping("enable")
    public ModelAndView enableChannel(String ids) throws BusinessException {
        return null;
    }

    @PostMapping("disable")
    public ModelAndView disableApp(String ids) throws BusinessException {
        return null;
    }
}
