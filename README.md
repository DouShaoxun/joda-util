# 自定义spring-boot-starter

## 使用

引入依赖

```xml

<dependency>
    <groupId>cn.cruder</groupId>
    <artifactId>joda-util-spring-boot-start</artifactId>
    <version>1.0.0</version>
</dependency>
```

配置

```yaml
cruder:
  joda:
    # 开启(默认为true)
    enable: true
    # 设置格式
    pattern-standard: yyyy-MM-dd HH:mm
```

注入使用

```java
    @Autowired
private JodaTimeService jodaTimeService;
```