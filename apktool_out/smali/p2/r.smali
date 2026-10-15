.class public final Lp2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/c0;


# instance fields
.field public final b:Lcom/google/gson/reflect/TypeToken;

.field public final c:Z

.field public final d:Ljava/lang/Class;

.field public final e:Lm2/p;


# direct methods
.method public constructor <init>(Lm2/p;Lcom/google/gson/reflect/TypeToken;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/r;->e:Lm2/p;

    iput-object p2, p0, Lp2/r;->b:Lcom/google/gson/reflect/TypeToken;

    iput-boolean p3, p0, Lp2/r;->c:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lp2/r;->d:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Lm2/m;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;
    .locals 2

    iget-object v0, p0, Lp2/r;->b:Lcom/google/gson/reflect/TypeToken;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Lcom/google/gson/reflect/TypeToken;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lp2/r;->c:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp2/r;->d:Ljava/lang/Class;

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    :goto_0
    new-instance v0, Lp2/s;

    iget-object v1, p0, Lp2/r;->e:Lm2/p;

    invoke-direct {v0, v1, p1, p2, p0}, Lp2/s;-><init>(Lm2/p;Lm2/m;Lcom/google/gson/reflect/TypeToken;Lm2/c0;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method
