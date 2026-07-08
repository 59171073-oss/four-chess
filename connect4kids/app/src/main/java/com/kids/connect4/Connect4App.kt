package com.kids.connect4

import android.app.Application

/**
 * 应用全局入口。
 *
 * 后续在此初始化依赖注入容器 (di/)、日志、崩溃上报等。
 * 当前骨架阶段不包含任何业务逻辑。
 */
class Connect4App : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
