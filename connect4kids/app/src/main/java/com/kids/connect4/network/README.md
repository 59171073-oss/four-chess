# network/

大模型 API 网络接口包。

预期内容：
- 基于 **Retrofit + OkHttp + kotlinx-serialization** 的 API 接口定义。
- 请求 / 响应 DTO。
- OkHttp 拦截器 (日志、鉴权)。
- API Key 从 `data/` 的安全偏好中读取，不硬编码。

> 本文件为包结构占位，骨架阶段未包含任何业务逻辑代码。
