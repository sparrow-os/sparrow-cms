package com.sparrow.cms.controller;

import com.sparrow.cms.protocol.channel.ChannelQuery;
import com.sparrow.cms.protocol.channel.ChannelSaveParam;
import com.sparrow.protocol.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Deprecated
@RestController
@RequestMapping("channel-type")
public class ChannelTypeController {

    @PostMapping("save")
    public Long saveChannel(@RequestBody ChannelSaveParam channelSaveParam) {
        //todo
        return 0L;
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
    public ModelAndView getChannel(Long channelId) throws BusinessException {
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
