.class public final Lp2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/c0;


# instance fields
.field public final synthetic b:I

.field public final c:Li/a0;


# direct methods
.method public synthetic constructor <init>(Li/a0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lp2/b;->b:I

    iput-object p1, p0, Lp2/b;->c:Li/a0;

    return-void
.end method

.method public static b(Li/a0;Lm2/m;Lcom/google/gson/reflect/TypeToken;Ln2/a;)Lm2/b0;
    .locals 2

    invoke-interface {p3}, Ln2/a;->value()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    invoke-virtual {p0, v0}, Li/a0;->r(Lcom/google/gson/reflect/TypeToken;)Lo2/n;

    move-result-object p0

    invoke-interface {p0}, Lo2/n;->d()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lm2/b0;

    if-eqz v0, :cond_0

    check-cast p0, Lm2/b0;

    goto :goto_1

    :cond_0
    instance-of v0, p0, Lm2/c0;

    if-eqz v0, :cond_1

    check-cast p0, Lm2/c0;

    invoke-interface {p0, p1, p2}, Lm2/c0;->a(Lm2/m;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object p0

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lm2/p;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Lm2/p;

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    new-instance v0, Lp2/s;

    invoke-direct {v0, p0, p1, p2, v1}, Lp2/s;-><init>(Lm2/p;Lm2/m;Lcom/google/gson/reflect/TypeToken;Lm2/c0;)V

    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_3

    invoke-interface {p3}, Ln2/a;->nullSafe()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lm2/b0;->a()Lm2/k;

    move-result-object p0

    :cond_3
    return-object p0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Invalid attempt to bind an instance of "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " as a @JsonAdapter for "

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lm2/m;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;
    .locals 6

    iget v0, p0, Lp2/b;->b:I

    iget-object v1, p0, Lp2/b;->c:Li/a0;

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v0

    const-class v3, Ln2/a;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ln2/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1, p1, p2, v0}, Lp2/b;->b(Li/a0;Lm2/m;Lcom/google/gson/reflect/TypeToken;Ln2/a;)Lm2/b0;

    move-result-object v2

    :goto_0
    return-object v2

    :pswitch_0
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ljava/util/Collection;

    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    instance-of v2, v0, Ljava/lang/reflect/WildcardType;

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v5

    :cond_2
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    invoke-static {v2}, Lc3/h;->V(Z)V

    invoke-static {v0, v3, v4}, Lo2/d;->e(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v2

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0, v3, v2, v4}, Lo2/d;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v2, :cond_3

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v5

    :cond_3
    instance-of v2, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_4

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v5

    goto :goto_1

    :cond_4
    const-class v0, Ljava/lang/Object;

    :goto_1
    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v2

    invoke-virtual {p1, v2}, Lm2/m;->c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v2

    invoke-virtual {v1, p2}, Li/a0;->r(Lcom/google/gson/reflect/TypeToken;)Lo2/n;

    move-result-object p2

    new-instance v1, Lcom/auth0/android/request/internal/h;

    invoke-direct {v1, p1, v0, v2, p2}, Lcom/auth0/android/request/internal/h;-><init>(Lm2/m;Ljava/lang/reflect/Type;Lm2/b0;Lo2/n;)V

    move-object v2, v1

    :goto_2
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
