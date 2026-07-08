# di/

手动依赖注入容器目录 (不引入 Hilt / Dagger 以简化工程)。

预期内容：
- 一个轻量 `AppContainer` / `ServiceLocator`，在 `Connect4App` 中初始化。
- 聚合 Room 数据库、Retrofit 实例、EncryptedSharedPreferences、AI 引擎等单例。
- ViewModel 通过该容器获取依赖 (配合 `viewModel(factory = ...)` 使用)。

> 本文件为包结构占位，骨架阶段未包含任何业务逻辑代码。
