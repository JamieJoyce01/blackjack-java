load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "Blackjack",
    srcs = glob(["src/main/java/com/blackjack/*.java"]),
    main_class = "com.blackjack.Run",
    deps = ["//:classes",
            "//:card"],
)


java_library(
    name = "classes",
    srcs = glob(["src/main/java/com/blackjack/classes/*.java"]),
)

java_library(
    name = "card",
    srcs = glob(["src/main/java/com/blackjack/card/*/*.java"]),
)