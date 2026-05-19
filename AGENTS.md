# AGENTS.md — erp-lite

## Project identity

- **Stack**: Spring Boot 4.0.6 + Java 25 + Lombok
- **Build**: Gradle (wrapper v9.4.1)
- **Group**: `com.psyduck`
- **Main class**: `com.psyduck.erp_lite.ErpLiteApplication`
- **Config**: `src/main/resources/application.yaml`

## Commands

```bash
./gradlew build          # compile + test
./gradlew test           # run tests only
./gradlew bootRun        # start dev server
./gradlew bootJar        # package executable jar
```

No separate lint, typecheck, or formatter commands are configured yet.

## Architecture notes

- This is a greenfield project — only the Spring Boot skeleton exists.
- No database, JPA, validation, or security dependencies yet.
- When adding new domain logic, follow the standard Spring layered pattern: `entity → repository → service → controller` under `com.psyduck.erp_lite.<domain>`.
- Lombok is on the classpath (compile + test); use it for boilerplate.

## Gotchas

- Spring Boot version is **4.0.6** (not 3.x) — some API migrations apply if referencing tutorials.
- Java toolchain is set to **25** — requires a JDK 25 runtime or Gradle will auto-provision one.
- No git repo initialized yet (`git init` not run).