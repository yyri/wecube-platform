package com.webank.wecube.platform.core.repository.plugin;

import org.springframework.stereotype.Repository;

import com.webank.wecube.platform.core.entity.plugin.PluginPackageAttributes;

@Repository
public interface PluginPackageAttributesMapper {
    int deleteByPrimaryKey(String id);

    int insert(PluginPackageAttributes record);

    int insertSelective(PluginPackageAttributes record);

    PluginPackageAttributes selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PluginPackageAttributes record);

    int updateByPrimaryKey(PluginPackageAttributes record);
}