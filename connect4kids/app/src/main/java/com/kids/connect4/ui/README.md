# ui/

Jetpack Compose 界面包，按职责分层：

- `theme/`：颜色 (Color.kt)、字体 (Type.kt)、主题 (Theme.kt)。已完成骨架。
- `screens/`：各页面级 Composable (主菜单、对局、设置、排行榜等)。
- `components/`：可复用的 UI 组件 (棋盘、棋子、按钮等)。

> 当前仅 `theme/` 已实现；`screens/` 与 `components/` 为占位目录，待后续填充业务逻辑。
