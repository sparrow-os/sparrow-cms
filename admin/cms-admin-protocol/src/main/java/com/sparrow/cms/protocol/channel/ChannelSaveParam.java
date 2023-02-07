package com.sparrow.cms.protocol.channel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 频道的保证入参
 */
@ApiModel("频道保存参数")
public class ChannelSaveParam {
    @ApiModelProperty("频道ID")
    private Long id;
    @ApiModelProperty("频道名称")
    private String name;
    @ApiModelProperty("频道编码")
    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
