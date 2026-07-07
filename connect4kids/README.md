# 重力四子棋 (Connect4Kids)

一款面向儿童的"重力四子棋 (Connect-4)" Android 应用，基于 Kotlin + Jetpack Compose 构建。

## 技术栈

- **语言**：Kotlin 1.9.22
- **UI**：Jetpack Compose (Material3) + Compose BOM 2024.02.00
- **构建**：Gradle 8.5 (Kotlin DSL) + AGP 8.1.4
- **最低 SDK**：26 (Android 8.0)，目标 SDK：34
- **架构**：单 app 模块 + 包分层 + 手动依赖注入 (不使用 Hilt)

## 依赖

| 能力 | 依赖 |
| --- | --- |
| Compose UI / Material3 | androidx.compose BOM |
| Activity / ViewModel | activity-compose, lifecycle-viewmodel-compose |
| 导航 | navigation-compose |
| 本地持久化 | Room (runtime / ktx / compiler via KAPT) |
| 安全偏好 | androidx.security:security-crypto (EncryptedSharedPreferences) |
| 网络 | OkHttp + Retrofit + kotlinx-serialization 转换器 |
| 序列化 | kotlinx-serialization-json |
| 协程 | kotlinx-coroutines-android |
| 测试 | JUnit4, Compose UI Test, coroutines-test |

## 工程结构

```
connect4kids/
├── settings.gradle.kts          # 模块声明与仓库
├── build.gradle.kts             # 顶层插件声明
├── gradle.properties            # Gradle / AndroidX 配置
├── gradle/
│   ├── libs.versions.toml       # 版本目录 (统一依赖版本)
│   └── wrapper/
│       └── gradle-wrapper.properties
├── app/
│   ├── build.gradle.kts         # app 模块构建配置
│   ├── proguard-rules.pro
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   ├── res/             # 字符串 / 颜色 / 主题 / 图标
│       │   └── java/com/kids/connect4/
│       │       ├── Connect4App.kt        # Application 入口
│       │       ├── MainActivity.kt       # Compose 入口 (欢迎页)
│       │       ├── core/                 # 游戏引擎：Board 等
│       │       ├── ai/                   # 本地 AI 与大模型 AI
│       │       ├── data/                 # Room 持久化、偏好设置
│       │       ├── network/             # 大模型 API 接口
│       │       ├── ui/                   # Compose 界面
│       │       │   ├── theme/            # 颜色 / 字体 / 主题
│       │       │   ├── screens/          # 各页面
│       │       │   └── components/       # 可复用组件
│       │       └── di/                   # 手动依赖注入容器
│       ├── test/                         # 单元测试
│       └── androidTest/                  # 插桩测试
```

> 各包目录下均有 README 说明用途。当前为骨架阶段，仅 MainActivity 显示欢迎文本，
> 未包含 Board / AI 等业务逻辑代码。

## 如何构建

> 本仓库未包含 `gradlew` 脚本与 `gradle-wrapper.jar`。首次构建请先在已安装 Gradle 8.x 的环境中执行：
>
> ```bash
> gradle wrapper        # 生成 gradlew / gradlew.bat / gradle-wrapper.jar
> ```
>
> 之后即可使用包装器构建：

```bash
# Debug 构建
./gradlew assembleDebug

# 单元测试
./gradlew test

# 插桩测试 (需连接设备 / 模拟器)
./gradlew connectedAndroidTest
```

> Android SDK 路径需通过根目录的 `local.properties` 配置：
> ```
> sdk.dir=/path/to/Android/Sdk
> ```
