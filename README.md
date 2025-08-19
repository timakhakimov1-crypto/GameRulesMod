# Game Rules Manager - Умный менеджер правил для Minecraft 1.7.10

## 🎯 О чем этот мод?

**Game Rules Manager** — это интеллектуальный мод для Minecraft 1.7.10, который автоматически настраивает игровые правила при первом входе в мир и запоминает эти настройки навсегда. Больше не нужно каждый раз вручную прописывать `/gamerule` команды!

## ✨ Возможности

### 🚀 Автоматическое применение
- Правила применяются **только один раз** при первом создании мира
- Мод запоминает, какие миры уже были обработаны
- Автоматическая работа — просто создайте мир и играйте

### ⚡ Мгновенное управление
- Команда `/gamerules reload` — применить правила если еще не применялись
- Команда `/gamerules reload force` — принудительно переприменить правила
- Команда `/gamerules list` — посмотреть список обработанных миров

### 📁 Простые конфиги
- **vanilla_rules.txt** — все ванильные правила Minecraft
- **modded_rules.txt** — кастомные правила для любых модов
- Человекочитаемый формат — обычные текстовые файлы
- Подробные комментарии и примеры

### 🛡️ Надежная работа
- Сохранение состояния между запусками игры
- Защита от повторного применения правил
- Совместимость с любыми модами 1.7.10

## 🎮 Как использовать

### Быстрый старт
1. Установите мод в папку `mods/`
2. Запустите игру — мод сам создаст конфиги
3. Отредактируйте файлы в `config/GameRulesMod/`
4. Создайте новый мир — правила применятся автоматически!

### Примеры настроек

**vanilla_rules.txt:**
```
keepInventory = true
mobGriefing = false
doFireTick = false
```

**modded_rules.txt:**
```
AllowFlight = true
NoHungerLoss = false
CustomSpawnRate = 2
```

### Команды сервера
```
/gamerules reload      # Применить правила если нужно
/grules reload force   # Принудительно переприменить
/gamerules list        # Показать обработанные миры
```

## 🔧 Для кого этот мод?

### 🎪 Владельцам серверов
- Стандартизируйте правила на всех мирах
- Избегайте ручной настройки для каждого игрока
- Легко меняйте правила через конфиги

### 🗺️ Создателям карт
- Гарантируйте нужные правила для вашего приключения
- Не надейтесь на память игроков
- Профессиональный подход к настройке

### 🏠 Одиночным игрокам
- Настройте правила один раз и навсегда
- Забудьте про ручные команды при каждом входе
- Создайте идеальную игровую среду

## 🌟 Особенности

- **Незаметная работа** — не влияет на производительность
- **Ультранадежный** — tested на различных сборках
- **Простой как дверь** — интуитивно понятный интерфейс
- **Мощный** — поддерживает любые комбинации правил

## 📦 Установка

1. Скачайте последнюю версию из [Releases](https://github.com/timakhakimov1-crypto/GameRulesMod/releases)
2. Поместите `GameRulesMod-1.1.jar` в папку `mods/`
3. Запустите Minecraft с Forge 1.7.10

## 🤝 Совместимость

- ✅ Minecraft 1.7.10
- ✅ Forge 10.13.4.1614
- ✅ Любые моды для 1.7.10
- ✅ Серверные сборки (точно не проверено)
- ✅ Одиночная игра

## 💡 Идеи для использования

### Для PvP серверов
```
keepInventory = false
naturalRegeneration = false
```

### Для мирных серверов
```
mobGriefing = false
keepInventory = true
```

### Для приключенческих карт
```
doDaylightCycle = false
doWeatherCycle = false
```

## 🚨 Важно знать

- Правила применяются только к **новым мирам**
- Для существующих миров используйте `/gamerules reload force`
- Изменения в конфигах требуют перезагрузки правил

---

**⭐ Нравится мод? Поставьте звезду на GitHub!**

*Создано с любовью к сообществу Minecraft 1.7.10*

# Game Rules Manager - Smart Rules Management for Minecraft 1.7.10

## 🎯 What is this mod?

**Game Rules Manager** is an intelligent mod for Minecraft 1.7.10 that automatically configures game rules upon first world entry and remembers these settings forever. No more manual `/gamerule` commands every time!

## ✨ Features

### 🚀 Automatic Application
- Rules applied **only once** during initial world creation
- Mod remembers which worlds have already been processed
- Fully automatic - just create a world and play

### ⚡ Instant Control
- `/gamerules reload` - apply rules if not already applied
- `/gamerules reload force` - force reapply rules
- `/gamerules list` - view processed worlds list

### 📁 Simple Configuration
- **vanilla_rules.txt** - all vanilla Minecraft rules
- **modded_rules.txt** - custom rules for any mods
- Human-readable format - simple text files
- Detailed comments and examples

### 🛡️ Reliable Operation
- State preservation between game sessions
- Protection against duplicate rule application
- Compatibility with all 1.7.10 mods

## 🎮 How to Use

### Quick Start
1. Install mod into `mods/` folder
2. Launch game - mod will create configs automatically
3. Edit files in `config/GameRulesMod/`
4. Create new world - rules will apply automatically!

### Configuration Examples

**vanilla_rules.txt:**
```ini
keepInventory = true
mobGriefing = false
doFireTick = false
```

**modded_rules.txt:**
```ini
AllowFlight = true
NoHungerLoss = false
CustomSpawnRate = 2
```

### Server Commands
```mcfunction
/gamerules reload      # Apply rules if needed
/grules reload force   # Force reapply rules
/gamerules list        # Show processed worlds
```

## 🔧 Who is this mod for?

### 🎪 Server Owners
- Standardize rules across all worlds
- Avoid manual configuration for each player
- Easily modify rules through configs

### 🗺️ Map Makers
- Guarantee intended rules for your adventure
- Don't rely on players' memory
- Professional rule setup approach

### 🏠 Single Players
- Configure rules once and forever
- Forget manual commands on each entry
- Create perfect gaming environment

## 🌟 Key Benefits

- **Stealth operation** - no performance impact
- **Ultra-reliable** - tested on various setups
- **Simple as door** - intuitive interface
- **Powerful** - supports any rule combinations

## 📦 Installation

1. Download latest version from [Releases](https://github.com/yourusername/GameRulesMod/releases)
2. Place `GameRulesMod-1.1.jar` into `mods/` folder
3. Launch Minecraft with Forge 1.7.10

## 🤝 Compatibility

- ✅ Minecraft 1.7.10
- ✅ Forge 10.13.4.1614
- ✅ All 1.7.10 mods
- ✅ Server installations (not exactly verified)
- ✅ Singleplayer

## 💡 Usage Ideas

### For PvP Servers
```ini
keepInventory = false
naturalRegeneration = false
```

### For Peaceful Servers
```ini
mobGriefing = false
keepInventory = true
```

### For Adventure Maps
```ini
doDaylightCycle = false
doWeatherCycle = false
```

## 🚨 Important Notes

- Rules apply only to **new worlds**
- Use `/gamerules reload force` for existing worlds
- Config changes require rules reload

---

**⭐ Like this mod? Give it a star on GitHub!**

*Crafted with love for Minecraft 1.7.10 community*
