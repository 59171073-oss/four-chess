# ai/

AI 对手包，提供两种 AI 实现：

- **本地 AI**：基于启发式 / Minimax / Alpha-Beta 剪枝的本地策略，离线可用。
- **大模型 AI**：通过 `network/` 调用大模型 API，将棋局状态序列化为提示词，解析模型返回的落子。

预期公共契约：统一的 `interface Player` 或 `interface AiEngine`。

> 本文件为包结构占位，骨架阶段未包含任何业务逻辑代码。
