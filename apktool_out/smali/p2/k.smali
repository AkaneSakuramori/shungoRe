.class public final Lp2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/c0;


# instance fields
.field public final b:Li/a0;

.field public final c:Z


# direct methods
.method public constructor <init>(Li/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/k;->b:Li/a0;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lp2/k;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lm2/m;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;
    .locals 13

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0}, Lo2/d;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-class v5, Ljava/util/Properties;

    const/4 v6, 0x2

    if-ne v0, v5, :cond_1

    new-array v0, v6, [Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/String;

    aput-object v1, v0, v3

    aput-object v1, v0, v4

    goto :goto_0

    :cond_1
    instance-of v5, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v5, :cond_2

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v3

    :cond_2
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    invoke-static {v5}, Lc3/h;->V(Z)V

    invoke-static {v0, v1, v2}, Lo2/d;->e(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v2

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0, v1, v2, v5}, Lo2/d;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-array v0, v6, [Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/Object;

    aput-object v1, v0, v3

    aput-object v1, v0, v4

    :goto_0
    aget-object v1, v0, v3

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v1, v2, :cond_5

    const-class v2, Ljava/lang/Boolean;

    if-ne v1, v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {p1, v1}, Lm2/m;->c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v1

    :goto_1
    move-object v9, v1

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v1, Lp2/x;->c:Lm2/j;

    goto :goto_1

    :goto_3
    aget-object v1, v0, v4

    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {p1, v1}, Lm2/m;->c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v11

    iget-object v1, p0, Lp2/k;->b:Li/a0;

    invoke-virtual {v1, p2}, Li/a0;->r(Lcom/google/gson/reflect/TypeToken;)Lo2/n;

    move-result-object v12

    new-instance p2, Lp2/j;

    aget-object v8, v0, v3

    aget-object v10, v0, v4

    move-object v5, p2

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v5 .. v12}, Lp2/j;-><init>(Lp2/k;Lm2/m;Ljava/lang/reflect/Type;Lm2/b0;Ljava/lang/reflect/Type;Lm2/b0;Lo2/n;)V

    return-object p2
.end method
