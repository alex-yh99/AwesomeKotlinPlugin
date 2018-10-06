package com.intellij.awesomeKt.component

import com.intellij.awesomeKt.configurable.AKSettings
import com.intellij.awesomeKt.util.Constants
import com.intellij.openapi.components.ApplicationComponent

/**
 * Created by Roger™
 */
class AKComponent : ApplicationComponent {
    override fun getComponentName() = Constants.COMPONENT_NAME

    override fun disposeComponent() {}

    override fun initComponent() {
        AKSettings.instance.init()
    }
}