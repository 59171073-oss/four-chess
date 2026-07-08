# Tasks

- [x] Task 1: 搭建 Android 工程骨架
  - [x] SubTask 1.1: 创建 Kotlin + Jetpack Compose 的 Android 工程，配置最低 SDK API 26、依赖（Compose、ViewModel、Room、OkHttp/Retrofit）
  - [x] SubTask 1.2: 建立项目模块分层（core 游戏引擎、ai 棋手、data 持久化、ui 界面、network 大模型接口）

- [ ] Task 2: 实现棋盘与对弈核心引擎（移植自参考项目 ailib.py 的 Board）
  - [ ] SubTask 2.1: 实现 Board 数据结构（7 列 × 6 行、重力下落、状态序列化）
  - [ ] SubTask 2.2: 实现胜负判定（横/竖/左斜/右斜四子连珠）与平局判定
  - [ ] SubTask 2.3: 实现落子、换边、悔棋、重开等对局控制接口，并编写单元测试

- [ ] Task 3: 实现本地 AI 与难度等级（移植自参考项目 ailib.py 的评估与搜索）
  - [ ] SubTask 3.1: 实现特征评估函数与 2 步搜索（Minimax/启发式）
  - [ ] SubTask 3.2: 实现入门/简单/普通/困难四档难度，通过搜索深度与策略随机性区分
  - [ ] SubTask 3.3: 编写 AI 行棋接口与难度单元测试

- [ ] Task 4: 嵌入大模型 AI 棋手
  - [ ] SubTask 4.1: 定义大模型 API 网络层（端点、请求/响应模型、超时与重试）
  - [ ] SubTask 4.2: 实现提示词构造：将棋盘状态、轮次、历史序列化为大模型可理解的提示
  - [ ] SubTask 4.3: 实现响应解析为列号并校验合法性，失败时回退到本地 AI
  - [ ] SubTask 4.4: 实现对话式复盘接口（对局结束后生成儿童易懂的复盘建议）

- [ ] Task 5: 实现自适应难度系统
  - [ ] SubTask 5.1: 设计儿童表现追踪（连胜/连败计数、胜率、失误统计）
  - [ ] SubTask 5.2: 实现难度自动升降规则（默认连胜2升、连败3降）与手动覆盖开关
  - [ ] SubTask 5.3: 将自适应难度参数作用于本地 AI 与大模型 AI 的强度提示

- [ ] Task 6: 实现棋路分析与针对性辅导
  - [ ] SubTask 6.1: 实现对局结束失误识别（未防守威胁、错失制胜、未控中心等）
  - [ ] SubTask 6.2: 实现棋路画像生成与持久化（常用列、攻防偏好、失误分布）
  - [ ] SubTask 6.3: 实现针对性提示卡片推送与复盘回放（标注失误点）
  - [ ] SubTask 6.4: 实现针对弱项的练习局面生成（可选）

- [ ] Task 7: 构建儿童友好的 UI/UX
  - [ ] SubTask 7.1: 实现主界面、对局界面、复盘界面（大字号、明亮配色、圆角、大点击区域）
  - [ ] SubTask 7.2: 实现落子动画、胜负动画、音效与鼓励性反馈
  - [ ] SubTask 7.3: 实现难度选择、自适应开关、AI 模式（本地/大模型）选择
  - [ ] SubTask 7.4: 实现设置页（API 端点/Key/模型名配置与连通性测试）

- [ ] Task 8: 数据持久化与玩家档案
  - [ ] SubTask 8.1: 使用 Room 实现对局历史、成绩统计、棋路画像的本地存储
  - [ ] SubTask 8.2: 实现 API Key 的安全本地存储（EncryptedSharedPreferences）
  - [ ] SubTask 8.3: 实现玩家档案与成绩看板界面

- [ ] Task 9: 测试与验收
  - [ ] SubTask 9.1: 核心引擎与 AI 的单元测试（胜负、难度、回退）
  - [ ] SubTask 9.2: 大模型 API 集成测试（含失败回退场景）
  - [ ] SubTask 9.3: UI 适配与儿童可用性自测（不同屏幕尺寸、可读性）

# Task Dependencies
- Task 2 依赖 Task 1（工程骨架）
- Task 3 依赖 Task 2（基于 Board 引擎）
- Task 4 依赖 Task 2（需棋盘状态序列化）与 Task 3（回退到本地 AI）
- Task 5 依赖 Task 3（难度等级）与 Task 6（失误统计用于评估）
- Task 6 依赖 Task 2（对局数据）
- Task 7 依赖 Task 2/3/4/5（对局与 AI 能力）
- Task 8 依赖 Task 6（持久化棋路画像）
- Task 9 依赖 Task 1-8
